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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.Capability;
import fr.openpeople.rdal2.model.rdal.InteractionVariable;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.SystemContext;
import fr.openpeople.rdal2.model.rdal.SystemOverview;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Overview</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl#getOwnedCapabilities <em>Owned Capabilities</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl#getGlobalSystem <em>Global System</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl#getSystemToBe <em>System To Be</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl#getOwnedContexts <em>Owned Contexts</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl#getOwnedSystemBoundary <em>Owned System Boundary</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemOverviewImpl#getPurpose <em>Purpose</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SystemOverviewImpl extends AbstractContractualElementImpl implements SystemOverview {
	/**
	 * The cached value of the '{@link #getOwnedCapabilities() <em>Owned Capabilities</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedCapabilities()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> ownedCapabilities;

	/**
	 * The cached value of the '{@link #getGlobalSystem() <em>Global System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalSystem()
	 * @generated
	 * @ordered
	 */
	protected EObject globalSystem;

	/**
	 * The cached value of the '{@link #getSystemToBe() <em>System To Be</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemToBe()
	 * @generated
	 * @ordered
	 */
	protected EObject systemToBe;

	/**
	 * The cached value of the '{@link #getOwnedContexts() <em>Owned Contexts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContexts()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemContext> ownedContexts;

	/**
	 * The cached value of the '{@link #getOwnedSystemBoundary() <em>Owned System Boundary</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystemBoundary()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionVariable> ownedSystemBoundary;

	/**
	 * The default value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String PURPOSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected String purpose = PURPOSE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemOverviewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.SYSTEM_OVERVIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getOwnedCapabilities() {
		if (ownedCapabilities == null) {
			ownedCapabilities = new EObjectContainmentEList<Capability>(Capability.class, this, RdalPackage.SYSTEM_OVERVIEW__OWNED_CAPABILITIES);
		}
		return ownedCapabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSystemToBe() {
		if (systemToBe != null && systemToBe.eIsProxy()) {
			InternalEObject oldSystemToBe = (InternalEObject)systemToBe;
			systemToBe = eResolveProxy(oldSystemToBe);
			if (systemToBe != oldSystemToBe) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.SYSTEM_OVERVIEW__SYSTEM_TO_BE, oldSystemToBe, systemToBe));
			}
		}
		return systemToBe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetSystemToBe() {
		return systemToBe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemToBe(EObject newSystemToBe) {
		EObject oldSystemToBe = systemToBe;
		systemToBe = newSystemToBe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SYSTEM_OVERVIEW__SYSTEM_TO_BE, oldSystemToBe, systemToBe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SystemContext> getOwnedContexts() {
		if (ownedContexts == null) {
			ownedContexts = new EObjectContainmentWithInverseEList<SystemContext>(SystemContext.class, this, RdalPackage.SYSTEM_OVERVIEW__OWNED_CONTEXTS, RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW);
		}
		return ownedContexts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionVariable> getOwnedSystemBoundary() {
		if (ownedSystemBoundary == null) {
			ownedSystemBoundary = new EObjectContainmentEList<InteractionVariable>(InteractionVariable.class, this, RdalPackage.SYSTEM_OVERVIEW__OWNED_SYSTEM_BOUNDARY);
		}
		return ownedSystemBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(String newPurpose) {
		String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SYSTEM_OVERVIEW__PURPOSE, oldPurpose, purpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGlobalSystem() {
		if (globalSystem != null && globalSystem.eIsProxy()) {
			InternalEObject oldGlobalSystem = (InternalEObject)globalSystem;
			globalSystem = eResolveProxy(oldGlobalSystem);
			if (globalSystem != oldGlobalSystem) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.SYSTEM_OVERVIEW__GLOBAL_SYSTEM, oldGlobalSystem, globalSystem));
			}
		}
		return globalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetGlobalSystem() {
		return globalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalSystem(EObject newGlobalSystem) {
		EObject oldGlobalSystem = globalSystem;
		globalSystem = newGlobalSystem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SYSTEM_OVERVIEW__GLOBAL_SYSTEM, oldGlobalSystem, globalSystem));
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
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CONTEXTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedContexts()).basicAdd(otherEnd, msgs);
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
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CAPABILITIES:
				return ((InternalEList<?>)getOwnedCapabilities()).basicRemove(otherEnd, msgs);
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CONTEXTS:
				return ((InternalEList<?>)getOwnedContexts()).basicRemove(otherEnd, msgs);
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_SYSTEM_BOUNDARY:
				return ((InternalEList<?>)getOwnedSystemBoundary()).basicRemove(otherEnd, msgs);
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
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CAPABILITIES:
				return getOwnedCapabilities();
			case RdalPackage.SYSTEM_OVERVIEW__GLOBAL_SYSTEM:
				if (resolve) return getGlobalSystem();
				return basicGetGlobalSystem();
			case RdalPackage.SYSTEM_OVERVIEW__SYSTEM_TO_BE:
				if (resolve) return getSystemToBe();
				return basicGetSystemToBe();
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CONTEXTS:
				return getOwnedContexts();
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_SYSTEM_BOUNDARY:
				return getOwnedSystemBoundary();
			case RdalPackage.SYSTEM_OVERVIEW__PURPOSE:
				return getPurpose();
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
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CAPABILITIES:
				getOwnedCapabilities().clear();
				getOwnedCapabilities().addAll((Collection<? extends Capability>)newValue);
				return;
			case RdalPackage.SYSTEM_OVERVIEW__GLOBAL_SYSTEM:
				setGlobalSystem((EObject)newValue);
				return;
			case RdalPackage.SYSTEM_OVERVIEW__SYSTEM_TO_BE:
				setSystemToBe((EObject)newValue);
				return;
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CONTEXTS:
				getOwnedContexts().clear();
				getOwnedContexts().addAll((Collection<? extends SystemContext>)newValue);
				return;
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_SYSTEM_BOUNDARY:
				getOwnedSystemBoundary().clear();
				getOwnedSystemBoundary().addAll((Collection<? extends InteractionVariable>)newValue);
				return;
			case RdalPackage.SYSTEM_OVERVIEW__PURPOSE:
				setPurpose((String)newValue);
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
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CAPABILITIES:
				getOwnedCapabilities().clear();
				return;
			case RdalPackage.SYSTEM_OVERVIEW__GLOBAL_SYSTEM:
				setGlobalSystem((EObject)null);
				return;
			case RdalPackage.SYSTEM_OVERVIEW__SYSTEM_TO_BE:
				setSystemToBe((EObject)null);
				return;
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CONTEXTS:
				getOwnedContexts().clear();
				return;
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_SYSTEM_BOUNDARY:
				getOwnedSystemBoundary().clear();
				return;
			case RdalPackage.SYSTEM_OVERVIEW__PURPOSE:
				setPurpose(PURPOSE_EDEFAULT);
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
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CAPABILITIES:
				return ownedCapabilities != null && !ownedCapabilities.isEmpty();
			case RdalPackage.SYSTEM_OVERVIEW__GLOBAL_SYSTEM:
				return globalSystem != null;
			case RdalPackage.SYSTEM_OVERVIEW__SYSTEM_TO_BE:
				return systemToBe != null;
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_CONTEXTS:
				return ownedContexts != null && !ownedContexts.isEmpty();
			case RdalPackage.SYSTEM_OVERVIEW__OWNED_SYSTEM_BOUNDARY:
				return ownedSystemBoundary != null && !ownedSystemBoundary.isEmpty();
			case RdalPackage.SYSTEM_OVERVIEW__PURPOSE:
				return PURPOSE_EDEFAULT == null ? purpose != null : !PURPOSE_EDEFAULT.equals(purpose);
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
		result.append(" (purpose: ");
		result.append(purpose);
		result.append(')');
		return result.toString();
	}

} //SystemOverviewImpl
