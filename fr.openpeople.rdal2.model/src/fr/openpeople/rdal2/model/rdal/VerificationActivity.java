/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import fr.labsticc.framework.settings.model.settings.Category;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#getExternalRefs <em>External Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#isPassed <em>Passed</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#getRequirements <em>Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#getCategory <em>Category</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getVerificationActivity()
 * @model
 * @generated
 */
public interface VerificationActivity extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Category)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getVerificationActivity_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

	/**
	 * Returns the value of the '<em><b>External Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>External Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>External Refs</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getVerificationActivity_ExternalRefs()
	 * @model
	 * @generated
	 */
	EList<EObject> getExternalRefs();

	/**
	 * Returns the value of the '<em><b>Passed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Passed</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Passed</em>' attribute.
	 * @see #setPassed(boolean)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getVerificationActivity_Passed()
	 * @model required="true"
	 * @generated
	 */
	boolean isPassed();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#isPassed <em>Passed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Passed</em>' attribute.
	 * @see #isPassed()
	 * @generated
	 */
	void setPassed(boolean value);

	/**
	 * Returns the value of the '<em><b>Requirements</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.AbstractRequirement#getOwnedVerifiedBy <em>Owned Verified By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirements</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirements</em>' container reference.
	 * @see #setRequirements(AbstractRequirement)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getVerificationActivity_Requirements()
	 * @see fr.openpeople.rdal2.model.rdal.AbstractRequirement#getOwnedVerifiedBy
	 * @model opposite="ownedVerifiedBy" transient="false"
	 * @generated
	 */
	AbstractRequirement getRequirements();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.VerificationActivity#getRequirements <em>Requirements</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirements</em>' container reference.
	 * @see #getRequirements()
	 * @generated
	 */
	void setRequirements(AbstractRequirement value);

} // VerificationActivity
