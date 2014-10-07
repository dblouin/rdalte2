/**
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.InteractionVariable#getType <em>Type</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.InteractionVariable#isNeglected <em>Neglected</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getInteractionVariable()
 * @model
 * @generated
 */
public interface InteractionVariable extends Variable {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.openpeople.rdal2.model.rdal.InteractionVariableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.openpeople.rdal2.model.rdal.InteractionVariableType
	 * @see #setType(InteractionVariableType)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getInteractionVariable_Type()
	 * @model required="true"
	 * @generated
	 */
	InteractionVariableType getType();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.InteractionVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.openpeople.rdal2.model.rdal.InteractionVariableType
	 * @see #getType()
	 * @generated
	 */
	void setType(InteractionVariableType value);

	/**
	 * Returns the value of the '<em><b>Neglected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Neglected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Neglected</em>' attribute.
	 * @see #setNeglected(boolean)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getInteractionVariable_Neglected()
	 * @model required="true"
	 * @generated
	 */
	boolean isNeglected();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.InteractionVariable#isNeglected <em>Neglected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neglected</em>' attribute.
	 * @see #isNeglected()
	 * @generated
	 */
	void setNeglected(boolean value);

} // InteractionVariable
