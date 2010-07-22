/**
 * Copyright (c) 2010, Cloudsmith Inc and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * - Cloudsmith Inc - initial API and implementation.
 */
package org.eclipse.b3.build.internal;

import org.eclipse.b3.backend.core.B3BackendActivator;
import org.eclipse.b3.build.BuildUnit;
import org.objectweb.asm.ClassWriter;
import org.objectweb.asm.Opcodes;

public class BuildUtilsDynamicClassLoader extends ClassLoader implements Opcodes {
	public BuildUtilsDynamicClassLoader(ClassLoader parent) {
		super(parent);
	}

	public Class<?> defineClass(String name, byte[] b) {
		return defineClass(name, b, 0, b.length);
	}

	private String dottedToInternal(String str) {
		return str.replaceAll("\\.", "/");
	}

	@SuppressWarnings("unchecked")
	@Override
	public synchronized Class<?> findClass(String name) throws ClassNotFoundException {
		if(name.startsWith(BuildUnitUtils.BUILDUNIT_INTERFACE_PREFIX)) {
			ClassWriter cw = new ClassWriter(0);
			cw.visit(V1_5, ACC_PUBLIC + ACC_ABSTRACT + ACC_INTERFACE, // access
			dottedToInternal(name), // interface name in internal form
				null, // generics
				"java/lang/Object", // superclass
				new String[] { // extended interfaces
				"org/eclipse/b3/build/BuildUnit" });
			cw.visitEnd();
			byte bytes[] = cw.toByteArray();
			Class<? extends BuildUnit> clazz = (Class<? extends BuildUnit>) (defineClass(name, bytes, 0, bytes.length));
			return clazz;
		}
		try {
			return B3BackendActivator.instance.getBundle().loadClass(name);
		}
		catch(ClassNotFoundException e) {
			// do nothing, try the super class loader
		}
		return super.findClass(name);
	}
}
