/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import org.eclipse.b3.backend.evaluator.b3backend.BConcernContext;
import org.eclipse.b3.backend.evaluator.b3backend.BPropertySet;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Build Concern Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.BuildConcernContext#getDefaultPropertiesRemovals <em>Default Properties Removals</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.BuildConcernContext#getDefaultPropertiesAdditions <em>Default Properties Additions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildConcernContext()
 * @model
 * @generated
 */
public interface BuildConcernContext extends BConcernContext, IProvidedCapabilityContainer {

	/**
	 * Returns the value of the '<em><b>Default Properties Removals</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Properties Removals</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Properties Removals</em>' attribute list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildConcernContext_DefaultPropertiesRemovals()
	 * @model
	 * @generated
	 */
	EList<String> getDefaultPropertiesRemovals();

	/**
	 * Returns the value of the '<em><b>Default Properties Additions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Properties Additions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Properties Additions</em>' containment reference.
	 * @see #setDefaultPropertiesAdditions(BPropertySet)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getBuildConcernContext_DefaultPropertiesAdditions()
	 * @model containment="true"
	 * @generated
	 */
	BPropertySet getDefaultPropertiesAdditions();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.BuildConcernContext#getDefaultPropertiesAdditions <em>Default Properties Additions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Properties Additions</em>' containment reference.
	 * @see #getDefaultPropertiesAdditions()
	 * @generated
	 */
	void setDefaultPropertiesAdditions(BPropertySet value);
} // BuildConcernContext
