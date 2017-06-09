/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Requirement#getImageAssumptions <em>Image Assumptions</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.Requirement#getFunctionUsedIn <em>Function Used In</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends AbstractRequirement, RefineableElement {
	/**
	 * Returns the value of the '<em><b>Image Assumptions</b></em>' reference list.
	 * The list contents are of type {@link fr.openpeople.rdal2.model.rdal.Assumption}.
	 * It is bidirectional and its opposite is '{@link fr.openpeople.rdal2.model.rdal.Assumption#getImageRequirement <em>Image Requirement</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Image Assumptions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image Assumptions</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirement_ImageAssumptions()
	 * @see fr.openpeople.rdal2.model.rdal.Assumption#getImageRequirement
	 * @model opposite="imageRequirement"
	 * @generated
	 */
	EList<Assumption> getImageAssumptions();

	/**
	 * Returns the value of the '<em><b>Function Used In</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Function Used In</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Function Used In</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getRequirement_FunctionUsedIn()
	 * @model
	 * @generated
	 */
	EList<EObject> getFunctionUsedIn();

} // Requirement
