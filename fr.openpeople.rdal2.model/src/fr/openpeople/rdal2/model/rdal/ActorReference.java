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
 * A representation of the model object '<em><b>Actor Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.ActorReference#getReferencedActors <em>Referenced Actors</em>}</li>
 * </ul>
 *
 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getActorReference()
 * @model
 * @generated
 */
public interface ActorReference extends IdentifiedElement {
	/**
	 * Returns the value of the '<em><b>Referenced Actors</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Referenced Actors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Referenced Actors</em>' reference list.
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#getActorReference_ReferencedActors()
	 * @model required="true"
	 * @generated
	 */
	EList<EObject> getReferencedActors();

} // ActorReference
