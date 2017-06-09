/**
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>System Function Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.SystemFunctionGoal#getUseCases <em>Use Cases</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemFunctionGoal()
 * @model
 * @generated
 */
public interface SystemFunctionGoal extends AbstractGoal {
	/**
	 * Returns the value of the '<em><b>Use Cases</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Cases</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Cases</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getSystemFunctionGoal_UseCases()
	 * @model
	 * @generated
	 */
	EList<EObject> getUseCases();

} // SystemFunctionGoal
