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
 * A representation of the model object '<em><b>Goal Refinement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.GoalRefinement#getOwnedSubGoalRefs <em>Owned Sub Goal Refs</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.GoalRefinement#getSubGoals <em>Sub Goals</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.GoalRefinement#getRefinedGoal <em>Refined Goal</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getGoalRefinement()
 * @model
 * @generated
 */
public interface GoalRefinement extends ElementRefinement, SatisfiableElement {
	/**
	 * Returns the value of the '<em><b>Owned Sub Goal Refs</b></em>' containment reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.SubGoalReference}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Sub Goal Refs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Sub Goal Refs</em>' containment reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getGoalRefinement_OwnedSubGoalRefs()
	 * @model containment="true" required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#subElementRefEntries'"
	 * @generated
	 */
	EList<SubGoalReference> getOwnedSubGoalRefs();

	/**
	 * Returns the value of the '<em><b>Sub Goals</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.AbstractGoal}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Goals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Goals</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getGoalRefinement_SubGoals()
	 * @model required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	EList<AbstractGoal> getSubGoals();

	/**
	 * Returns the value of the '<em><b>Refined Goal</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refined Goal</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refined Goal</em>' reference.
	 * @see #setRefinedGoal(AbstractGoal)
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getGoalRefinement_RefinedGoal()
	 * @model required="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="group='#refinedElementEntries'"
	 * @generated
	 */
	AbstractGoal getRefinedGoal();

	/**
	 * Sets the value of the '{@link fr.openpeople.rdal2.model.rdal.GoalRefinement#getRefinedGoal <em>Refined Goal</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refined Goal</em>' reference.
	 * @see #getRefinedGoal()
	 * @generated
	 */
	void setRefinedGoal(AbstractGoal value);

} // GoalRefinement
