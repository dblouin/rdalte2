/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.util.FeatureMap;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Org Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSpecification <em>Specification</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getContractualElementEntries <em>Contractual Element Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getRefinementEntries <em>Refinement Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getOwnedRefinements <em>Owned Refinements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getOwnedContractualElements <em>Owned Contractual Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRdalOrgPackage()
 * @model abstract="true"
 * @generated
 */
public interface RdalOrgPackage extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Specification</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.Specification#getOwnedPackages <em>Owned Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specification</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specification</em>' container reference.
	 * @see #setSpecification(Specification)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRdalOrgPackage_Specification()
	 * @see fr.openpeople.rdal2.model.rdal.Specification#getOwnedPackages
	 * @model opposite="ownedPackages" required="true" transient="false"
	 * @generated
	 */
	Specification getSpecification();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSpecification <em>Specification</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specification</em>' container reference.
	 * @see #getSpecification()
	 * @generated
	 */
	void setSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Sub Packages</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Packages</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Packages</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRdalOrgPackage_SubPackages()
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<RdalOrgPackage> getSubPackages();

	/**
	 * Returns the value of the '<em><b>Contractual Element Entries</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contractual Element Entries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractual Element Entries</em>' attribute list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRdalOrgPackage_ContractualElementEntries()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" changeable="false"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getContractualElementEntries();

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSubPackages <em>Sub Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(RdalOrgPackage)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRdalOrgPackage_Parent()
	 * @see fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getSubPackages
	 * @model opposite="subPackages"
	 * @generated
	 */
	RdalOrgPackage getParent();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.RdalOrgPackage#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(RdalOrgPackage value);

	/**
	 * Returns the value of the '<em><b>Refinement Entries</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refinement Entries</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refinement Entries</em>' attribute list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRdalOrgPackage_RefinementEntries()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true" changeable="false"
	 *        extendedMetaData="kind='group'"
	 * @generated
	 */
	FeatureMap getRefinementEntries();

	/**
	 * Returns the value of the '<em><b>Owned Refinements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.ElementRefinement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Refinements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Refinements</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRdalOrgPackage_OwnedRefinements()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#refinementEntries'"
	 * @generated
	 */
	EList<ElementRefinement> getOwnedRefinements();

	/**
	 * Returns the value of the '<em><b>Owned Contractual Elements</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.TextualContractualElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Contractual Elements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Contractual Elements</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRdalOrgPackage_OwnedContractualElements()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TextualContractualElement> getOwnedContractualElements();

} // RdalOrgPackage
