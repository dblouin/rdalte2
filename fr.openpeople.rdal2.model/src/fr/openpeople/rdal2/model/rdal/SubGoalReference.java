/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Goal Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SubGoalReference#getGoal <em>Goal</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSubGoalReference()
 * @model
 * @generated
 */
public interface SubGoalReference extends SubElementReference {
	/**
	 * Returns the value of the '<em><b>Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goal</em>' reference.
	 * @see #setGoal(AbstractGoal)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSubGoalReference_Goal()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#referencedElementEntries'"
	 * @generated
	 */
	AbstractGoal getGoal();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.SubGoalReference#getGoal <em>Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goal</em>' reference.
	 * @see #getGoal()
	 * @generated
	 */
	void setGoal(AbstractGoal value);

} // SubGoalReference
