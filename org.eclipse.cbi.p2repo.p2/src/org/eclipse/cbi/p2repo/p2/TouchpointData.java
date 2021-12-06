/**
 * Copyright (c) 2021 Eclipse contributors and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.cbi.p2repo.p2;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.equinox.p2.metadata.ITouchpointData;
import org.eclipse.equinox.p2.metadata.ITouchpointInstruction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Touchpoint Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.cbi.p2repo.p2.TouchpointData#getInstructionMap <em>Instruction Map</em>}</li>
 * </ul>
 *
 * @see org.eclipse.cbi.p2repo.p2.P2Package#getTouchpointData()
 * @model superTypes="org.eclipse.cbi.p2repo.p2.ITouchpointData"
 * @generated
 */
public interface TouchpointData extends ITouchpointData {
	/**
	 * Returns the value of the '<em><b>Instruction Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.eclipse.equinox.p2.metadata.ITouchpointInstruction},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instruction Map</em>' map.
	 * @see org.eclipse.cbi.p2repo.p2.P2Package#getTouchpointData_InstructionMap()
	 * @model mapType="org.eclipse.cbi.p2repo.p2.InstructionMap&lt;org.eclipse.emf.ecore.EString, org.eclipse.cbi.p2repo.p2.ITouchpointInstruction&gt;"
	 * @generated
	 */
	EMap<String, ITouchpointInstruction> getInstructionMap();

} // TouchpointData
