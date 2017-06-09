/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conflict</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Conflict#getGoal <em>Goal</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Conflict#getContractualElement <em>Contractual Element</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Conflict#getDegree <em>Degree</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getConflict()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface Conflict extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.AbstractGoal#getConflicts <em>Conflicts</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(AbstractGoal)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getConflict_Goal()
	 * @see fr.openpeople.rdal2.model.rdal.AbstractGoal#getConflicts
	 * @model opposite="conflicts" required="true"
	 * @generated
	 */
	AbstractGoal getGoal();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Conflict#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(AbstractGoal value);

	/**
	 * Returns the value of the '<em><b>Contractual Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contractual Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contractual Element</em>' reference.
	 * @see #setContractualElement(AbstractContractualElement)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getConflict_ContractualElement()
	 * @model required="true"
	 * @generated
	 */
	AbstractContractualElement getContractualElement();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Conflict#getContractualElement <em>Contractual Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contractual Element</em>' reference.
	 * @see #getContractualElement()
	 * @generated
	 */
	void setContractualElement(AbstractContractualElement value);

	/**
	 * Returns the value of the '<em><b>Degree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Degree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Degree</em>' attribute.
	 * @see #setDegree(Float)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getConflict_Degree()
	 * @model dataType="fr.openpeople.rdal2.model.rdal.NormalizedRatio" required="true"
	 * @generated
	 */
	Float getDegree();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.Conflict#getDegree <em>Degree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Degree</em>' attribute.
	 * @see #getDegree()
	 * @generated
	 */
	void setDegree(Float value);

} // Conflict
