/**
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractGoal#getConflicts <em>Conflicts</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.AbstractGoal#getPackage <em>Package</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractGoal()
 * @model abstract="true"
 * @generated
 */
public interface AbstractGoal extends TextualContractualElement, SatisfiableElement, RefineableElement {
	/**
	 * Returns the value of the '<em><b>Conflicts</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.Conflict}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.Conflict#getGoal <em>Goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conflicts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conflicts</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractGoal_Conflicts()
	 * @see fr.openpeople.rdal2.model.rdal.Conflict#getGoal
	 * @model opposite="goal"
	 * @generated
	 */
	EList<Conflict> getConflicts();

	/**
	 * Returns the value of the '<em><b>Package</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.GoalsPackage#getOwnedGoals <em>Owned Goals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' container reference.
	 * @see #setPackage(GoalsPackage)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getAbstractGoal_Package()
	 * @see fr.openpeople.rdal2.model.rdal.GoalsPackage#getOwnedGoals
	 * @model opposite="ownedGoals" required="true" transient="false"
	 * @generated
	 */
	GoalsPackage getPackage();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.AbstractGoal#getPackage <em>Package</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' container reference.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(GoalsPackage value);

} // AbstractGoal
