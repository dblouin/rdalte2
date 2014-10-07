/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RequirementsCoverageData;
import fr.openpeople.rdal2.model.rdal.TraceDesignElementRef;

import fr.openpeople.rdal2.model.rdal.VerifiableElement;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trace Design Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TraceDesignElementRefImpl#getNbRequirements <em>Nb Requirements</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TraceDesignElementRefImpl#getVerificationLevel <em>Verification Level</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TraceDesignElementRefImpl#getVerified <em>Verified</em>}</li>
 *   <li>{@link fr.openpeople.rdal2.model.rdal.impl.TraceDesignElementRefImpl#isContainer <em>Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TraceDesignElementRefImpl extends DesignElementReferenceImpl implements TraceDesignElementRef {
	/**
	 * The default value of the '{@link #getNbRequirements() <em>Nb Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRequirements()
	 * @generated
	 * @ordered
	 */
	protected static final int NB_REQUIREMENTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbRequirements() <em>Nb Requirements</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbRequirements()
	 * @generated
	 * @ordered
	 */
	protected int nbRequirements = NB_REQUIREMENTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerificationLevel() <em>Verification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationLevel()
	 * @generated
	 * @ordered
	 */
	protected static final Float VERIFICATION_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerificationLevel() <em>Verification Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerificationLevel()
	 * @generated
	 * @ordered
	 */
	protected Float verificationLevel = VERIFICATION_LEVEL_EDEFAULT;

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
	 * The default value of the '{@link #isContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONTAINER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isContainer() <em>Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isContainer()
	 * @generated
	 * @ordered
	 */
	protected boolean container = CONTAINER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TraceDesignElementRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RdalPackage.Literals.TRACE_DESIGN_ELEMENT_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbRequirements() {
		return nbRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbRequirements(int newNbRequirements) {
		int oldNbRequirements = nbRequirements;
		nbRequirements = newNbRequirements;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.TRACE_DESIGN_ELEMENT_REF__NB_REQUIREMENTS, oldNbRequirements, nbRequirements));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float getVerificationLevel() {
		return verificationLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerificationLevel(Float newVerificationLevel) {
		Float oldVerificationLevel = verificationLevel;
		verificationLevel = newVerificationLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFICATION_LEVEL, oldVerificationLevel, verificationLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFIED, oldVerified, verified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(boolean newContainer) {
		boolean oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RdalPackage.TRACE_DESIGN_ELEMENT_REF__CONTAINER, oldContainer, container));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void merge(TraceDesignElementRef modelElementReference) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__NB_REQUIREMENTS:
				return getNbRequirements();
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFICATION_LEVEL:
				return getVerificationLevel();
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFIED:
				return getVerified();
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__CONTAINER:
				return isContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__NB_REQUIREMENTS:
				setNbRequirements((Integer)newValue);
				return;
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFICATION_LEVEL:
				setVerificationLevel((Float)newValue);
				return;
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFIED:
				setVerified((Boolean)newValue);
				return;
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__CONTAINER:
				setContainer((Boolean)newValue);
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
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__NB_REQUIREMENTS:
				setNbRequirements(NB_REQUIREMENTS_EDEFAULT);
				return;
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFICATION_LEVEL:
				setVerificationLevel(VERIFICATION_LEVEL_EDEFAULT);
				return;
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFIED:
				setVerified(VERIFIED_EDEFAULT);
				return;
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__CONTAINER:
				setContainer(CONTAINER_EDEFAULT);
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
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__NB_REQUIREMENTS:
				return nbRequirements != NB_REQUIREMENTS_EDEFAULT;
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFICATION_LEVEL:
				return VERIFICATION_LEVEL_EDEFAULT == null ? verificationLevel != null : !VERIFICATION_LEVEL_EDEFAULT.equals(verificationLevel);
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFIED:
				return VERIFIED_EDEFAULT == null ? verified != null : !VERIFIED_EDEFAULT.equals(verified);
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF__CONTAINER:
				return container != CONTAINER_EDEFAULT;
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
		if (baseClass == RequirementsCoverageData.class) {
			switch (derivedFeatureID) {
				case RdalPackage.TRACE_DESIGN_ELEMENT_REF__NB_REQUIREMENTS: return RdalPackage.REQUIREMENTS_COVERAGE_DATA__NB_REQUIREMENTS;
				case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFICATION_LEVEL: return RdalPackage.REQUIREMENTS_COVERAGE_DATA__VERIFICATION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (derivedFeatureID) {
				case RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFIED: return RdalPackage.VERIFIABLE_ELEMENT__VERIFIED;
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
		if (baseClass == RequirementsCoverageData.class) {
			switch (baseFeatureID) {
				case RdalPackage.REQUIREMENTS_COVERAGE_DATA__NB_REQUIREMENTS: return RdalPackage.TRACE_DESIGN_ELEMENT_REF__NB_REQUIREMENTS;
				case RdalPackage.REQUIREMENTS_COVERAGE_DATA__VERIFICATION_LEVEL: return RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFICATION_LEVEL;
				default: return -1;
			}
		}
		if (baseClass == VerifiableElement.class) {
			switch (baseFeatureID) {
				case RdalPackage.VERIFIABLE_ELEMENT__VERIFIED: return RdalPackage.TRACE_DESIGN_ELEMENT_REF__VERIFIED;
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
		result.append(" (nbRequirements: ");
		result.append(nbRequirements);
		result.append(", verificationLevel: ");
		result.append(verificationLevel);
		result.append(", verified: ");
		result.append(verified);
		result.append(", container: ");
		result.append(container);
		result.append(')');
		return result.toString();
	}

} //TraceDesignElementReferenceImpl
