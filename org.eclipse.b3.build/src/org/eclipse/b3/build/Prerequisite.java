/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.build;

import java.util.Iterator;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BExpression;

import org.eclipse.b3.backend.evaluator.b3backend.BWithExpression;
import org.eclipse.b3.backend.evaluator.b3backend.ITypedValue;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prerequisite</b></em>'.
 * <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link org.eclipse.b3.build.Prerequisite#getCondExpr <em>Cond Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.Prerequisite#getWithExpr <em>With Expr</em>}</li>
 * <li>{@link org.eclipse.b3.build.Prerequisite#getBuildResult <em>Build Result</em>}</li>
 * </ul>
 * </p>
 * 
 * @see org.eclipse.b3.build.B3BuildPackage#getPrerequisite()
 * @model
 * @generated
 */
public interface Prerequisite extends ITypedValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the unfiltered requirements as a flattened list.
	 * <!-- end-model-doc -->
	 * 
	 * @model kind="operation" exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	EList<BuilderReference> getBuilderReferences() throws Throwable;

	/**
	 * Returns the value of the '<em><b>Build Result</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Build Result</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Build Result</em>' containment reference.
	 * @see #setBuildResult(BuildResultReference)
	 * @see org.eclipse.b3.build.B3BuildPackage#getPrerequisite_BuildResult()
	 * @model containment="true"
	 * @generated
	 */
	BuildResultReference getBuildResult();

	/**
	 * Returns the value of the '<em><b>Cond Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cond Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Cond Expr</em>' containment reference.
	 * @see #setCondExpr(BExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getPrerequisite_CondExpr()
	 * @model containment="true"
	 * @generated
	 */
	BExpression getCondExpr();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns an iterator over the effective references to builders in this, and other units.
	 * <!-- end-model-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaIterator<org.eclipse.b3.build.EffectiveBuilderReferenceFacade>"
	 *        exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Iterator<EffectiveBuilderReferenceFacade> getEffectiveBuilderReferences(BExecutionContext ctx) throws Throwable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @model dataType="org.eclipse.b3.backend.evaluator.b3backend.JavaIterator<org.eclipse.b3.build.EffectiveRequirementFacade>"
	 *        exceptions="org.eclipse.b3.backend.evaluator.b3backend.Throwable"
	 * @generated
	 */
	Iterator<EffectiveRequirementFacade> getEffectiveRequirements(BExecutionContext ctx) throws Throwable;

	/**
	 * Returns the value of the '<em><b>With Expr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>With Expr</em>' containment reference isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>With Expr</em>' containment reference.
	 * @see #setWithExpr(BWithExpression)
	 * @see org.eclipse.b3.build.B3BuildPackage#getPrerequisite_WithExpr()
	 * @model containment="true"
	 * @generated
	 */
	BWithExpression getWithExpr();

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Prerequisite#getBuildResult <em>Build Result</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Build Result</em>' containment reference.
	 * @see #getBuildResult()
	 * @generated
	 */
	void setBuildResult(BuildResultReference value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Prerequisite#getCondExpr <em>Cond Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Cond Expr</em>' containment reference.
	 * @see #getCondExpr()
	 * @generated
	 */
	void setCondExpr(BExpression value);

	/**
	 * Sets the value of the '{@link org.eclipse.b3.build.Prerequisite#getWithExpr <em>With Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>With Expr</em>' containment reference.
	 * @see #getWithExpr()
	 * @generated
	 */
	void setWithExpr(BWithExpression value);

} // Prerequisite