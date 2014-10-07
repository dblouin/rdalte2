/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Requirement Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SubRequirementReference#getRequirement <em>Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSubRequirementReference()
 * @model
 * @generated
 */
public interface SubRequirementReference extends SubElementReference {
	/**
	 * Returns the value of the '<em><b>Requirement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requirement</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requirement</em>' reference.
	 * @see #setRequirement(AbstractRequirement)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSubRequirementReference_Requirement()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#referencedElementEntries'"
	 * @generated
	 */
	AbstractRequirement getRequirement();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SubRequirementReference#getRequirement <em>Requirement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requirement</em>' reference.
	 * @see #getRequirement()
	 * @generated
	 */
	void setRequirement(AbstractRequirement value);

} // SubRequirementReference
