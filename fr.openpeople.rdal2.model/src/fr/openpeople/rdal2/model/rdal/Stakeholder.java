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
 * A representation of the model object '<em><b>Stakeholder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Stakeholder#getContactInformation <em>Contact Information</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getStakeholder()
 * @model
 * @generated
 */
public interface Stakeholder extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Contact Information</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.ContactInformation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contact Information</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contact Information</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getStakeholder_ContactInformation()
	 * @model required="true"
	 * @generated
	 */
	EList<ContactInformation> getContactInformation();

} // Stakeholder
