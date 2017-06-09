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
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Variable#getDesignVariable <em>Design Variable</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getVariable()
 * @model
 * @generated
 */
public interface Variable extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Design Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Design Variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Design Variable</em>' reference.
	 * @see #setDesignVariable(EObject)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getVariable_DesignVariable()
	 * @model required="true"
	 * @generated
	 */
	EObject getDesignVariable();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Variable#getDesignVariable <em>Design Variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Design Variable</em>' reference.
	 * @see #getDesignVariable()
	 * @generated
	 */
	void setDesignVariable(EObject value);

} // Variable
