/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getOwnedVerifiedBy <em>Owned Verified By</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getRisk <em>Risk</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getPackage <em>Package</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractRequirement()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRequirement extends TextualContractualElement, RefineableElement, SatisfiableElement, VerifiableElement {
	/**
	 * Returns the value of the '<em><b>Owned Verified By</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.VerificationActivity}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#getRequirements <em>Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Verified By</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Verified By</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractRequirement_OwnedVerifiedBy()
	 * @see fr.openpeople.rdal2.model.rdal.VerificationActivity#getRequirements
	 * @model opposite="requirements" containment="true"
	 *        annotation="gmf.link target.decoration='arrow' style='dash'"
	 * @generated
	 */
	EList<VerificationActivity> getOwnedVerifiedBy();

	/**
	 * Returns the value of the '<em><b>Risk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Risk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Risk</em>' attribute.
	 * @see #setRisk(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractRequirement_Risk()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio"
	 * @generated
	 */
	Float getRisk();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getRisk <em>Risk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Risk</em>' attribute.
	 * @see #getRisk()
	 * @generated
	 */
	void setRisk(Float value);

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.RequirementsPackage#getOwnedRequirements <em>Owned Requirements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(RequirementsPackage)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractRequirement_Package()
	 * @see fr.openpeople.rdal2.model.rdal.RequirementsPackage#getOwnedRequirements
	 * @model opposite="ownedRequirements" required="true" transient="false"
	 * @generated
	 */
	RequirementsPackage getPackage();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(RequirementsPackage value);

} // AbstractRequirement
