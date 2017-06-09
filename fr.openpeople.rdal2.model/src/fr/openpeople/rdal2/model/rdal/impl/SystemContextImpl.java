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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.openpeople.rdal2.model.rdal.ActorReference;
import fr.openpeople.rdal2.model.rdal.InteractionVariable;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.SystemContext;
import fr.openpeople.rdal2.model.rdal.SystemOverview;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemContextImpl#getGlobalSystemContext <em>Global System Context</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemContextImpl#getSystemContextBoundary <em>System Context Boundary</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemContextImpl#getActors <em>Actors</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SystemContextImpl#getSystemOverview <em>System Overview</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemContextImpl extends AbstractContractualElementImpl implements SystemContext {
	/**
	 * The cached value of the '{@link #getGlobalSystemContext() <em>Global System Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalSystemContext()
	 * @generated
	 * @ordered
	 */
	protected EObject globalSystemContext;

	/**
	 * The cached value of the '{@link #getSystemContextBoundary() <em>System Context Boundary</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemContextBoundary()
	 * @generated
	 * @ordered
	 */
	protected EList<InteractionVariable> systemContextBoundary;

	/**
	 * The cached value of the '{@link #getActors() <em>Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActors()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorReference> actors;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.SYSTEM_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getGlobalSystemContext() {
		if (globalSystemContext != null && globalSystemContext.eIsProxy()) {
			InternalEObject oldGlobalSystemContext = (InternalEObject)globalSystemContext;
			globalSystemContext = eResolveProxy(oldGlobalSystemContext);
			if (globalSystemContext != oldGlobalSystemContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM_CONTEXT, oldGlobalSystemContext, globalSystemContext));
			}
		}
		return globalSystemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetGlobalSystemContext() {
		return globalSystemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalSystemContext(EObject newGlobalSystemContext) {
		EObject oldGlobalSystemContext = globalSystemContext;
		globalSystemContext = newGlobalSystemContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM_CONTEXT, oldGlobalSystemContext, globalSystemContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InteractionVariable> getSystemContextBoundary() {
		if (systemContextBoundary == null) {
			systemContextBoundary = new EObjectResolvingEList<InteractionVariable>(InteractionVariable.class, this, RdalPackage.SYSTEM_CONTEXT__SYSTEM_CONTEXT_BOUNDARY);
		}
		return systemContextBoundary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorReference> getActors() {
		if (actors == null) {
			actors = new EObjectResolvingEList<ActorReference>(ActorReference.class, this, RdalPackage.SYSTEM_CONTEXT__ACTORS);
		}
		return actors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOverview getSystemOverview() {
		if (eContainerFeatureID() != RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW) return null;
		return (SystemOverview)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemOverview(SystemOverview newSystemOverview, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSystemOverview, RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemOverview(SystemOverview newSystemOverview) {
		if (newSystemOverview != eInternalContainer() || (eContainerFeatureID() != RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW && newSystemOverview != null)) {
			if (EcoreUtil.isAncestor(this, newSystemOverview))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSystemOverview != null)
				msgs = ((InternalEObject)newSystemOverview).eInverseAdd(this, RdalPackage.SYSTEM_OVERVIEW__OWNED_CONTEXTS, SystemOverview.class, msgs);
			msgs = basicSetSystemOverview(newSystemOverview, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW, newSystemOverview, newSystemOverview));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSystemOverview((SystemOverview)otherEnd, msgs);
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
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW:
				return basicSetSystemOverview(null, msgs);
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
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW:
				return eInternalContainer().eInverseRemove(this, RdalPackage.SYSTEM_OVERVIEW__OWNED_CONTEXTS, SystemOverview.class, msgs);
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
			case RdalPackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM_CONTEXT:
				if (resolve) return getGlobalSystemContext();
				return basicGetGlobalSystemContext();
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_CONTEXT_BOUNDARY:
				return getSystemContextBoundary();
			case RdalPackage.SYSTEM_CONTEXT__ACTORS:
				return getActors();
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW:
				return getSystemOverview();
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
			case RdalPackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM_CONTEXT:
				setGlobalSystemContext((EObject)newValue);
				return;
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_CONTEXT_BOUNDARY:
				getSystemContextBoundary().clear();
				getSystemContextBoundary().addAll((Collection<? extends InteractionVariable>)newValue);
				return;
			case RdalPackage.SYSTEM_CONTEXT__ACTORS:
				getActors().clear();
				getActors().addAll((Collection<? extends ActorReference>)newValue);
				return;
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW:
				setSystemOverview((SystemOverview)newValue);
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
			case RdalPackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM_CONTEXT:
				setGlobalSystemContext((EObject)null);
				return;
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_CONTEXT_BOUNDARY:
				getSystemContextBoundary().clear();
				return;
			case RdalPackage.SYSTEM_CONTEXT__ACTORS:
				getActors().clear();
				return;
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW:
				setSystemOverview((SystemOverview)null);
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
			case RdalPackage.SYSTEM_CONTEXT__GLOBAL_SYSTEM_CONTEXT:
				return globalSystemContext != null;
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_CONTEXT_BOUNDARY:
				return systemContextBoundary != null && !systemContextBoundary.isEmpty();
			case RdalPackage.SYSTEM_CONTEXT__ACTORS:
				return actors != null && !actors.isEmpty();
			case RdalPackage.SYSTEM_CONTEXT__SYSTEM_OVERVIEW:
				return getSystemOverview() != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemContextImpl
