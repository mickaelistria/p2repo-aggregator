/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build.build;

import java.net.URI;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path Vector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.b3.build.build.PathVector#getPaths <em>Paths</em>}</li>
 *   <li>{@link org.eclipse.b3.build.build.PathVector#getBasePath <em>Base Path</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.b3.build.build.B3BuildPackage#getPathVector()
 * @model
 * @generated
 */
public interface PathVector extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(URI)
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getPathVector_BasePath()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	URI getBasePath();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.build.PathVector#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(URI value);

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' attribute list.
	 * The list contents are of type {@link java.net.URI}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' attribute list.
	 * @see org.eclipse.b3.build.build.B3BuildPackage#getPathVector_Paths()
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.URI"
	 * @generated
	 */
	EList<URI> getPaths();

} // PathVector
