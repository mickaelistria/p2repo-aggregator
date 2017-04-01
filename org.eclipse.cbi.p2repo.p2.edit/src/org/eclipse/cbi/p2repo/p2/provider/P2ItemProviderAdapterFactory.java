/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 * The code, documentation and other materials contained herein have been
 * licensed under the Eclipse Public License - v 1.0 by the copyright holder
 * listed above, as the Initial Contributor under such license. The text of
 * such license is available at www.eclipse.org.
 *
 */
package org.eclipse.cbi.p2repo.p2.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.cbi.p2repo.p2.util.P2AdapterFactory;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class P2ItemProviderAdapterFactory extends P2AdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.ArtifactKey} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ArtifactKeyItemProvider artifactKeyItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.Copyright} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected CopyrightItemProvider copyrightItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.MetadataRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected MetadataRepositoryItemProvider metadataRepositoryItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.InstallableUnit} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected InstallableUnitItemProvider installableUnitItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.InstallableUnitFragment} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected InstallableUnitFragmentItemProvider installableUnitFragmentItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.License} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected LicenseItemProvider licenseItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.ProvidedCapability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ProvidedCapabilityItemProvider providedCapabilityItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.RequiredCapability} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RequiredCapabilityItemProvider requiredCapabilityItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.Requirement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RequirementItemProvider requirementItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.TouchpointData} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TouchpointDataItemProvider touchpointDataItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.TouchpointInstruction} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TouchpointInstructionItemProvider touchpointInstructionItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.TouchpointType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected TouchpointTypeItemProvider touchpointTypeItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.UpdateDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected UpdateDescriptorItemProvider updateDescriptorItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected PropertyItemProvider propertyItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected InstructionMapItemProvider instructionMapItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.RepositoryReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RepositoryReferenceItemProvider repositoryReferenceItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.InstallableUnitPatch} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected InstallableUnitPatchItemProvider installableUnitPatchItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.RequirementChange} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected RequirementChangeItemProvider requirementChangeItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.ArtifactDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ArtifactDescriptorItemProvider artifactDescriptorItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.ArtifactRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ArtifactRepositoryItemProvider artifactRepositoryItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link java.util.Map.Entry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ArtifactsByKeyItemProvider artifactsByKeyItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.MappingRule} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected MappingRuleItemProvider mappingRuleItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.ProcessingStepDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected ProcessingStepDescriptorItemProvider processingStepDescriptorItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.SimpleArtifactRepository} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected SimpleArtifactRepositoryItemProvider simpleArtifactRepositoryItemProvider;

	/**
	 * This keeps track of the one adapter used for all {@link org.eclipse.cbi.p2repo.p2.SimpleArtifactDescriptor} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	protected SimpleArtifactDescriptorItemProvider simpleArtifactDescriptorItemProvider;

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	public P2ItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if(isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if(!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.ArtifactDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createArtifactDescriptorAdapter() {
		if(artifactDescriptorItemProvider == null) {
			artifactDescriptorItemProvider = new ArtifactDescriptorItemProvider(this);
		}

		return artifactDescriptorItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.ArtifactKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createArtifactKeyAdapter() {
		if(artifactKeyItemProvider == null) {
			artifactKeyItemProvider = new ArtifactKeyItemProvider(this);
		}

		return artifactKeyItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.ArtifactRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createArtifactRepositoryAdapter() {
		if(artifactRepositoryItemProvider == null) {
			artifactRepositoryItemProvider = new ArtifactRepositoryItemProvider(this);
		}

		return artifactRepositoryItemProvider;
	}

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createArtifactsByKeyAdapter() {
		if(artifactsByKeyItemProvider == null) {
			artifactsByKeyItemProvider = new ArtifactsByKeyItemProvider(this);
		}

		return artifactsByKeyItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.Copyright}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createCopyrightAdapter() {
		if(copyrightItemProvider == null) {
			copyrightItemProvider = new CopyrightItemProvider(this);
		}

		return copyrightItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.InstallableUnit}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createInstallableUnitAdapter() {
		if(installableUnitItemProvider == null) {
			installableUnitItemProvider = new InstallableUnitItemProvider(this);
		}

		return installableUnitItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.InstallableUnitFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createInstallableUnitFragmentAdapter() {
		if(installableUnitFragmentItemProvider == null) {
			installableUnitFragmentItemProvider = new InstallableUnitFragmentItemProvider(this);
		}

		return installableUnitFragmentItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.InstallableUnitPatch}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createInstallableUnitPatchAdapter() {
		if(installableUnitPatchItemProvider == null) {
			installableUnitPatchItemProvider = new InstallableUnitPatchItemProvider(this);
		}

		return installableUnitPatchItemProvider;
	}

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createInstructionMapAdapter() {
		if(instructionMapItemProvider == null) {
			instructionMapItemProvider = new InstructionMapItemProvider(this);
		}

		return instructionMapItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.License}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createLicenseAdapter() {
		if(licenseItemProvider == null) {
			licenseItemProvider = new LicenseItemProvider(this);
		}

		return licenseItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.MappingRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createMappingRuleAdapter() {
		if(mappingRuleItemProvider == null) {
			mappingRuleItemProvider = new MappingRuleItemProvider(this);
		}

		return mappingRuleItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.MetadataRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createMetadataRepositoryAdapter() {
		if(metadataRepositoryItemProvider == null) {
			metadataRepositoryItemProvider = new MetadataRepositoryItemProvider(this);
		}

		return metadataRepositoryItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.ProcessingStepDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createProcessingStepDescriptorAdapter() {
		if(processingStepDescriptorItemProvider == null) {
			processingStepDescriptorItemProvider = new ProcessingStepDescriptorItemProvider(this);
		}

		return processingStepDescriptorItemProvider;
	}

	/**
	 * This creates an adapter for a {@link java.util.Map.Entry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createPropertyAdapter() {
		if(propertyItemProvider == null) {
			propertyItemProvider = new PropertyItemProvider(this);
		}

		return propertyItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.ProvidedCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createProvidedCapabilityAdapter() {
		if(providedCapabilityItemProvider == null) {
			providedCapabilityItemProvider = new ProvidedCapabilityItemProvider(this);
		}

		return providedCapabilityItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.RepositoryReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createRepositoryReferenceAdapter() {
		if(repositoryReferenceItemProvider == null) {
			repositoryReferenceItemProvider = new RepositoryReferenceItemProvider(this);
		}

		return repositoryReferenceItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.RequiredCapability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createRequiredCapabilityAdapter() {
		if(requiredCapabilityItemProvider == null) {
			requiredCapabilityItemProvider = new RequiredCapabilityItemProvider(this);
		}

		return requiredCapabilityItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createRequirementAdapter() {
		if(requirementItemProvider == null) {
			requirementItemProvider = new RequirementItemProvider(this);
		}

		return requirementItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.RequirementChange}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createRequirementChangeAdapter() {
		if(requirementChangeItemProvider == null) {
			requirementChangeItemProvider = new RequirementChangeItemProvider(this);
		}

		return requirementChangeItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.SimpleArtifactDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createSimpleArtifactDescriptorAdapter() {
		if(simpleArtifactDescriptorItemProvider == null) {
			simpleArtifactDescriptorItemProvider = new SimpleArtifactDescriptorItemProvider(this);
		}

		return simpleArtifactDescriptorItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.SimpleArtifactRepository}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createSimpleArtifactRepositoryAdapter() {
		if(simpleArtifactRepositoryItemProvider == null) {
			simpleArtifactRepositoryItemProvider = new SimpleArtifactRepositoryItemProvider(this);
		}

		return simpleArtifactRepositoryItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.TouchpointData}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createTouchpointDataAdapter() {
		if(touchpointDataItemProvider == null) {
			touchpointDataItemProvider = new TouchpointDataItemProvider(this);
		}

		return touchpointDataItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.TouchpointInstruction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createTouchpointInstructionAdapter() {
		if(touchpointInstructionItemProvider == null) {
			touchpointInstructionItemProvider = new TouchpointInstructionItemProvider(this);
		}

		return touchpointInstructionItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.TouchpointType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createTouchpointTypeAdapter() {
		if(touchpointTypeItemProvider == null) {
			touchpointTypeItemProvider = new TouchpointTypeItemProvider(this);
		}

		return touchpointTypeItemProvider;
	}

	/**
	 * This creates an adapter for a {@link org.eclipse.cbi.p2repo.p2.UpdateDescriptor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public Adapter createUpdateDescriptorAdapter() {
		if(updateDescriptorItemProvider == null) {
			updateDescriptorItemProvider = new UpdateDescriptorItemProvider(this);
		}

		return updateDescriptorItemProvider;
	}

	/**
	 * This disposes all of the item providers created by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void dispose() {
		if(artifactKeyItemProvider != null)
			artifactKeyItemProvider.dispose();
		if(artifactDescriptorItemProvider != null)
			artifactDescriptorItemProvider.dispose();
		if(artifactRepositoryItemProvider != null)
			artifactRepositoryItemProvider.dispose();
		if(artifactsByKeyItemProvider != null)
			artifactsByKeyItemProvider.dispose();
		if(copyrightItemProvider != null)
			copyrightItemProvider.dispose();
		if(installableUnitItemProvider != null)
			installableUnitItemProvider.dispose();
		if(installableUnitFragmentItemProvider != null)
			installableUnitFragmentItemProvider.dispose();
		if(installableUnitPatchItemProvider != null)
			installableUnitPatchItemProvider.dispose();
		if(instructionMapItemProvider != null)
			instructionMapItemProvider.dispose();
		if(licenseItemProvider != null)
			licenseItemProvider.dispose();
		if(mappingRuleItemProvider != null)
			mappingRuleItemProvider.dispose();
		if(metadataRepositoryItemProvider != null)
			metadataRepositoryItemProvider.dispose();
		if(processingStepDescriptorItemProvider != null)
			processingStepDescriptorItemProvider.dispose();
		if(propertyItemProvider != null)
			propertyItemProvider.dispose();
		if(providedCapabilityItemProvider != null)
			providedCapabilityItemProvider.dispose();
		if(repositoryReferenceItemProvider != null)
			repositoryReferenceItemProvider.dispose();
		if(requiredCapabilityItemProvider != null)
			requiredCapabilityItemProvider.dispose();
		if(requirementItemProvider != null)
			requirementItemProvider.dispose();
		if(requirementChangeItemProvider != null)
			requirementChangeItemProvider.dispose();
		if(simpleArtifactRepositoryItemProvider != null)
			simpleArtifactRepositoryItemProvider.dispose();
		if(simpleArtifactDescriptorItemProvider != null)
			simpleArtifactDescriptorItemProvider.dispose();
		if(touchpointDataItemProvider != null)
			touchpointDataItemProvider.dispose();
		if(touchpointInstructionItemProvider != null)
			touchpointInstructionItemProvider.dispose();
		if(touchpointTypeItemProvider != null)
			touchpointTypeItemProvider.dispose();
		if(updateDescriptorItemProvider != null)
			updateDescriptorItemProvider.dispose();
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if(parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null
				? this
				: parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 *
	 * @generated
	 */
	@Override
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

}
