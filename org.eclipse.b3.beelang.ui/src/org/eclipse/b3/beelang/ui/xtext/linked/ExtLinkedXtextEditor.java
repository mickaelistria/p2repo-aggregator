/**
 * Copyright (c) 2010, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 */

package org.eclipse.b3.beelang.ui.xtext.linked;

import java.io.File;

import org.eclipse.core.filesystem.EFS;
import org.eclipse.core.filesystem.IFileStore;
import org.eclipse.core.filesystem.URIUtil;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.ui.URIEditorInput;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IURIEditorInput;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.FileStoreEditorInput;
import org.eclipse.ui.internal.editors.text.EditorsPlugin;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.texteditor.IDocumentProvider;
import org.eclipse.xtext.ui.editor.XtextEditor;

import com.google.inject.Inject;

/**
 * This class extends the standard XtextEditor to make it capable of
 * opening and saving external files, by managing them as linked resources.
 */
public class ExtLinkedXtextEditor extends XtextEditor {
	private static final String AUTOLINK_PROJECT_NAME = "AutoLinked_B3ExternalFiles";

	private static final String ENCODING_UTF8 = "utf-8";

	@Inject
	private IExtXtextEditorCustomizer editorCustomizer;

	/**
	 * Does nothing except server as a place to set a breakpoint :)
	 */
	public ExtLinkedXtextEditor() {
		super();
	}

	private void createLink(IProject project, IFile linkFile, java.net.URI uri) throws CoreException {
		IPath path = linkFile.getFullPath();

		IPath folders = path.removeLastSegments(1).removeFirstSegments(1);
		IPath checkPath = Path.ROOT;
		int segmentCount = folders.segmentCount();
		for(int i = 0; i < segmentCount; i++) {
			checkPath = checkPath.addTrailingSeparator().append(folders.segment(i));
			IFolder folder = project.getFolder(checkPath);
			if(!folder.exists())
				folder.create(true, true, null);
		}
		linkFile.createLink(uri, IResource.ALLOW_MISSING_LOCAL, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.xtext.ui.editor.XtextEditor#dispose()
	 */
	@Override
	public void dispose() {
		// Unlink the input if it was linked
		IEditorInput input = getEditorInput();
		if(input instanceof IFileEditorInput) {
			IFile file = ((IFileEditorInput) input).getFile();
			if(file.isLinked()) {
				file.getProject().getName().equals(AUTOLINK_PROJECT_NAME);
				try {
					// if the editor is disposed because workbench is shutting down, it is NOT a good
					// idea to delete the link
					if(PlatformUI.isWorkbenchRunning() && !PlatformUI.getWorkbench().isClosing())
						file.delete(true, null);
				}
				catch(CoreException e) {
					// Nothing to do really, it will be recreated/refreshed later if ever used - some garbage may stay behind...
					// TODO: log the issue
					e.printStackTrace();
				}
			}
		}
		super.dispose();
	}

	/**
	 * Overridden to allow customization of editor context menu via injected handler
	 * 
	 * @see org.eclipse.ui.editors.text.TextEditor#editorContextMenuAboutToShow(org.eclipse.jface.action.IMenuManager)
	 */
	@Override
	protected void editorContextMenuAboutToShow(IMenuManager menu) {
		super.editorContextMenuAboutToShow(menu);
		editorCustomizer.customizeEditorContextMenu(menu);

	}

	private IFile getWorkspaceFile(IFileStore fileStore) {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFile[] files = workspaceRoot.findFilesForLocationURI(fileStore.toURI());
		if(files != null && files.length == 1)
			return files[0];
		return null;
	}

	/**
	 * Translates an incoming IEditorInput being an FilestoreEditorInput, or IURIEditorInput
	 * that is not also a IFileEditorInput.
	 * FilestoreEditorInput is used when opening external files in an IDE environment.
	 * The result is that the regular XtextEditor gets an IEFSEditorInput which is also an
	 * IStorageEditorInput.
	 */
	@Override
	public void init(IEditorSite site, IEditorInput input) throws PartInitException {
		// THE ISSUE HERE:
		// In the IDE, the File Open Dialog (and elsewhere) uses a FilestoreEditorInput class
		// which is an IDE specific implementation.
		// The state at this point:
		// 1. When creating a file, the IEditorInput is an IURIEditorInput
		// 2. The only (non IDE specific) interface implemented by FilestoreEditorInput is IURIEditorInput
		// 3. The creation of a file is however also an IFileEditorInput
		//
		// Remedy:
		if(input instanceof IURIEditorInput && !(input instanceof IFileEditorInput)) {
			java.net.URI uri = ((IURIEditorInput) input).getURI();
			String name = ((IURIEditorInput) input).getName();
			// Check if this is linkable input
			if(uri.getScheme().equals("file")) {
				IFile linkedFile = obtainLink(uri);
				IFileEditorInput linkedInput = new FileEditorInput(linkedFile);
				super.init(site, linkedInput);

			}
			else {
				// use EMF URI (readonly) input - will open without validation though...
				// (Could be improved, i.e. perform a download, make readonly, and keep in project,
				// or stored in tmp, and processed as the other linked resources..
				URIEditorInput uriInput = new URIEditorInput(URI.createURI(uri.toString()), name);
				super.init(site, uriInput);
				return;
			}
			return;
		}
		super.init(site, input);
	}

	/**
	 * Throws WrappedException - the URI must refer to an existing file!
	 * 
	 * @param uri
	 * @return
	 */
	private IFile obtainLink(java.net.URI uri) {
		try {
			IWorkspace ws = ResourcesPlugin.getWorkspace();
			// get, or create project if non existing
			IProject project = ws.getRoot().getProject(AUTOLINK_PROJECT_NAME);
			boolean newProject = false;
			if(!project.exists()) {
				project.create(null);
				newProject = true;
			}
			if(!project.isOpen()) {
				project.open(null);
				project.setHidden(true);
			}

			if(newProject)
				project.setDefaultCharset(ENCODING_UTF8, new NullProgressMonitor());

			// path in project that is the same as the external file's path
			IFile linkFile = project.getFile(uri.getPath());
			if(linkFile.exists())
				linkFile.refreshLocal(1, null); // don't know if needed (or should be avoided...)
			else {
				// create the link
				createLink(project, linkFile, uri);
				// linkFile.createLink(uri, IResource.ALLOW_MISSING_LOCAL, null);
			}
			return linkFile;

			// IPath location = new Path(name);
			// IFile file = project.getFile(location.lastSegment());
			// file.createLink(location, IResource.NONE, null);
		}
		catch(CoreException e) {
			throw new WrappedException(e);
		}
	}

	// SaveAs support for linked files - saves them on local disc, not to workspace if file is in special
	// hidden external file link project.
	@Override
	protected void performSaveAs(IProgressMonitor progressMonitor) {

		Shell shell = getSite().getShell();
		final IEditorInput input = getEditorInput();

		// Customize save as if the file is linked, and it is in the special external link project
		//
		if(input instanceof IFileEditorInput && ((IFileEditorInput) input).getFile().isLinked() &&
				((IFileEditorInput) input).getFile().getProject().getName().equals(AUTOLINK_PROJECT_NAME)) {
			final IEditorInput newInput;
			IDocumentProvider provider = getDocumentProvider();

			FileDialog dialog = new FileDialog(shell, SWT.SAVE);
			IPath oldPath = URIUtil.toPath(((IURIEditorInput) input).getURI());
			if(oldPath != null) {
				dialog.setFileName(oldPath.lastSegment());
				dialog.setFilterPath(oldPath.toOSString());
			}

			dialog.setFilterExtensions(new String[] { "*.b3", "*.*" });
			String path = dialog.open();
			if(path == null) {
				if(progressMonitor != null)
					progressMonitor.setCanceled(true);
				return;
			}

			// Check whether file exists and if so, confirm overwrite
			final File localFile = new File(path);
			if(localFile.exists()) {
				MessageDialog overwriteDialog = new MessageDialog(shell, "Save As", null, path +
						" already exists.\nDo you want to replace it?", MessageDialog.WARNING, new String[] {
						IDialogConstants.YES_LABEL, IDialogConstants.NO_LABEL }, 1); // 'No' is the default
				if(overwriteDialog.open() != Window.OK) {
					if(progressMonitor != null) {
						progressMonitor.setCanceled(true);
						return;
					}
				}
			}

			IFileStore fileStore;
			try {
				fileStore = EFS.getStore(localFile.toURI());
			}
			catch(CoreException ex) {
				EditorsPlugin.log(ex.getStatus());
				String title = "Problems During Save As...";
				String msg = "Save could not be completed. " + ex.getMessage();
				MessageDialog.openError(shell, title, msg);
				return;
			}

			IFile file = getWorkspaceFile(fileStore);
			if(file != null)
				newInput = new FileEditorInput(file);
			else {
				IURIEditorInput uriInput = new FileStoreEditorInput(fileStore);
				java.net.URI uri = uriInput.getURI();
				IFile linkedFile = obtainLink(uri);

				newInput = new FileEditorInput(linkedFile);
			}

			if(provider == null) {
				// editor has programmatically been closed while the dialog was open
				return;
			}

			boolean success = false;
			try {

				provider.aboutToChange(newInput);
				provider.saveDocument(progressMonitor, newInput, provider.getDocument(input), true);
				success = true;

			}
			catch(CoreException x) {
				final IStatus status = x.getStatus();
				if(status == null || status.getSeverity() != IStatus.CANCEL) {
					String title = "Problems During Save As...";
					String msg = "Save could not be completed. " + x.getMessage();
					MessageDialog.openError(shell, title, msg);
				}
			}
			finally {
				provider.changed(newInput);
				if(success)
					setInput(newInput);
			}

			if(progressMonitor != null)
				progressMonitor.setCanceled(!success);

			return;
		}

		super.performSaveAs(progressMonitor);
	}
}
