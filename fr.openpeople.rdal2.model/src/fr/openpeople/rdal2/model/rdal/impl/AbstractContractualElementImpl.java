/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import fr.openpeople.rdal2.model.rdal.AbstractContractualElement;
import fr.openpeople.rdal2.model.rdal.ContactInformation;
import fr.openpeople.rdal2.model.rdal.Rationale;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.Stakeholder;
import fr.openpeople.rdal2.model.rdal.Uncertainty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Contractual Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#getStakeholders <em>Stakeholders</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#getOwnedRationales <em>Owned Rationales</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#getContactInformation <em>Contact Information</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#getOriginDate <em>Origin Date</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#getScheduleDate <em>Schedule Date</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#getSources <em>Sources</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#getEvolvedTo <em>Evolved To</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#isDropped <em>Dropped</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#getOwnedDroppingReasons <em>Owned Dropping Reasons</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.AbstractContractualElementImpl#getChangeUncertainty <em>Change Uncertainty</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractContractualElementImpl extends TraceableToDesignElementsElementImpl implements AbstractContractualElement {
	/**
	 * The cached value of the '{@link #getStakeholders() <em>Stakeholders</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholders()
	 * @generated
	 * @ordered
	 */
	protected EList<Stakeholder> stakeholders;

	/**
	 * The cached value of the '{@link #getOwnedRationales() <em>Owned Rationales</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRationales()
	 * @generated
	 * @ordered
	 */
	protected EList<Rationale> ownedRationales;

	/**
	 * The cached value of the '{@link #getContactInformation() <em>Contact Information</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContactInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<ContactInformation> contactInformation;

	/**
	 * The default value of the '{@link #getOriginDate() <em>Origin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ORIGIN_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOriginDate() <em>Origin Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginDate()
	 * @generated
	 * @ordered
	 */
	protected Date originDate = ORIGIN_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScheduleDate() <em>Schedule Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date SCHEDULE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScheduleDate() <em>Schedule Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduleDate()
	 * @generated
	 * @ordered
	 */
	protected Date scheduleDate = SCHEDULE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSources() <em>Sources</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSources()
	 * @generated
	 * @ordered
	 */
	protected EList<String> sources;

	/**
	 * The cached value of the '{@link #getEvolvedTo() <em>Evolved To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvolvedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractContractualElement> evolvedTo;

	/**
	 * The default value of the '{@link #isDropped() <em>Dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDropped()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DROPPED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDropped() <em>Dropped</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDropped()
	 * @generated
	 * @ordered
	 */
	protected boolean dropped = DROPPED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedDroppingReasons() <em>Owned Dropping Reasons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedDroppingReasons()
	 * @generated
	 * @ordered
	 */
	protected EList<Rationale> ownedDroppingReasons;

	/**
	 * The cached value of the '{@link #getChangeUncertainty() <em>Change Uncertainty</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeUncertainty()
	 * @generated
	 * @ordered
	 */
	protected Uncertainty changeUncertainty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractContractualElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.ABSTRACT_CONTRACTUAL_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Stakeholder> getStakeholders() {
		if (stakeholders == null) {
			stakeholders = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS);
		}
		return stakeholders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rationale> getOwnedRationales() {
		if (ownedRationales == null) {
			ownedRationales = new EObjectContainmentEList<Rationale>(Rationale.class, this, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES);
		}
		return ownedRationales;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContactInformation> getContactInformation() {
		if (contactInformation == null) {
			contactInformation = new EObjectResolvingEList<ContactInformation>(ContactInformation.class, this, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION);
		}
		return contactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getOriginDate() {
		return originDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginDate(Date newOriginDate) {
		Date oldOriginDate = originDate;
		originDate = newOriginDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE, oldOriginDate, originDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getScheduleDate() {
		return scheduleDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScheduleDate(Date newScheduleDate) {
		Date oldScheduleDate = scheduleDate;
		scheduleDate = newScheduleDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE, oldScheduleDate, scheduleDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSources() {
		if (sources == null) {
			sources = new EDataTypeUniqueEList<String>(String.class, this, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES);
		}
		return sources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractContractualElement> getEvolvedTo() {
		if (evolvedTo == null) {
			evolvedTo = new EObjectResolvingEList<AbstractContractualElement>(AbstractContractualElement.class, this, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO);
		}
		return evolvedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDropped() {
		return dropped;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDropped(boolean newDropped) {
		boolean oldDropped = dropped;
		dropped = newDropped;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED, oldDropped, dropped));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rationale> getOwnedDroppingReasons() {
		if (ownedDroppingReasons == null) {
			ownedDroppingReasons = new EObjectContainmentEList<Rationale>(Rationale.class, this, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS);
		}
		return ownedDroppingReasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uncertainty getChangeUncertainty() {
		return changeUncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeUncertainty(Uncertainty newChangeUncertainty, NotificationChain msgs) {
		Uncertainty oldChangeUncertainty = changeUncertainty;
		changeUncertainty = newChangeUncertainty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, oldChangeUncertainty, newChangeUncertainty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeUncertainty(Uncertainty newChangeUncertainty) {
		if (newChangeUncertainty != changeUncertainty) {
			NotificationChain msgs = null;
			if (changeUncertainty != null)
				msgs = ((InternalEObject)changeUncertainty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, null, msgs);
			if (newChangeUncertainty != null)
				msgs = ((InternalEObject)newChangeUncertainty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, null, msgs);
			msgs = basicSetChangeUncertainty(newChangeUncertainty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY, newChangeUncertainty, newChangeUncertainty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES:
				return ((InternalEList<?>)getOwnedRationales()).basicRemove(otherEnd, msgs);
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS:
				return ((InternalEList<?>)getOwnedDroppingReasons()).basicRemove(otherEnd, msgs);
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				return basicSetChangeUncertainty(null, msgs);
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
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				return getStakeholders();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES:
				return getOwnedRationales();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION:
				return getContactInformation();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE:
				return getOriginDate();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
				return getScheduleDate();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES:
				return getSources();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO:
				return getEvolvedTo();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED:
				return isDropped();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS:
				return getOwnedDroppingReasons();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				return getChangeUncertainty();
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
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				getStakeholders().clear();
				getStakeholders().addAll((Collection<? extends Stakeholder>)newValue);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES:
				getOwnedRationales().clear();
				getOwnedRationales().addAll((Collection<? extends Rationale>)newValue);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION:
				getContactInformation().clear();
				getContactInformation().addAll((Collection<? extends ContactInformation>)newValue);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE:
				setOriginDate((Date)newValue);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
				setScheduleDate((Date)newValue);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES:
				getSources().clear();
				getSources().addAll((Collection<? extends String>)newValue);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO:
				getEvolvedTo().clear();
				getEvolvedTo().addAll((Collection<? extends AbstractContractualElement>)newValue);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED:
				setDropped((Boolean)newValue);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS:
				getOwnedDroppingReasons().clear();
				getOwnedDroppingReasons().addAll((Collection<? extends Rationale>)newValue);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				setChangeUncertainty((Uncertainty)newValue);
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
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				getStakeholders().clear();
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES:
				getOwnedRationales().clear();
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION:
				getContactInformation().clear();
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE:
				setOriginDate(ORIGIN_DATE_EDEFAULT);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
				setScheduleDate(SCHEDULE_DATE_EDEFAULT);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES:
				getSources().clear();
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO:
				getEvolvedTo().clear();
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED:
				setDropped(DROPPED_EDEFAULT);
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS:
				getOwnedDroppingReasons().clear();
				return;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				setChangeUncertainty((Uncertainty)null);
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
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS:
				return stakeholders != null && !stakeholders.isEmpty();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES:
				return ownedRationales != null && !ownedRationales.isEmpty();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION:
				return contactInformation != null && !contactInformation.isEmpty();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE:
				return ORIGIN_DATE_EDEFAULT == null ? originDate != null : !ORIGIN_DATE_EDEFAULT.equals(originDate);
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE:
				return SCHEDULE_DATE_EDEFAULT == null ? scheduleDate != null : !SCHEDULE_DATE_EDEFAULT.equals(scheduleDate);
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES:
				return sources != null && !sources.isEmpty();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO:
				return evolvedTo != null && !evolvedTo.isEmpty();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED:
				return dropped != DROPPED_EDEFAULT;
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS:
				return ownedDroppingReasons != null && !ownedDroppingReasons.isEmpty();
			case RdalPackage.ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY:
				return changeUncertainty != null;
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
		result.append(" (originDate: ");
		result.append(originDate);
		result.append(", scheduleDate: ");
		result.append(scheduleDate);
		result.append(", sources: ");
		result.append(sources);
		result.append(", dropped: ");
		result.append(dropped);
		result.append(')');
		return result.toString();
	}

} //AbstractContractualElementImpl
