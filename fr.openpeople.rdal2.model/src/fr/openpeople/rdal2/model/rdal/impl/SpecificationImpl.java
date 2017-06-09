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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguagesSpec;
import fr.openpeople.rdal2.model.rdal.ActorReference;
import fr.openpeople.rdal2.model.rdal.Conflict;
import fr.openpeople.rdal2.model.rdal.ContactInformation;
import fr.openpeople.rdal2.model.rdal.NonFunctionalProperty;
import fr.openpeople.rdal2.model.rdal.RdalOrgPackage;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.SatisfiableElement;
import fr.openpeople.rdal2.model.rdal.Specification;
import fr.openpeople.rdal2.model.rdal.Stakeholder;
import fr.openpeople.rdal2.model.rdal.SystemOverview;
import fr.openpeople.rdal2.model.rdal.VerifiableElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getVerified <em>Verified</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getSatisfactionLevel <em>Satisfaction Level</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getOwnedPackages <em>Owned Packages</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getOwnedContactInformation <em>Owned Contact Information</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getOwnedConflicts <em>Owned Conflicts</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getOwnedSystOverview <em>Owned Syst Overview</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getConstraintLanguagesSpec <em>Constraint Languages Spec</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getOwnedActorReferences <em>Owned Actor References</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getPrimaryActors <em>Primary Actors</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getOwnedNonFuncProperties <em>Owned Non Func Properties</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.SpecificationImpl#getOwnedStakeholders <em>Owned Stakeholders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecificationImpl extends AbstractContractualElementImpl implements Specification {
	/**
	 * The default value of the '{@link #getVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerified()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VERIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerified() <em>Verified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerified()
	 * @generated
	 * @ordered
	 */
	protected Boolean verified = VERIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Float SATISFACTION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSatisfactionLevel() <em>Satisfaction Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatisfactionLevel()
	 * @generated
	 * @ordered
	 */
	protected Float satisfactionLevel = SATISFACTION_LEVEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedPackages() <em>Owned Packages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPackages()
	 * @generated
	 * @ordered
	 */
	protected EList<RdalOrgPackage> ownedPackages;

	/**
	 * The cached value of the '{@link #getOwnedContactInformation() <em>Owned Contact Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformation> ownedContactInformation;

	/**
	 * The cached value of the '{@link #getOwnedConflicts() <em>Owned Conflicts</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConflicts()
	 * @generated
	 * @ordered
	 */
	protected EList<Conflict> ownedConflicts;

	/**
	 * The cached value of the '{@link #getOwnedSystOverview() <em>Owned Syst Overview</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedSystOverview()
	 * @generated
	 * @ordered
	 */
	protected SystemOverview ownedSystOverview;

	/**
	 * The cached value of the '{@link #getConstraintLanguagesSpec() <em>Constraint Languages Spec</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintLanguagesSpec()
	 * @generated
	 * @ordered
	 */
	protected ConstraintLanguagesSpec constraintLanguagesSpec;

	/**
	 * The cached value of the '{@link #getOwnedActorReferences() <em>Owned Actor References</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedActorReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<ActorReference> ownedActorReferences;

	/**
	 * The cached value of the '{@link #getPrimaryActors() <em>Primary Actors</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryActors()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> primaryActors;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedNonFuncProperties() <em>Owned Non Func Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedNonFuncProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<NonFunctionalProperty> ownedNonFuncProperties;

	/**
	 * The cached value of the '{@link #getOwnedStakeholders() <em>Owned Stakeholders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStakeholders()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> ownedStakeholders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.SPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVerified() {
		return verified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerified(Boolean newVerified) {
		Boolean oldVerified = verified;
		verified = newVerified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SPECIFICATION__VERIFIED, oldVerified, verified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getSatisfactionLevel() {
		return satisfactionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatisfactionLevel(Float newSatisfactionLevel) {
		Float oldSatisfactionLevel = satisfactionLevel;
		satisfactionLevel = newSatisfactionLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SPECIFICATION__SATISFACTION_LEVEL, oldSatisfactionLevel, satisfactionLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RdalOrgPackage> getOwnedPackages() {
		if (ownedPackages == null) {
			ownedPackages = new EObjectContainmentWithInverseEList<RdalOrgPackage>(RdalOrgPackage.class, this, RdalPackage.SPECIFICATION__OWNED_PACKAGES, RdalPackage.RDAL_ORG_PACKAGE__SPECIFICATION);
		}
		return ownedPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformation> getOwnedContactInformation() {
		if (ownedContactInformation == null) {
			ownedContactInformation = new EObjectContainmentEList<ContactInformation>(ContactInformation.class, this, RdalPackage.SPECIFICATION__OWNED_CONTACT_INFORMATION);
		}
		return ownedContactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Conflict> getOwnedConflicts() {
		if (ownedConflicts == null) {
			ownedConflicts = new EObjectContainmentEList<Conflict>(Conflict.class, this, RdalPackage.SPECIFICATION__OWNED_CONFLICTS);
		}
		return ownedConflicts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOverview getOwnedSystOverview() {
		return ownedSystOverview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedSystOverview(SystemOverview newOwnedSystOverview, NotificationChain msgs) {
		SystemOverview oldOwnedSystOverview = ownedSystOverview;
		ownedSystOverview = newOwnedSystOverview;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW, oldOwnedSystOverview, newOwnedSystOverview);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedSystOverview(SystemOverview newOwnedSystOverview) {
		if (newOwnedSystOverview != ownedSystOverview) {
			NotificationChain msgs = null;
			if (ownedSystOverview != null)
				msgs = ((InternalEObject)ownedSystOverview).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW, null, msgs);
			if (newOwnedSystOverview != null)
				msgs = ((InternalEObject)newOwnedSystOverview).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW, null, msgs);
			msgs = basicSetOwnedSystOverview(newOwnedSystOverview, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW, newOwnedSystOverview, newOwnedSystOverview));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintLanguagesSpec getConstraintLanguagesSpec() {
		if (constraintLanguagesSpec != null && constraintLanguagesSpec.eIsProxy()) {
			InternalEObject oldConstraintLanguagesSpec = (InternalEObject)constraintLanguagesSpec;
			constraintLanguagesSpec = (ConstraintLanguagesSpec)eResolveProxy(oldConstraintLanguagesSpec);
			if (constraintLanguagesSpec != oldConstraintLanguagesSpec) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RdalPackage.SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC, oldConstraintLanguagesSpec, constraintLanguagesSpec));
			}
		}
		return constraintLanguagesSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintLanguagesSpec basicGetConstraintLanguagesSpec() {
		return constraintLanguagesSpec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintLanguagesSpec(ConstraintLanguagesSpec newConstraintLanguagesSpec) {
		ConstraintLanguagesSpec oldConstraintLanguagesSpec = constraintLanguagesSpec;
		constraintLanguagesSpec = newConstraintLanguagesSpec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC, oldConstraintLanguagesSpec, constraintLanguagesSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActorReference> getOwnedActorReferences() {
		if (ownedActorReferences == null) {
			ownedActorReferences = new EObjectContainmentEList<ActorReference>(ActorReference.class, this, RdalPackage.SPECIFICATION__OWNED_ACTOR_REFERENCES);
		}
		return ownedActorReferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getPrimaryActors() {
		if (primaryActors == null) {
			primaryActors = new EObjectResolvingEList<EObject>(EObject.class, this, RdalPackage.SPECIFICATION__PRIMARY_ACTORS);
		}
		return primaryActors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.SPECIFICATION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NonFunctionalProperty> getOwnedNonFuncProperties() {
		if (ownedNonFuncProperties == null) {
			ownedNonFuncProperties = new EObjectContainmentEList<NonFunctionalProperty>(NonFunctionalProperty.class, this, RdalPackage.SPECIFICATION__OWNED_NON_FUNC_PROPERTIES);
		}
		return ownedNonFuncProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getOwnedStakeholders() {
		if (ownedStakeholders == null) {
			ownedStakeholders = new EObjectContainmentEList<Stakeholder>(Stakeholder.class, this, RdalPackage.SPECIFICATION__OWNED_STAKEHOLDERS);
		}
		return ownedStakeholders;
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
			case RdalPackage.SPECIFICATION__OWNED_PACKAGES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedPackages()).basicAdd(otherEnd, msgs);
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
			case RdalPackage.SPECIFICATION__OWNED_PACKAGES:
				return ((InternalEList<?>)getOwnedPackages()).basicRemove(otherEnd, msgs);
			case RdalPackage.SPECIFICATION__OWNED_CONTACT_INFORMATION:
				return ((InternalEList<?>)getOwnedContactInformation()).basicRemove(otherEnd, msgs);
			case RdalPackage.SPECIFICATION__OWNED_CONFLICTS:
				return ((InternalEList<?>)getOwnedConflicts()).basicRemove(otherEnd, msgs);
			case RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW:
				return basicSetOwnedSystOverview(null, msgs);
			case RdalPackage.SPECIFICATION__OWNED_ACTOR_REFERENCES:
				return ((InternalEList<?>)getOwnedActorReferences()).basicRemove(otherEnd, msgs);
			case RdalPackage.SPECIFICATION__OWNED_NON_FUNC_PROPERTIES:
				return ((InternalEList<?>)getOwnedNonFuncProperties()).basicRemove(otherEnd, msgs);
			case RdalPackage.SPECIFICATION__OWNED_STAKEHOLDERS:
				return ((InternalEList<?>)getOwnedStakeholders()).basicRemove(otherEnd, msgs);
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
			case RdalPackage.SPECIFICATION__VERIFIED:
				return getVerified();
			case RdalPackage.SPECIFICATION__SATISFACTION_LEVEL:
				return getSatisfactionLevel();
			case RdalPackage.SPECIFICATION__OWNED_PACKAGES:
				return getOwnedPackages();
			case RdalPackage.SPECIFICATION__OWNED_CONTACT_INFORMATION:
				return getOwnedContactInformation();
			case RdalPackage.SPECIFICATION__OWNED_CONFLICTS:
				return getOwnedConflicts();
			case RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW:
				return getOwnedSystOverview();
			case RdalPackage.SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC:
				if (resolve) return getConstraintLanguagesSpec();
				return basicGetConstraintLanguagesSpec();
			case RdalPackage.SPECIFICATION__OWNED_ACTOR_REFERENCES:
				return getOwnedActorReferences();
			case RdalPackage.SPECIFICATION__PRIMARY_ACTORS:
				return getPrimaryActors();
			case RdalPackage.SPECIFICATION__VERSION:
				return getVersion();
			case RdalPackage.SPECIFICATION__OWNED_NON_FUNC_PROPERTIES:
				return getOwnedNonFuncProperties();
			case RdalPackage.SPECIFICATION__OWNED_STAKEHOLDERS:
				return getOwnedStakeholders();
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
			case RdalPackage.SPECIFICATION__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case RdalPackage.SPECIFICATION__SATISFACTION_LEVEL:
				setSatisfactionLevel((Float)newValue);
				return;
			case RdalPackage.SPECIFICATION__OWNED_PACKAGES:
				getOwnedPackages().clear();
				getOwnedPackages().addAll((Collection<? extends RdalOrgPackage>)newValue);
				return;
			case RdalPackage.SPECIFICATION__OWNED_CONTACT_INFORMATION:
				getOwnedContactInformation().clear();
				getOwnedContactInformation().addAll((Collection<? extends ContactInformation>)newValue);
				return;
			case RdalPackage.SPECIFICATION__OWNED_CONFLICTS:
				getOwnedConflicts().clear();
				getOwnedConflicts().addAll((Collection<? extends Conflict>)newValue);
				return;
			case RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW:
				setOwnedSystOverview((SystemOverview)newValue);
				return;
			case RdalPackage.SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC:
				setConstraintLanguagesSpec((ConstraintLanguagesSpec)newValue);
				return;
			case RdalPackage.SPECIFICATION__OWNED_ACTOR_REFERENCES:
				getOwnedActorReferences().clear();
				getOwnedActorReferences().addAll((Collection<? extends ActorReference>)newValue);
				return;
			case RdalPackage.SPECIFICATION__PRIMARY_ACTORS:
				getPrimaryActors().clear();
				getPrimaryActors().addAll((Collection<? extends EObject>)newValue);
				return;
			case RdalPackage.SPECIFICATION__VERSION:
				setVersion((String)newValue);
				return;
			case RdalPackage.SPECIFICATION__OWNED_NON_FUNC_PROPERTIES:
				getOwnedNonFuncProperties().clear();
				getOwnedNonFuncProperties().addAll((Collection<? extends NonFunctionalProperty>)newValue);
				return;
			case RdalPackage.SPECIFICATION__OWNED_STAKEHOLDERS:
				getOwnedStakeholders().clear();
				getOwnedStakeholders().addAll((Collection<? extends Stakeholder>)newValue);
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
			case RdalPackage.SPECIFICATION__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case RdalPackage.SPECIFICATION__SATISFACTION_LEVEL:
				setSatisfactionLevel(SATISFACTION_LEVEL_EDEFAULT);
				return;
			case RdalPackage.SPECIFICATION__OWNED_PACKAGES:
				getOwnedPackages().clear();
				return;
			case RdalPackage.SPECIFICATION__OWNED_CONTACT_INFORMATION:
				getOwnedContactInformation().clear();
				return;
			case RdalPackage.SPECIFICATION__OWNED_CONFLICTS:
				getOwnedConflicts().clear();
				return;
			case RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW:
				setOwnedSystOverview((SystemOverview)null);
				return;
			case RdalPackage.SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC:
				setConstraintLanguagesSpec((ConstraintLanguagesSpec)null);
				return;
			case RdalPackage.SPECIFICATION__OWNED_ACTOR_REFERENCES:
				getOwnedActorReferences().clear();
				return;
			case RdalPackage.SPECIFICATION__PRIMARY_ACTORS:
				getPrimaryActors().clear();
				return;
			case RdalPackage.SPECIFICATION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case RdalPackage.SPECIFICATION__OWNED_NON_FUNC_PROPERTIES:
				getOwnedNonFuncProperties().clear();
				return;
			case RdalPackage.SPECIFICATION__OWNED_STAKEHOLDERS:
				getOwnedStakeholders().clear();
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
			case RdalPackage.SPECIFICATION__VERIFIED:
				return VERIFIED_EDEFAULT == null ? verified != null : !VERIFIED_EDEFAULT.equals(verified);
			case RdalPackage.SPECIFICATION__SATISFACTION_LEVEL:
				return SATISFACTION_LEVEL_EDEFAULT == null ? satisfactionLevel != null : !SATISFACTION_LEVEL_EDEFAULT.equals(satisfactionLevel);
			case RdalPackage.SPECIFICATION__OWNED_PACKAGES:
				return ownedPackages != null && !ownedPackages.isEmpty();
			case RdalPackage.SPECIFICATION__OWNED_CONTACT_INFORMATION:
				return ownedContactInformation != null && !ownedContactInformation.isEmpty();
			case RdalPackage.SPECIFICATION__OWNED_CONFLICTS:
				return ownedConflicts != null && !ownedConflicts.isEmpty();
			case RdalPackage.SPECIFICATION__OWNED_SYST_OVERVIEW:
				return ownedSystOverview != null;
			case RdalPackage.SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC:
				return constraintLanguagesSpec != null;
			case RdalPackage.SPECIFICATION__OWNED_ACTOR_REFERENCES:
				return ownedActorReferences != null && !ownedActorReferences.isEmpty();
			case RdalPackage.SPECIFICATION__PRIMARY_ACTORS:
				return primaryActors != null && !primaryActors.isEmpty();
			case RdalPackage.SPECIFICATION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case RdalPackage.SPECIFICATION__OWNED_NON_FUNC_PROPERTIES:
				return ownedNonFuncProperties != null && !ownedNonFuncProperties.isEmpty();
			case RdalPackage.SPECIFICATION__OWNED_STAKEHOLDERS:
				return ownedStakeholders != null && !ownedStakeholders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == VerifiableElement.class) {
			switch (derivedFeatureID) {
				case RdalPackage.SPECIFICATION__VERIFIED: return RdalPackage.VERIFIABLE_ELEMENT__VERIFIED;
				default: return -1;
			}
		}
		if (baseClass == SatisfiableElement.class) {
			switch (derivedFeatureID) {
				case RdalPackage.SPECIFICATION__SATISFACTION_LEVEL: return RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == VerifiableElement.class) {
			switch (baseFeatureID) {
				case RdalPackage.VERIFIABLE_ELEMENT__VERIFIED: return RdalPackage.SPECIFICATION__VERIFIED;
				default: return -1;
			}
		}
		if (baseClass == SatisfiableElement.class) {
			switch (baseFeatureID) {
				case RdalPackage.SATISFIABLE_ELEMENT__SATISFACTION_LEVEL: return RdalPackage.SPECIFICATION__SATISFACTION_LEVEL;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (verified: ");
		result.append(verified);
		result.append(", satisfactionLevel: ");
		result.append(satisfactionLevel);
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //SpecificationImpl
