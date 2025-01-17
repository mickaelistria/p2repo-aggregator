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
package org.eclipse.cbi.p2repo.aggregator;

import org.eclipse.cbi.p2repo.p2.MetadataRepository;
import org.eclipse.emf.ecore.EFactory;
import org.eclipse.equinox.p2.metadata.IInstallableUnit;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.cbi.p2repo.aggregator.AggregatorPackage
 * @generated
 */
public interface AggregatorFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AggregatorFactory eINSTANCE = org.eclipse.cbi.p2repo.aggregator.impl.AggregatorFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aggregation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregation</em>'.
	 * @generated
	 */
	Aggregation createAggregation();

	/**
	 * Returns a new object of class '<em>Available Version</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Available Version</em>'.
	 * @generated
	 */
	AvailableVersion createAvailableVersion();

	/**
	 * Returns a new object of class '<em>Available Versions Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Available Versions Header</em>'.
	 * @generated
	 */
	AvailableVersionsHeader createAvailableVersionsHeader();

	/**
	 * Returns a new object of class '<em>Bundle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bundle</em>'.
	 * @generated
	 */
	Bundle createBundle();

	/**
	 * Returns a new object of class '<em>Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Category</em>'.
	 * @generated
	 */
	Category createCategory();

	/**
	 * Returns a new object of class '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Configuration</em>'.
	 * @generated
	 */
	Configuration createConfiguration();

	/**
	 * Returns a new object of class '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact</em>'.
	 * @generated
	 */
	Contact createContact();

	/**
	 * Returns a new object of class '<em>Contribution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contribution</em>'.
	 * @generated
	 */
	Contribution createContribution();

	/**
	 * Returns a new object of class '<em>Custom Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Category</em>'.
	 * @generated
	 */
	CustomCategory createCustomCategory();

	/**
	 * Returns a new object of class '<em>Description Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Description Provider</em>'.
	 * @generated
	 */
	DescriptionProvider createDescriptionProvider();

	/**
	 * Returns a new object of class '<em>Exclusion Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exclusion Rule</em>'.
	 * @generated
	 */
	ExclusionRule createExclusionRule();

	/**
	 * Returns a new object of class '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feature</em>'.
	 * @generated
	 */
	Feature createFeature();

	/**
	 * Returns a new object of class '<em>Infos Provider</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Infos Provider</em>'.
	 * @generated
	 */
	InfosProvider createInfosProvider();

	/**
	 * Returns a new object of class '<em>Mapped Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapped Repository</em>'.
	 * @generated
	 */
	MappedRepository createMappedRepository();

	/**
	 * Returns a new object of class '<em>Mapped Repository</em>'.
	 *
	 * @return a new object of class '<em>Mapped Repository</em>'.
	 * @generated NOT
	 */
	MappedRepository createMappedRepository(MetadataRepository mdr);

	/**
	 * Returns a new object of class '<em>Mapped Unit</em>'.
	 *
	 * @return a new object of class '<em>Mapped Unit</em>'.
	 * @generated NOT
	 */
	MappedUnit createMappedUnit(IInstallableUnit iu);

	MapRule createMapRule(IInstallableUnit iu, Class<? extends MapRule> ruleClass);

	/**
	 * Returns a new object of class '<em>Maven Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maven Item</em>'.
	 * @generated
	 */
	MavenItem createMavenItem();

	/**
	 * Returns a new object of class '<em>Maven Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Maven Mapping</em>'.
	 * @generated
	 */
	MavenMapping createMavenMapping();

	/**
	 * Returns a new object of class '<em>Metadata Repository Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Metadata Repository Reference</em>'.
	 * @generated
	 */
	MetadataRepositoryReference createMetadataRepositoryReference();

	/**
	 * Returns a new object of class '<em>Product</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Product</em>'.
	 * @generated
	 */
	Product createProduct();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	Property createProperty();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 *
	 * @return a new object of class '<em>Property</em>'.
	 * @generated NOT
	 */
	Property createProperty(String key, String value);

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Status</em>'.
	 * @generated
	 */
	Status createStatus();

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 *
	 * @return a new object of class '<em>Status</em>'.
	 * @generated NOT
	 */
	Status createStatus(StatusCode statusCode);

	/**
	 * Returns a new object of class '<em>Status</em>'.
	 *
	 * @return a new object of class '<em>Status</em>'.
	 * @generated NOT
	 */
	Status createStatus(StatusCode statusCode, String message);

	/**
	 * Returns a new object of class '<em>Validation Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Set</em>'.
	 * @generated
	 */
	ValidationSet createValidationSet();

	/**
	 * Returns a new object of class '<em>Valid Configurations Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Valid Configurations Rule</em>'.
	 * @generated
	 */
	ValidConfigurationsRule createValidConfigurationsRule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	AggregatorPackage getAggregatorPackage();

} // AggregatorFactory
