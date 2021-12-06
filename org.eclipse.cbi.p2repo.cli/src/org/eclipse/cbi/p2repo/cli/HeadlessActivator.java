/**
 * Copyright (c) 2006-2009, Cloudsmith Inc.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */

package org.eclipse.cbi.p2repo.cli;

import org.eclipse.core.runtime.Plugin;

/**
 * @author filip.hrbek@cloudsmith.com
 *
 */
public class HeadlessActivator extends Plugin {

	private static HeadlessActivator instance;

	public static HeadlessActivator getInstance() {
		return instance;
	}

	private boolean headless;

	public HeadlessActivator() {
		instance = this;
	}

	public boolean isHeadless() {
		return headless;
	}

	void setHeadless() {
		headless = true;
	}
}
