/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.ElementRefinement;
import fr.openpeople.rdal2.model.rdal.RdalOrgPackage;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.Specification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Org Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl#getSubPackages <em>Sub Packages</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl#getContractualElementEntries <em>Contractual Element Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl#getRefinementEntries <em>Refinement Entries</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.RdalOrgPackageImpl#getOwnedRefinements <em>Owned Refinements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RdalOrgPackageImpl extends IdentifiedElementImpl implements RdalOrgPackage {
	/**
	 * The cached value of the '{@link #getSubPackages() <em>Sub Packages</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<RdalOrgPackage> subPackages;
	/**
	 * The cached value of the '{@link #getContractualElementEntries() <em>Contractual Element Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContractualElementEntries()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap contractualElementEntries;
	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected RdalOrgPackage parent;

	/**
	 * The cached value of the '{@link #getRefinementEntries() <em>Refinement Entries</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefinementEntries()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap refinementEntries;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RdalOrgPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.RDAL_ORG_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getSpecification() {
		if (eContainerFeatureID() != RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION) return null;
		return (Specification)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(Specification newSpecification, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSpecification, RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(Specification newSpecification) {
		if (newSpecification != eInternalContainer() || (eContainerFeatureID() != RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION && newSpecification != null)) {
			if (EcoreUtil.isAncestor(this, newSpecification))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, RdalPackage.SPECIFICATION__OWNED_PACKAGES, Specification.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdalOrgPackage> getSubPackages() {
		if (subPackages == null) {
			subPackages = new EObjectWithInverseResolvingEList<RdalOrgPackage>(RdalOrgPackage.class, this, RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES, RdalPackage.RDAL_ORG_PACKAGE__PARENT);
		}
		return subPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getContractualElementEntries() {
		if (contractualElementEntries == null) {
			contractualElementEntries = new BasicFeatureMap(this, RdalPackage.RDAL_ORG_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES);
		}
		return contractualElementEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdalOrgPackage getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (RdalOrgPackage)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.RDAL_ORG_PACKAGE__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdalOrgPackage basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(RdalOrgPackage newParent, NotificationChain msgs) {
		RdalOrgPackage oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdalPackage.RDAL_ORG_PACKAGE__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(RdalOrgPackage newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES, RdalOrgPackage.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES, RdalOrgPackage.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.RDAL_ORG_PACKAGE__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getRefinementEntries() {
		if (refinementEntries == null) {
			refinementEntries = new BasicFeatureMap(this, RdalPackage.RDAL_ORG_PACKAGE__REFINEMENT_ENTRIES);
		}
		return refinementEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRefinement> getOwnedRefinements() {
		return getRefinementEntries().list(RdalPackage.Literals.RDAL_ORG_PACKAGE__OWNED_REFINEMENTS);
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
			case RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSpecification((Specification)otherEnd, msgs);
			case RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSubPackages()).basicAdd(otherEnd, msgs);
			case RdalPackage.RDAL_ORG_PACKAGE__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES, RdalOrgPackage.class, msgs);
				return basicSetParent((RdalOrgPackage)otherEnd, msgs);
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
			case RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES:
				return ((InternalEList<?>)getSubPackages()).basicRemove(otherEnd, msgs);
			case RdalPackage.RDAL_ORG_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES:
				return ((InternalEList<?>)getContractualElementEntries()).basicRemove(otherEnd, msgs);
			case RdalPackage.RDAL_ORG_PACKAGE__PARENT:
				return basicSetParent(null, msgs);
			case RdalPackage.RDAL_ORG_PACKAGE__REFINEMENT_ENTRIES:
				return ((InternalEList<?>)getRefinementEntries()).basicRemove(otherEnd, msgs);
			case RdalPackage.RDAL_ORG_PACKAGE__OWNED_REFINEMENTS:
				return ((InternalEList<?>)getOwnedRefinements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION:
				return eInternalContainer().eInverseRemove(this, RdalPackage.SPECIFICATION__OWNED_PACKAGES, Specification.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION:
				return getSpecification();
			case RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES:
				return getSubPackages();
			case RdalPackage.RDAL_ORG_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES:
				if (coreType) return getContractualElementEntries();
				return ((FeatureMap.Internal)getContractualElementEntries()).getWrapper();
			case RdalPackage.RDAL_ORG_PACKAGE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case RdalPackage.RDAL_ORG_PACKAGE__REFINEMENT_ENTRIES:
				if (coreType) return getRefinementEntries();
				return ((FeatureMap.Internal)getRefinementEntries()).getWrapper();
			case RdalPackage.RDAL_ORG_PACKAGE__OWNED_REFINEMENTS:
				return getOwnedRefinements();
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
			case RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION:
				setSpecification((Specification)newValue);
				return;
			case RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				getSubPackages().addAll((Collection<? extends RdalOrgPackage>)newValue);
				return;
			case RdalPackage.RDAL_ORG_PACKAGE__PARENT:
				setParent((RdalOrgPackage)newValue);
				return;
			case RdalPackage.RDAL_ORG_PACKAGE__OWNED_REFINEMENTS:
				getOwnedRefinements().clear();
				getOwnedRefinements().addAll((Collection<? extends ElementRefinement>)newValue);
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
			case RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION:
				setSpecification((Specification)null);
				return;
			case RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES:
				getSubPackages().clear();
				return;
			case RdalPackage.RDAL_ORG_PACKAGE__PARENT:
				setParent((RdalOrgPackage)null);
				return;
			case RdalPackage.RDAL_ORG_PACKAGE__OWNED_REFINEMENTS:
				getOwnedRefinements().clear();
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
			case RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION:
				return getSpecification() != null;
			case RdalPackage.RDAL_ORG_PACKAGE__SUB_PACKAGES:
				return subPackages != null && !subPackages.isEmpty();
			case RdalPackage.RDAL_ORG_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES:
				return contractualElementEntries != null && !contractualElementEntries.isEmpty();
			case RdalPackage.RDAL_ORG_PACKAGE__PARENT:
				return parent != null;
			case RdalPackage.RDAL_ORG_PACKAGE__REFINEMENT_ENTRIES:
				return refinementEntries != null && !refinementEntries.isEmpty();
			case RdalPackage.RDAL_ORG_PACKAGE__OWNED_REFINEMENTS:
				return !getOwnedRefinements().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (contractualElementEntries: ");
		result.append(contractualElementEntries);
		result.append(", refinementEntries: ");
		result.append(refinementEntries);
		result.append(')');
		return result.toString();
	}

} //RdalOrgPackageImpl
