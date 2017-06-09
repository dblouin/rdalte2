/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.Assumption;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementImpl#getImageAssumptions <em>Image Assumptions</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RequirementImpl#getFunctionUsedIn <em>Function Used In</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementImpl extends AbstractRequirementImpl implements Requirement {
	/**
	 * The cached value of the '{@link #getImageAssumptions() <em>Image Assumptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImageAssumptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Assumption> imageAssumptions;

	/**
	 * The cached value of the '{@link #getFunctionUsedIn() <em>Function Used In</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionUsedIn()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> functionUsedIn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Assumption> getImageAssumptions() {
		if (imageAssumptions == null) {
			imageAssumptions = new EObjectWithInverseResolvingEList<Assumption>(Assumption.class, this, RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS, RdalPackage.ASSUMPTION__IMAGE_REQUIREMENT);
		}
		return imageAssumptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getFunctionUsedIn() {
		if (functionUsedIn == null) {
			functionUsedIn = new EObjectResolvingEList<EObject>(EObject.class, this, RdalPackage.REQUIREMENT__FUNCTION_USED_IN);
		}
		return functionUsedIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getImageAssumptions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS:
				return ((InternalEList<?>)getImageAssumptions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS:
				return getImageAssumptions();
			case RdalPackage.REQUIREMENT__FUNCTION_USED_IN:
				return getFunctionUsedIn();
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
			case RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS:
				getImageAssumptions().clear();
				getImageAssumptions().addAll((Collection<? extends Assumption>)newValue);
				return;
			case RdalPackage.REQUIREMENT__FUNCTION_USED_IN:
				getFunctionUsedIn().clear();
				getFunctionUsedIn().addAll((Collection<? extends EObject>)newValue);
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
			case RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS:
				getImageAssumptions().clear();
				return;
			case RdalPackage.REQUIREMENT__FUNCTION_USED_IN:
				getFunctionUsedIn().clear();
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
			case RdalPackage.REQUIREMENT__IMAGE_ASSUMPTIONS:
				return imageAssumptions != null && !imageAssumptions.isEmpty();
			case RdalPackage.REQUIREMENT__FUNCTION_USED_IN:
				return functionUsedIn != null && !functionUsedIn.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RequirementImpl
