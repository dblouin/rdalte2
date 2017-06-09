/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verifiable Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.VerifiableElement#getVerified <em>Verified</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getVerifiableElement()
 * @model abstract="true"
 * @generated
 */
public interface VerifiableElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Verified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verified</em>' attribute.
	 * @see #setVerified(Boolean)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getVerifiableElement_Verified()
	 * @model
	 * @generated
	 */
	Boolean getVerified();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.VerifiableElement#getVerified <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verified</em>' attribute.
	 * @see #getVerified()
	 * @generated
	 */
	void setVerified(Boolean value);

} // VerifiableElement
