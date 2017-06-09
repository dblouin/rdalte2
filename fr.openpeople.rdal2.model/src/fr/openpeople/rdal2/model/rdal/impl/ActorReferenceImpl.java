/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.ActorReference;
import fr.openpeople.rdal2.model.rdal.RdalPackage;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Actor Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.ActorReferenceImpl#getReferencedActors <em>Referenced Actors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActorReferenceImpl extends IdentifiedElementImpl implements ActorReference {
	/**
	 * The cached value of the '{@link #getReferencedActors() <em>Referenced Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedActors()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> referencedActors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActorReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.ACTOR_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getReferencedActors() {
		if (referencedActors == null) {
			referencedActors = new EObjectResolvingEList<EObject>(EObject.class, this, RdalPackage.ACTOR_REFERENCE__REFERENCED_ACTORS);
		}
		return referencedActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.ACTOR_REFERENCE__REFERENCED_ACTORS:
				return getReferencedActors();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdalPackage.ACTOR_REFERENCE__REFERENCED_ACTORS:
				getReferencedActors().clear();
				getReferencedActors().addAll((Collection<? extends EObject>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RdalPackage.ACTOR_REFERENCE__REFERENCED_ACTORS:
				getReferencedActors().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RdalPackage.ACTOR_REFERENCE__REFERENCED_ACTORS:
				return referencedActors != null && !referencedActors.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ActorReferenceImpl
