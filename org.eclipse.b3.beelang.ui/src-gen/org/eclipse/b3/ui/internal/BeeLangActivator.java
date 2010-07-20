/*
 * generated by Xtext
 */
package org.eclipse.b3.ui.internal;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.util.Modules;

/**
 * Generated
 */
public class BeeLangActivator extends AbstractUIPlugin {

	public static BeeLangActivator getInstance() {
		return INSTANCE;
	}

	private Map<String, Injector> injectors = new HashMap<String, Injector>();

	private static BeeLangActivator INSTANCE;

	public Injector getInjector(String languageName) {
		return injectors.get(languageName);
	}

	protected Module getRuntimeModule(String grammar) {

		if("org.eclipse.b3.BeeLang".equals(grammar)) {
			return new org.eclipse.b3.BeeLangRuntimeModule();
		}

		throw new IllegalArgumentException(grammar);
	}

	protected Module getSharedStateModule() {
		return new org.eclipse.xtext.ui.shared.SharedStateModule();
	}

	protected Module getUiModule(String grammar) {

		if("org.eclipse.b3.BeeLang".equals(grammar)) {
			return new org.eclipse.b3.ui.BeeLangUiModule(this);
		}

		throw new IllegalArgumentException(grammar);
	}

	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
		try {

			injectors.put(
				"org.eclipse.b3.BeeLang",
				Guice.createInjector(Modules.override(
					Modules.override(getRuntimeModule("org.eclipse.b3.BeeLang")).with(
						getUiModule("org.eclipse.b3.BeeLang"))).with(getSharedStateModule())));

		}
		catch(Exception e) {
			Logger.getLogger(getClass()).error(e.getMessage(), e);
			throw e;
		}
	}

}
