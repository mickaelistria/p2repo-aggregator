/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.eclipse.b3.backend.evaluator.b3backend.tests;

import junit.framework.AssertionFailedError;
import junit.textui.TestRunner;

import org.eclipse.b3.backend.core.B3Engine;
import org.eclipse.b3.backend.core.B3UserException;
import org.eclipse.b3.backend.evaluator.b3backend.B3backendFactory;
import org.eclipse.b3.backend.evaluator.b3backend.BExecutionContext;
import org.eclipse.b3.backend.evaluator.b3backend.BLiteralExpression;
import org.eclipse.b3.backend.evaluator.b3backend.BThrowExpression;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>BThrow Expression</b></em>'.
 * <!-- end-user-doc -->
 * 
 * @generated
 */
public class BThrowExpressionTest extends BUnaryExpressionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static final String copyright = "Copyright (c) 2009, Cloudsmith Inc and others.\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\rContributors:\n- Cloudsmith Inc - initial API and implementation.\r";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(BThrowExpressionTest.class);
	}

	/**
	 * Constructs a new BThrow Expression test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public BThrowExpressionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this BThrow Expression test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected BThrowExpression getFixture() {
		return (BThrowExpression) fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(B3backendFactory.eINSTANCE.createBThrowExpression());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	@Override
	public void testEvaluate__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;

			BThrowExpression eThrow = b3.createBThrowExpression();
			BLiteralExpression e;
			eThrow.setExpr(e = b3.createBLiteralExpression());
			e.setValue("Ooops! My Bad.");
			eThrow.evaluate(ctx);

		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(B3UserException u) {
			assertEquals("Ooops! My Bad.", u.getData());
		}
		catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

	@Override
	public void testGetDeclaredType__BExecutionContext() {
		try {
			B3Engine engine = new B3Engine();
			BExecutionContext ctx = engine.getContext();
			B3backendFactory b3 = B3backendFactory.eINSTANCE;

			BThrowExpression eThrow = b3.createBThrowExpression();
			BLiteralExpression e;
			eThrow.setExpr(e = b3.createBLiteralExpression());
			e.setValue("Ooops! My Bad.");

			// Note - Throw never evaluates to a value, always returns Object.class
			//
			assertEquals(Object.class, eThrow.getDeclaredType(ctx));
		}
		catch(AssertionFailedError e) {
			throw e;
		}
		catch(Throwable t) {
			t.printStackTrace();
			fail();
		}
	}

	@Override
	public void testGetLValue__BExecutionContext() {
		super.assertLValShouldFail();
	}
} // BThrowExpressionTest
