/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import java.util.Date;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.settings.model.settings.SettingsPackage;
import fr.openpeople.rdal2.model.rdal.AbstractContractualElement;
import fr.openpeople.rdal2.model.rdal.AbstractGoal;
import fr.openpeople.rdal2.model.rdal.AbstractRequirement;
import fr.openpeople.rdal2.model.rdal.ActorReference;
import fr.openpeople.rdal2.model.rdal.AggregationType;
import fr.openpeople.rdal2.model.rdal.Assumption;
import fr.openpeople.rdal2.model.rdal.Capability;
import fr.openpeople.rdal2.model.rdal.Conflict;
import fr.openpeople.rdal2.model.rdal.ContactInformation;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.ElementRefinement;
import fr.openpeople.rdal2.model.rdal.GoalRefinement;
import fr.openpeople.rdal2.model.rdal.GoalsPackage;
import fr.openpeople.rdal2.model.rdal.IdentifiedElement;
import fr.openpeople.rdal2.model.rdal.InteractionVariable;
import fr.openpeople.rdal2.model.rdal.InteractionVariableType;
import fr.openpeople.rdal2.model.rdal.Modality;
import fr.openpeople.rdal2.model.rdal.NonFunctionalGoal;
import fr.openpeople.rdal2.model.rdal.NonFunctionalProperty;
import fr.openpeople.rdal2.model.rdal.PrioritizedSatDesignElementRef;
import fr.openpeople.rdal2.model.rdal.QualityObjective;
import fr.openpeople.rdal2.model.rdal.Rationale;
import fr.openpeople.rdal2.model.rdal.RdalFactory;
import fr.openpeople.rdal2.model.rdal.RdalOrgPackage;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.RefManuallySelectedDesignElements;
import fr.openpeople.rdal2.model.rdal.RefQueryCollectedDesignElements;
import fr.openpeople.rdal2.model.rdal.ReferencedDesignElements;
import fr.openpeople.rdal2.model.rdal.RefineableElement;
import fr.openpeople.rdal2.model.rdal.Requirement;
import fr.openpeople.rdal2.model.rdal.RequirementRefinement;
import fr.openpeople.rdal2.model.rdal.RequirementsCoverageData;
import fr.openpeople.rdal2.model.rdal.RequirementsPackage;
import fr.openpeople.rdal2.model.rdal.SatisfiableDesignElementRef;
import fr.openpeople.rdal2.model.rdal.SatisfiableElement;
import fr.openpeople.rdal2.model.rdal.Sensitivity;
import fr.openpeople.rdal2.model.rdal.Specification;
import fr.openpeople.rdal2.model.rdal.Stakeholder;
import fr.openpeople.rdal2.model.rdal.SubElementReference;
import fr.openpeople.rdal2.model.rdal.SubGoalReference;
import fr.openpeople.rdal2.model.rdal.SubRequirementReference;
import fr.openpeople.rdal2.model.rdal.SystContextDesignElemRef;
import fr.openpeople.rdal2.model.rdal.SystOverviewDesignElemRef;
import fr.openpeople.rdal2.model.rdal.SystemContext;
import fr.openpeople.rdal2.model.rdal.SystemFunctionGoal;
import fr.openpeople.rdal2.model.rdal.SystemOverview;
import fr.openpeople.rdal2.model.rdal.TextualContractualElement;
import fr.openpeople.rdal2.model.rdal.Trace;
import fr.openpeople.rdal2.model.rdal.TraceDesignElementRef;
import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;
import fr.openpeople.rdal2.model.rdal.Uncertainty;
import fr.openpeople.rdal2.model.rdal.UserProperty;
import fr.openpeople.rdal2.model.rdal.Variable;
import fr.openpeople.rdal2.model.rdal.VerifiableDesignElementRef;
import fr.openpeople.rdal2.model.rdal.VerifiableElement;
import fr.openpeople.rdal2.model.rdal.VerificationActivity;
import fr.openpeople.rdal2.model.rdal.util.RdalValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdalPackageImpl extends EPackageImpl implements RdalPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass elementRefinementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementRefinementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalRefinementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceableToDesignElementsElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractContractualElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contactInformationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stakeholderEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rationaleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textualContractualElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass uncertaintyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfiableElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifiableElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specificationEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rdalOrgPackageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsPackageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass goalsPackageEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemOverviewEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemContextEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionVariableEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actorReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refineableElementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractRequirementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verificationActivityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assumptionEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractGoalEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemFunctionGoalEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonFunctionalGoalEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass qualityObjectiveEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conflictEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass designElementReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verifiableDesignElementRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass satisfiableDesignElementRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritizedSatDesignElementRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systOverviewDesignElemRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systContextDesignElemRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referencedDesignElementsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refManuallySelectedDesignElementsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refQueryCollectedDesignElementsEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceDesignElementRefEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requirementsCoverageDataEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonFunctionalPropertyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sensitivityEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subElementReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subRequirementReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subGoalReferenceEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userPropertyEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum interactionVariableTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum aggregationTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modalityEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType normalizedRatioEDataType = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveFactorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType positiveIntegerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.openpeople.rdal2.model.rdal.RdalPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RdalPackageImpl() {
		super(eNS_URI, RdalFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link RdalPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RdalPackage init() {
		if (isInited) return (RdalPackage)EPackage.Registry.INSTANCE.getEPackage(RdalPackage.eNS_URI);

		// Obtain or create and register package
		RdalPackageImpl theRdalPackage = (RdalPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RdalPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RdalPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		SettingsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theRdalPackage.createPackageContents();

		// Initialize created meta-data
		theRdalPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theRdalPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return RdalValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRdalPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RdalPackage.eNS_URI, theRdalPackage);
		return theRdalPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Name() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifiedElement_Description() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdentifiedElement_OwnedUserProperties() {
		return (EReference)identifiedElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getElementRefinement() {
		return elementRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementRefinement_SubElementRefEntries() {
		return (EAttribute)elementRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementRefinement_OwnedSubElementRefs() {
		return (EReference)elementRefinementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementRefinement_SubElements() {
		return (EReference)elementRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getElementRefinement_RefinedElementEntries() {
		return (EAttribute)elementRefinementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getElementRefinement_RefinedElement() {
		return (EReference)elementRefinementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementRefinement() {
		return requirementRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementRefinement_OwnedSubRequirementRefs() {
		return (EReference)requirementRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementRefinement_SubRequirements() {
		return (EReference)requirementRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementRefinement_RefinedRequirement() {
		return (EReference)requirementRefinementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalRefinement() {
		return goalRefinementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalRefinement_OwnedSubGoalRefs() {
		return (EReference)goalRefinementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalRefinement_SubGoals() {
		return (EReference)goalRefinementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalRefinement_RefinedGoal() {
		return (EReference)goalRefinementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceableToDesignElementsElement() {
		return traceableToDesignElementsElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceableToDesignElementsElement_OwnedReferencedDesignElements() {
		return (EReference)traceableToDesignElementsElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTraceableToDesignElementsElement_Specification() {
		return (EReference)traceableToDesignElementsElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractContractualElement() {
		return abstractContractualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContractualElement_Stakeholders() {
		return (EReference)abstractContractualElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContractualElement_OwnedRationales() {
		return (EReference)abstractContractualElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContractualElement_ContactInformation() {
		return (EReference)abstractContractualElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractContractualElement_OriginDate() {
		return (EAttribute)abstractContractualElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractContractualElement_ScheduleDate() {
		return (EAttribute)abstractContractualElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractContractualElement_Sources() {
		return (EAttribute)abstractContractualElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContractualElement_EvolvedTo() {
		return (EReference)abstractContractualElementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractContractualElement_Dropped() {
		return (EAttribute)abstractContractualElementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContractualElement_OwnedDroppingReasons() {
		return (EReference)abstractContractualElementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractContractualElement_ChangeUncertainty() {
		return (EReference)abstractContractualElementEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContactInformation() {
		return contactInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformation_Address() {
		return (EAttribute)contactInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformation_Email() {
		return (EAttribute)contactInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformation_PhoneNumber() {
		return (EAttribute)contactInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContactInformation_Country() {
		return (EAttribute)contactInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStakeholder() {
		return stakeholderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStakeholder_ContactInformation() {
		return (EReference)stakeholderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRationale() {
		return rationaleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRationale_Stakeholders() {
		return (EReference)rationaleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextualContractualElement() {
		return textualContractualElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextualContractualElement_OwnedExpression() {
		return (EReference)textualContractualElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextualContractualElement_OwnedCondition() {
		return (EReference)textualContractualElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextualContractualElement_DerivedFrom() {
		return (EReference)textualContractualElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextualContractualElement_Category() {
		return (EReference)textualContractualElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextualContractualElement_Priority() {
		return (EAttribute)textualContractualElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUncertainty() {
		return uncertaintyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_Volatility() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_CostsImpact() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_ScheduleImpact() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_TimeCriticality() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_Familiarity() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_RiskIndex() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_PropRiskIndex() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUncertainty_MaturityIndex() {
		return (EAttribute)uncertaintyEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatisfiableElement() {
		return satisfiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSatisfiableElement_SatisfactionLevel() {
		return (EAttribute)satisfiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerifiableElement() {
		return verifiableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerifiableElement_Verified() {
		return (EAttribute)verifiableElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecification() {
		return specificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_OwnedPackages() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_OwnedContactInformation() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_OwnedConflicts() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_OwnedSystOverview() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_ConstraintLanguagesSpec() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_OwnedActorReferences() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_PrimaryActors() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecification_Version() {
		return (EAttribute)specificationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_OwnedNonFuncProperties() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSpecification_OwnedStakeholders() {
		return (EReference)specificationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRdalOrgPackage() {
		return rdalOrgPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdalOrgPackage_Specification() {
		return (EReference)rdalOrgPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdalOrgPackage_SubPackages() {
		return (EReference)rdalOrgPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdalOrgPackage_ContractualElementEntries() {
		return (EAttribute)rdalOrgPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdalOrgPackage_Parent() {
		return (EReference)rdalOrgPackageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRdalOrgPackage_RefinementEntries() {
		return (EAttribute)rdalOrgPackageEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRdalOrgPackage_OwnedRefinements() {
		return (EReference)rdalOrgPackageEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsPackage() {
		return requirementsPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsPackage_OwnedRequirements() {
		return (EReference)requirementsPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsPackage_FunctionUsedIn() {
		return (EReference)requirementsPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirementsPackage_OwnedRequirementsRefinements() {
		return (EReference)requirementsPackageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGoalsPackage() {
		return goalsPackageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalsPackage_OwnedGoals() {
		return (EReference)goalsPackageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGoalsPackage_OwnedGoalRefinements() {
		return (EReference)goalsPackageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemOverview() {
		return systemOverviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemOverview_OwnedCapabilities() {
		return (EReference)systemOverviewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemOverview_GlobalSystem() {
		return (EReference)systemOverviewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemOverview_SystemToBe() {
		return (EReference)systemOverviewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemOverview_OwnedContexts() {
		return (EReference)systemOverviewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemOverview_OwnedSystemBoundary() {
		return (EReference)systemOverviewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSystemOverview_Purpose() {
		return (EAttribute)systemOverviewEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapability() {
		return capabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemContext() {
		return systemContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_GlobalSystemContext() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_SystemContextBoundary() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_Actors() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_SystemOverview() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemContext_SystemToBe() {
		return (EReference)systemContextEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_DesignVariable() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionVariable() {
		return interactionVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionVariable_Type() {
		return (EAttribute)interactionVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionVariable_Neglected() {
		return (EAttribute)interactionVariableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActorReference() {
		return actorReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActorReference_ReferencedActors() {
		return (EReference)actorReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefineableElement() {
		return refineableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractRequirement() {
		return abstractRequirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_OwnedVerifiedBy() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractRequirement_Risk() {
		return (EAttribute)abstractRequirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractRequirement_Package() {
		return (EReference)abstractRequirementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerificationActivity() {
		return verificationActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationActivity_ExternalRefs() {
		return (EReference)verificationActivityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVerificationActivity_Passed() {
		return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationActivity_Requirements() {
		return (EReference)verificationActivityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVerificationActivity_Category() {
		return (EReference)verificationActivityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirement() {
		return requirementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_ImageAssumptions() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequirement_FunctionUsedIn() {
		return (EReference)requirementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssumption() {
		return assumptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssumption_ImageRequirement() {
		return (EReference)assumptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssumption_ImageAssumptions() {
		return (EReference)assumptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractGoal() {
		return abstractGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGoal_Conflicts() {
		return (EReference)abstractGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractGoal_Package() {
		return (EReference)abstractGoalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemFunctionGoal() {
		return systemFunctionGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemFunctionGoal_UseCases() {
		return (EReference)systemFunctionGoalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonFunctionalGoal() {
		return nonFunctionalGoalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQualityObjective() {
		return qualityObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityObjective_Property() {
		return (EReference)qualityObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getQualityObjective_OwnedSensitivity() {
		return (EReference)qualityObjectiveEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityObjective_Modality() {
		return (EAttribute)qualityObjectiveEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQualityObjective_Bound() {
		return (EAttribute)qualityObjectiveEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConflict() {
		return conflictEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_Goal() {
		return (EReference)conflictEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConflict_ContractualElement() {
		return (EReference)conflictEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConflict_Degree() {
		return (EAttribute)conflictEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDesignElementReference() {
		return designElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignElementReference_DesignElement() {
		return (EReference)designElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignElementReference_Parent() {
		return (EReference)designElementReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDesignElementReference_EvaluationResult() {
		return (EAttribute)designElementReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDesignElementReference_ParentTraceableElement() {
		return (EReference)designElementReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVerifiableDesignElementRef() {
		return verifiableDesignElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSatisfiableDesignElementRef() {
		return satisfiableDesignElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrioritizedSatDesignElementRef() {
		return prioritizedSatDesignElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritizedSatDesignElementRef_Priority() {
		return (EAttribute)prioritizedSatDesignElementRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritizedSatDesignElementRef_Weight() {
		return (EAttribute)prioritizedSatDesignElementRefEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystOverviewDesignElemRef() {
		return systOverviewDesignElemRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystContextDesignElemRef() {
		return systContextDesignElemRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferencedDesignElements() {
		return referencedDesignElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferencedDesignElements_OwnedDesignElementRefs() {
		return (EReference)referencedDesignElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferencedDesignElements_AgregationType() {
		return (EAttribute)referencedDesignElementsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefManuallySelectedDesignElements() {
		return refManuallySelectedDesignElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefQueryCollectedDesignElements() {
		return refQueryCollectedDesignElementsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefQueryCollectedDesignElements_QueryExpression() {
		return (EReference)refQueryCollectedDesignElementsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTraceDesignElementRef() {
		return traceDesignElementRefEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTraceDesignElementRef_Container() {
		return (EAttribute)traceDesignElementRefEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrace() {
		return traceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrace_Specifications() {
		return (EReference)traceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequirementsCoverageData() {
		return requirementsCoverageDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsCoverageData_NbRequirements() {
		return (EAttribute)requirementsCoverageDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequirementsCoverageData_VerificationLevel() {
		return (EAttribute)requirementsCoverageDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonFunctionalProperty() {
		return nonFunctionalPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonFunctionalProperty_DesignProperty() {
		return (EReference)nonFunctionalPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSensitivity() {
		return sensitivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubElementReference() {
		return subElementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubElementReference_Weight() {
		return (EAttribute)subElementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubElementReference_ReferencedElementEntries() {
		return (EAttribute)subElementReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubElementReference_ReferencedElement() {
		return (EReference)subElementReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubRequirementReference() {
		return subRequirementReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubRequirementReference_Requirement() {
		return (EReference)subRequirementReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubGoalReference() {
		return subGoalReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubGoalReference_Goal() {
		return (EReference)subGoalReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserProperty() {
		return userPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProperty_Name() {
		return (EAttribute)userPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserProperty_Value() {
		return (EAttribute)userPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInteractionVariableType() {
		return interactionVariableTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAggregationType() {
		return aggregationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getModality() {
		return modalityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDate() {
		return dateEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNormalizedRatio() {
		return normalizedRatioEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveFactor() {
		return positiveFactorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPositiveInteger() {
		return positiveIntegerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdalFactory getRdalFactory() {
		return (RdalFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__NAME);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__DESCRIPTION);
		createEReference(identifiedElementEClass, IDENTIFIED_ELEMENT__OWNED_USER_PROPERTIES);

		elementRefinementEClass = createEClass(ELEMENT_REFINEMENT);
		createEAttribute(elementRefinementEClass, ELEMENT_REFINEMENT__SUB_ELEMENT_REF_ENTRIES);
		createEReference(elementRefinementEClass, ELEMENT_REFINEMENT__SUB_ELEMENTS);
		createEAttribute(elementRefinementEClass, ELEMENT_REFINEMENT__REFINED_ELEMENT_ENTRIES);
		createEReference(elementRefinementEClass, ELEMENT_REFINEMENT__OWNED_SUB_ELEMENT_REFS);
		createEReference(elementRefinementEClass, ELEMENT_REFINEMENT__REFINED_ELEMENT);

		requirementRefinementEClass = createEClass(REQUIREMENT_REFINEMENT);
		createEReference(requirementRefinementEClass, REQUIREMENT_REFINEMENT__OWNED_SUB_REQUIREMENT_REFS);
		createEReference(requirementRefinementEClass, REQUIREMENT_REFINEMENT__SUB_REQUIREMENTS);
		createEReference(requirementRefinementEClass, REQUIREMENT_REFINEMENT__REFINED_REQUIREMENT);

		goalRefinementEClass = createEClass(GOAL_REFINEMENT);
		createEReference(goalRefinementEClass, GOAL_REFINEMENT__OWNED_SUB_GOAL_REFS);
		createEReference(goalRefinementEClass, GOAL_REFINEMENT__SUB_GOALS);
		createEReference(goalRefinementEClass, GOAL_REFINEMENT__REFINED_GOAL);

		traceableToDesignElementsElementEClass = createEClass(TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT);
		createEReference(traceableToDesignElementsElementEClass, TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__OWNED_REFERENCED_DESIGN_ELEMENTS);
		createEReference(traceableToDesignElementsElementEClass, TRACEABLE_TO_DESIGN_ELEMENTS_ELEMENT__SPECIFICATION);

		abstractContractualElementEClass = createEClass(ABSTRACT_CONTRACTUAL_ELEMENT);
		createEReference(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__STAKEHOLDERS);
		createEReference(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_RATIONALES);
		createEReference(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__CONTACT_INFORMATION);
		createEAttribute(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__ORIGIN_DATE);
		createEAttribute(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__SCHEDULE_DATE);
		createEAttribute(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__SOURCES);
		createEReference(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__EVOLVED_TO);
		createEAttribute(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__DROPPED);
		createEReference(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__OWNED_DROPPING_REASONS);
		createEReference(abstractContractualElementEClass, ABSTRACT_CONTRACTUAL_ELEMENT__CHANGE_UNCERTAINTY);

		contactInformationEClass = createEClass(CONTACT_INFORMATION);
		createEAttribute(contactInformationEClass, CONTACT_INFORMATION__ADDRESS);
		createEAttribute(contactInformationEClass, CONTACT_INFORMATION__EMAIL);
		createEAttribute(contactInformationEClass, CONTACT_INFORMATION__PHONE_NUMBER);
		createEAttribute(contactInformationEClass, CONTACT_INFORMATION__COUNTRY);

		stakeholderEClass = createEClass(STAKEHOLDER);
		createEReference(stakeholderEClass, STAKEHOLDER__CONTACT_INFORMATION);

		rationaleEClass = createEClass(RATIONALE);
		createEReference(rationaleEClass, RATIONALE__STAKEHOLDERS);

		textualContractualElementEClass = createEClass(TEXTUAL_CONTRACTUAL_ELEMENT);
		createEReference(textualContractualElementEClass, TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_EXPRESSION);
		createEReference(textualContractualElementEClass, TEXTUAL_CONTRACTUAL_ELEMENT__OWNED_CONDITION);
		createEReference(textualContractualElementEClass, TEXTUAL_CONTRACTUAL_ELEMENT__DERIVED_FROM);
		createEReference(textualContractualElementEClass, TEXTUAL_CONTRACTUAL_ELEMENT__CATEGORY);
		createEAttribute(textualContractualElementEClass, TEXTUAL_CONTRACTUAL_ELEMENT__PRIORITY);

		uncertaintyEClass = createEClass(UNCERTAINTY);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__VOLATILITY);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__COSTS_IMPACT);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__SCHEDULE_IMPACT);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__TIME_CRITICALITY);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__FAMILIARITY);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__RISK_INDEX);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__PROP_RISK_INDEX);
		createEAttribute(uncertaintyEClass, UNCERTAINTY__MATURITY_INDEX);

		satisfiableElementEClass = createEClass(SATISFIABLE_ELEMENT);
		createEAttribute(satisfiableElementEClass, SATISFIABLE_ELEMENT__SATISFACTION_LEVEL);

		verifiableElementEClass = createEClass(VERIFIABLE_ELEMENT);
		createEAttribute(verifiableElementEClass, VERIFIABLE_ELEMENT__VERIFIED);

		specificationEClass = createEClass(SPECIFICATION);
		createEReference(specificationEClass, SPECIFICATION__OWNED_PACKAGES);
		createEReference(specificationEClass, SPECIFICATION__OWNED_CONTACT_INFORMATION);
		createEReference(specificationEClass, SPECIFICATION__OWNED_CONFLICTS);
		createEReference(specificationEClass, SPECIFICATION__OWNED_SYST_OVERVIEW);
		createEReference(specificationEClass, SPECIFICATION__CONSTRAINT_LANGUAGES_SPEC);
		createEReference(specificationEClass, SPECIFICATION__OWNED_ACTOR_REFERENCES);
		createEReference(specificationEClass, SPECIFICATION__PRIMARY_ACTORS);
		createEAttribute(specificationEClass, SPECIFICATION__VERSION);
		createEReference(specificationEClass, SPECIFICATION__OWNED_NON_FUNC_PROPERTIES);
		createEReference(specificationEClass, SPECIFICATION__OWNED_STAKEHOLDERS);

		rdalOrgPackageEClass = createEClass(RDAL_ORG_PACKAGE);
		createEReference(rdalOrgPackageEClass, RDAL_ORG_PACKAGE__SPECIFICATION);
		createEReference(rdalOrgPackageEClass, RDAL_ORG_PACKAGE__SUB_PACKAGES);
		createEAttribute(rdalOrgPackageEClass, RDAL_ORG_PACKAGE__CONTRACTUAL_ELEMENT_ENTRIES);
		createEReference(rdalOrgPackageEClass, RDAL_ORG_PACKAGE__PARENT);
		createEAttribute(rdalOrgPackageEClass, RDAL_ORG_PACKAGE__REFINEMENT_ENTRIES);
		createEReference(rdalOrgPackageEClass, RDAL_ORG_PACKAGE__OWNED_REFINEMENTS);

		requirementsPackageEClass = createEClass(REQUIREMENTS_PACKAGE);
		createEReference(requirementsPackageEClass, REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS);
		createEReference(requirementsPackageEClass, REQUIREMENTS_PACKAGE__FUNCTION_USED_IN);
		createEReference(requirementsPackageEClass, REQUIREMENTS_PACKAGE__OWNED_REQUIREMENTS_REFINEMENTS);

		goalsPackageEClass = createEClass(GOALS_PACKAGE);
		createEReference(goalsPackageEClass, GOALS_PACKAGE__OWNED_GOALS);
		createEReference(goalsPackageEClass, GOALS_PACKAGE__OWNED_GOAL_REFINEMENTS);

		systemOverviewEClass = createEClass(SYSTEM_OVERVIEW);
		createEReference(systemOverviewEClass, SYSTEM_OVERVIEW__OWNED_CAPABILITIES);
		createEReference(systemOverviewEClass, SYSTEM_OVERVIEW__GLOBAL_SYSTEM);
		createEReference(systemOverviewEClass, SYSTEM_OVERVIEW__SYSTEM_TO_BE);
		createEReference(systemOverviewEClass, SYSTEM_OVERVIEW__OWNED_CONTEXTS);
		createEReference(systemOverviewEClass, SYSTEM_OVERVIEW__OWNED_SYSTEM_BOUNDARY);
		createEAttribute(systemOverviewEClass, SYSTEM_OVERVIEW__PURPOSE);

		capabilityEClass = createEClass(CAPABILITY);

		systemContextEClass = createEClass(SYSTEM_CONTEXT);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__GLOBAL_SYSTEM_CONTEXT);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__SYSTEM_CONTEXT_BOUNDARY);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__ACTORS);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__SYSTEM_OVERVIEW);
		createEReference(systemContextEClass, SYSTEM_CONTEXT__SYSTEM_TO_BE);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__DESIGN_VARIABLE);

		interactionVariableEClass = createEClass(INTERACTION_VARIABLE);
		createEAttribute(interactionVariableEClass, INTERACTION_VARIABLE__TYPE);
		createEAttribute(interactionVariableEClass, INTERACTION_VARIABLE__NEGLECTED);

		actorReferenceEClass = createEClass(ACTOR_REFERENCE);
		createEReference(actorReferenceEClass, ACTOR_REFERENCE__REFERENCED_ACTORS);

		refineableElementEClass = createEClass(REFINEABLE_ELEMENT);

		abstractRequirementEClass = createEClass(ABSTRACT_REQUIREMENT);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__OWNED_VERIFIED_BY);
		createEAttribute(abstractRequirementEClass, ABSTRACT_REQUIREMENT__RISK);
		createEReference(abstractRequirementEClass, ABSTRACT_REQUIREMENT__PACKAGE);

		verificationActivityEClass = createEClass(VERIFICATION_ACTIVITY);
		createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__EXTERNAL_REFS);
		createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__PASSED);
		createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__REQUIREMENTS);
		createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__CATEGORY);

		requirementEClass = createEClass(REQUIREMENT);
		createEReference(requirementEClass, REQUIREMENT__IMAGE_ASSUMPTIONS);
		createEReference(requirementEClass, REQUIREMENT__FUNCTION_USED_IN);

		assumptionEClass = createEClass(ASSUMPTION);
		createEReference(assumptionEClass, ASSUMPTION__IMAGE_REQUIREMENT);
		createEReference(assumptionEClass, ASSUMPTION__IMAGE_ASSUMPTIONS);

		abstractGoalEClass = createEClass(ABSTRACT_GOAL);
		createEReference(abstractGoalEClass, ABSTRACT_GOAL__CONFLICTS);
		createEReference(abstractGoalEClass, ABSTRACT_GOAL__PACKAGE);

		systemFunctionGoalEClass = createEClass(SYSTEM_FUNCTION_GOAL);
		createEReference(systemFunctionGoalEClass, SYSTEM_FUNCTION_GOAL__USE_CASES);

		nonFunctionalGoalEClass = createEClass(NON_FUNCTIONAL_GOAL);

		qualityObjectiveEClass = createEClass(QUALITY_OBJECTIVE);
		createEReference(qualityObjectiveEClass, QUALITY_OBJECTIVE__PROPERTY);
		createEReference(qualityObjectiveEClass, QUALITY_OBJECTIVE__OWNED_SENSITIVITY);
		createEAttribute(qualityObjectiveEClass, QUALITY_OBJECTIVE__MODALITY);
		createEAttribute(qualityObjectiveEClass, QUALITY_OBJECTIVE__BOUND);

		conflictEClass = createEClass(CONFLICT);
		createEReference(conflictEClass, CONFLICT__GOAL);
		createEReference(conflictEClass, CONFLICT__CONTRACTUAL_ELEMENT);
		createEAttribute(conflictEClass, CONFLICT__DEGREE);

		referencedDesignElementsEClass = createEClass(REFERENCED_DESIGN_ELEMENTS);
		createEReference(referencedDesignElementsEClass, REFERENCED_DESIGN_ELEMENTS__OWNED_DESIGN_ELEMENT_REFS);
		createEAttribute(referencedDesignElementsEClass, REFERENCED_DESIGN_ELEMENTS__AGREGATION_TYPE);

		designElementReferenceEClass = createEClass(DESIGN_ELEMENT_REFERENCE);
		createEReference(designElementReferenceEClass, DESIGN_ELEMENT_REFERENCE__DESIGN_ELEMENT);
		createEReference(designElementReferenceEClass, DESIGN_ELEMENT_REFERENCE__PARENT);
		createEAttribute(designElementReferenceEClass, DESIGN_ELEMENT_REFERENCE__EVALUATION_RESULT);
		createEReference(designElementReferenceEClass, DESIGN_ELEMENT_REFERENCE__PARENT_TRACEABLE_ELEMENT);

		verifiableDesignElementRefEClass = createEClass(VERIFIABLE_DESIGN_ELEMENT_REF);

		satisfiableDesignElementRefEClass = createEClass(SATISFIABLE_DESIGN_ELEMENT_REF);

		prioritizedSatDesignElementRefEClass = createEClass(PRIORITIZED_SAT_DESIGN_ELEMENT_REF);
		createEAttribute(prioritizedSatDesignElementRefEClass, PRIORITIZED_SAT_DESIGN_ELEMENT_REF__PRIORITY);
		createEAttribute(prioritizedSatDesignElementRefEClass, PRIORITIZED_SAT_DESIGN_ELEMENT_REF__WEIGHT);

		systOverviewDesignElemRefEClass = createEClass(SYST_OVERVIEW_DESIGN_ELEM_REF);

		systContextDesignElemRefEClass = createEClass(SYST_CONTEXT_DESIGN_ELEM_REF);

		refManuallySelectedDesignElementsEClass = createEClass(REF_MANUALLY_SELECTED_DESIGN_ELEMENTS);

		refQueryCollectedDesignElementsEClass = createEClass(REF_QUERY_COLLECTED_DESIGN_ELEMENTS);
		createEReference(refQueryCollectedDesignElementsEClass, REF_QUERY_COLLECTED_DESIGN_ELEMENTS__QUERY_EXPRESSION);

		traceDesignElementRefEClass = createEClass(TRACE_DESIGN_ELEMENT_REF);
		createEAttribute(traceDesignElementRefEClass, TRACE_DESIGN_ELEMENT_REF__CONTAINER);

		traceEClass = createEClass(TRACE);
		createEReference(traceEClass, TRACE__SPECIFICATIONS);

		requirementsCoverageDataEClass = createEClass(REQUIREMENTS_COVERAGE_DATA);
		createEAttribute(requirementsCoverageDataEClass, REQUIREMENTS_COVERAGE_DATA__NB_REQUIREMENTS);
		createEAttribute(requirementsCoverageDataEClass, REQUIREMENTS_COVERAGE_DATA__VERIFICATION_LEVEL);

		nonFunctionalPropertyEClass = createEClass(NON_FUNCTIONAL_PROPERTY);
		createEReference(nonFunctionalPropertyEClass, NON_FUNCTIONAL_PROPERTY__DESIGN_PROPERTY);

		sensitivityEClass = createEClass(SENSITIVITY);

		subElementReferenceEClass = createEClass(SUB_ELEMENT_REFERENCE);
		createEAttribute(subElementReferenceEClass, SUB_ELEMENT_REFERENCE__WEIGHT);
		createEAttribute(subElementReferenceEClass, SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT_ENTRIES);
		createEReference(subElementReferenceEClass, SUB_ELEMENT_REFERENCE__REFERENCED_ELEMENT);

		subRequirementReferenceEClass = createEClass(SUB_REQUIREMENT_REFERENCE);
		createEReference(subRequirementReferenceEClass, SUB_REQUIREMENT_REFERENCE__REQUIREMENT);

		subGoalReferenceEClass = createEClass(SUB_GOAL_REFERENCE);
		createEReference(subGoalReferenceEClass, SUB_GOAL_REFERENCE__GOAL);

		userPropertyEClass = createEClass(USER_PROPERTY);
		createEAttribute(userPropertyEClass, USER_PROPERTY__NAME);
		createEAttribute(userPropertyEClass, USER_PROPERTY__VALUE);

		// Create enums
		interactionVariableTypeEEnum = createEEnum(INTERACTION_VARIABLE_TYPE);
		aggregationTypeEEnum = createEEnum(AGGREGATION_TYPE);
		modalityEEnum = createEEnum(MODALITY);

		// Create data types
		dateEDataType = createEDataType(DATE);
		positiveFactorEDataType = createEDataType(POSITIVE_FACTOR);
		positiveIntegerEDataType = createEDataType(POSITIVE_INTEGER);
		normalizedRatioEDataType = createEDataType(NORMALIZED_RATIO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConstraintsPackage theConstraintsPackage = (ConstraintsPackage)EPackage.Registry.INSTANCE.getEPackage(ConstraintsPackage.eNS_URI);
		SettingsPackage theSettingsPackage = (SettingsPackage)EPackage.Registry.INSTANCE.getEPackage(SettingsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		elementRefinementEClass.getESuperTypes().add(this.getIdentifiedElement());
		requirementRefinementEClass.getESuperTypes().add(this.getElementRefinement());
		requirementRefinementEClass.getESuperTypes().add(this.getSatisfiableElement());
		requirementRefinementEClass.getESuperTypes().add(this.getVerifiableElement());
		goalRefinementEClass.getESuperTypes().add(this.getElementRefinement());
		goalRefinementEClass.getESuperTypes().add(this.getSatisfiableElement());
		traceableToDesignElementsElementEClass.getESuperTypes().add(this.getIdentifiedElement());
		abstractContractualElementEClass.getESuperTypes().add(this.getTraceableToDesignElementsElement());
		contactInformationEClass.getESuperTypes().add(this.getIdentifiedElement());
		stakeholderEClass.getESuperTypes().add(this.getIdentifiedElement());
		rationaleEClass.getESuperTypes().add(this.getIdentifiedElement());
		textualContractualElementEClass.getESuperTypes().add(this.getAbstractContractualElement());
		uncertaintyEClass.getESuperTypes().add(this.getIdentifiedElement());
		specificationEClass.getESuperTypes().add(this.getAbstractContractualElement());
		specificationEClass.getESuperTypes().add(this.getVerifiableElement());
		specificationEClass.getESuperTypes().add(this.getSatisfiableElement());
		rdalOrgPackageEClass.getESuperTypes().add(this.getIdentifiedElement());
		requirementsPackageEClass.getESuperTypes().add(this.getRdalOrgPackage());
		requirementsPackageEClass.getESuperTypes().add(this.getSatisfiableElement());
		requirementsPackageEClass.getESuperTypes().add(this.getVerifiableElement());
		goalsPackageEClass.getESuperTypes().add(this.getRdalOrgPackage());
		goalsPackageEClass.getESuperTypes().add(this.getSatisfiableElement());
		systemOverviewEClass.getESuperTypes().add(this.getAbstractContractualElement());
		capabilityEClass.getESuperTypes().add(this.getIdentifiedElement());
		systemContextEClass.getESuperTypes().add(this.getAbstractContractualElement());
		variableEClass.getESuperTypes().add(this.getIdentifiedElement());
		interactionVariableEClass.getESuperTypes().add(this.getVariable());
		actorReferenceEClass.getESuperTypes().add(this.getIdentifiedElement());
		abstractRequirementEClass.getESuperTypes().add(this.getTextualContractualElement());
		abstractRequirementEClass.getESuperTypes().add(this.getSatisfiableElement());
		abstractRequirementEClass.getESuperTypes().add(this.getVerifiableElement());
		verificationActivityEClass.getESuperTypes().add(this.getIdentifiedElement());
		requirementEClass.getESuperTypes().add(this.getAbstractRequirement());
		requirementEClass.getESuperTypes().add(this.getRefineableElement());
		assumptionEClass.getESuperTypes().add(this.getAbstractRequirement());
		abstractGoalEClass.getESuperTypes().add(this.getTextualContractualElement());
		abstractGoalEClass.getESuperTypes().add(this.getSatisfiableElement());
		abstractGoalEClass.getESuperTypes().add(this.getRefineableElement());
		systemFunctionGoalEClass.getESuperTypes().add(this.getAbstractGoal());
		nonFunctionalGoalEClass.getESuperTypes().add(this.getAbstractGoal());
		qualityObjectiveEClass.getESuperTypes().add(this.getNonFunctionalGoal());
		conflictEClass.getESuperTypes().add(this.getIdentifiedElement());
		referencedDesignElementsEClass.getESuperTypes().add(this.getIdentifiedElement());
		designElementReferenceEClass.getESuperTypes().add(this.getIdentifiedElement());
		verifiableDesignElementRefEClass.getESuperTypes().add(this.getDesignElementReference());
		verifiableDesignElementRefEClass.getESuperTypes().add(this.getVerifiableElement());
		satisfiableDesignElementRefEClass.getESuperTypes().add(this.getDesignElementReference());
		satisfiableDesignElementRefEClass.getESuperTypes().add(this.getSatisfiableElement());
		prioritizedSatDesignElementRefEClass.getESuperTypes().add(this.getSatisfiableDesignElementRef());
		systOverviewDesignElemRefEClass.getESuperTypes().add(this.getDesignElementReference());
		systContextDesignElemRefEClass.getESuperTypes().add(this.getDesignElementReference());
		refManuallySelectedDesignElementsEClass.getESuperTypes().add(this.getReferencedDesignElements());
		refQueryCollectedDesignElementsEClass.getESuperTypes().add(this.getReferencedDesignElements());
		traceDesignElementRefEClass.getESuperTypes().add(this.getDesignElementReference());
		traceDesignElementRefEClass.getESuperTypes().add(this.getRequirementsCoverageData());
		traceDesignElementRefEClass.getESuperTypes().add(this.getVerifiableElement());
		traceEClass.getESuperTypes().add(this.getReferencedDesignElements());
		requirementsCoverageDataEClass.getESuperTypes().add(this.getIdentifiedElement());
		nonFunctionalPropertyEClass.getESuperTypes().add(this.getIdentifiedElement());
		sensitivityEClass.getESuperTypes().add(this.getTraceableToDesignElementsElement());
		subElementReferenceEClass.getESuperTypes().add(this.getIdentifiedElement());
		subRequirementReferenceEClass.getESuperTypes().add(this.getSubElementReference());
		subGoalReferenceEClass.getESuperTypes().add(this.getSubElementReference());

		// Initialize classes and features; add operations and parameters
		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIdentifiedElement_Description(), ecorePackage.getEString(), "description", null, 0, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIdentifiedElement_OwnedUserProperties(), this.getUserProperty(), null, "ownedUserProperties", null, 0, -1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(elementRefinementEClass, ElementRefinement.class, "ElementRefinement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getElementRefinement_SubElementRefEntries(), ecorePackage.getEFeatureMapEntry(), "subElementRefEntries", null, 1, -1, ElementRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementRefinement_SubElements(), this.getRefineableElement(), null, "subElements", null, 1, -1, ElementRefinement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getElementRefinement_RefinedElementEntries(), ecorePackage.getEFeatureMapEntry(), "refinedElementEntries", null, 1, 1, ElementRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementRefinement_OwnedSubElementRefs(), this.getSubElementReference(), null, "ownedSubElementRefs", null, 0, -1, ElementRefinement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElementRefinement_RefinedElement(), this.getRefineableElement(), null, "refinedElement", null, 1, 1, ElementRefinement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(requirementRefinementEClass, RequirementRefinement.class, "RequirementRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementRefinement_OwnedSubRequirementRefs(), this.getSubRequirementReference(), null, "ownedSubRequirementRefs", null, 1, -1, RequirementRefinement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementRefinement_SubRequirements(), this.getAbstractRequirement(), null, "subRequirements", null, 1, -1, RequirementRefinement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementRefinement_RefinedRequirement(), this.getRequirement(), null, "refinedRequirement", null, 1, 1, RequirementRefinement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(goalRefinementEClass, GoalRefinement.class, "GoalRefinement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoalRefinement_OwnedSubGoalRefs(), this.getSubGoalReference(), null, "ownedSubGoalRefs", null, 1, -1, GoalRefinement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGoalRefinement_SubGoals(), this.getAbstractGoal(), null, "subGoals", null, 1, -1, GoalRefinement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGoalRefinement_RefinedGoal(), this.getAbstractGoal(), null, "refinedGoal", null, 1, 1, GoalRefinement.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(traceableToDesignElementsElementEClass, TraceableToDesignElementsElement.class, "TraceableToDesignElementsElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTraceableToDesignElementsElement_OwnedReferencedDesignElements(), this.getReferencedDesignElements(), null, "ownedReferencedDesignElements", null, 0, 1, TraceableToDesignElementsElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTraceableToDesignElementsElement_Specification(), this.getSpecification(), null, "specification", null, 1, 1, TraceableToDesignElementsElement.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(abstractContractualElementEClass, AbstractContractualElement.class, "AbstractContractualElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractContractualElement_Stakeholders(), this.getStakeholder(), null, "stakeholders", null, 0, -1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractContractualElement_OwnedRationales(), this.getRationale(), null, "ownedRationales", null, 0, -1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractContractualElement_ContactInformation(), this.getContactInformation(), null, "contactInformation", null, 0, -1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractContractualElement_OriginDate(), this.getDate(), "originDate", null, 0, 1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractContractualElement_ScheduleDate(), this.getDate(), "scheduleDate", null, 0, 1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractContractualElement_Sources(), ecorePackage.getEString(), "sources", null, 0, -1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractContractualElement_EvolvedTo(), this.getAbstractContractualElement(), null, "evolvedTo", null, 0, -1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractContractualElement_Dropped(), ecorePackage.getEBoolean(), "dropped", null, 1, 1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractContractualElement_OwnedDroppingReasons(), this.getRationale(), null, "ownedDroppingReasons", null, 0, -1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractContractualElement_ChangeUncertainty(), this.getUncertainty(), null, "changeUncertainty", null, 0, 1, AbstractContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(contactInformationEClass, ContactInformation.class, "ContactInformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContactInformation_Address(), ecorePackage.getEString(), "address", null, 0, 1, ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformation_Email(), ecorePackage.getEString(), "email", null, 0, 1, ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformation_PhoneNumber(), ecorePackage.getEString(), "phoneNumber", null, 0, 1, ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContactInformation_Country(), ecorePackage.getEString(), "country", null, 0, 1, ContactInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStakeholder_ContactInformation(), this.getContactInformation(), null, "contactInformation", null, 1, -1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rationaleEClass, Rationale.class, "Rationale", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRationale_Stakeholders(), this.getStakeholder(), null, "stakeholders", null, 1, -1, Rationale.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textualContractualElementEClass, TextualContractualElement.class, "TextualContractualElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTextualContractualElement_OwnedExpression(), theConstraintsPackage.getExpression(), null, "ownedExpression", null, 1, 1, TextualContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextualContractualElement_OwnedCondition(), theConstraintsPackage.getExpression(), null, "ownedCondition", null, 0, 1, TextualContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextualContractualElement_DerivedFrom(), this.getTextualContractualElement(), null, "derivedFrom", null, 0, -1, TextualContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextualContractualElement_Category(), theSettingsPackage.getCategory(), null, "category", null, 0, 1, TextualContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextualContractualElement_Priority(), this.getNormalizedRatio(), "priority", null, 0, 1, TextualContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(uncertaintyEClass, Uncertainty.class, "Uncertainty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUncertainty_Volatility(), this.getNormalizedRatio(), "volatility", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_CostsImpact(), this.getPositiveFactor(), "costsImpact", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_ScheduleImpact(), this.getPositiveFactor(), "scheduleImpact", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_TimeCriticality(), this.getNormalizedRatio(), "timeCriticality", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_Familiarity(), this.getNormalizedRatio(), "familiarity", null, 1, 1, Uncertainty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_RiskIndex(), this.getNormalizedRatio(), "riskIndex", null, 0, 1, Uncertainty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_PropRiskIndex(), this.getNormalizedRatio(), "propRiskIndex", null, 0, 1, Uncertainty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUncertainty_MaturityIndex(), this.getNormalizedRatio(), "maturityIndex", null, 0, 1, Uncertainty.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(satisfiableElementEClass, SatisfiableElement.class, "SatisfiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSatisfiableElement_SatisfactionLevel(), this.getNormalizedRatio(), "satisfactionLevel", null, 0, 1, SatisfiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verifiableElementEClass, VerifiableElement.class, "VerifiableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerifiableElement_Verified(), ecorePackage.getEBooleanObject(), "verified", null, 0, 1, VerifiableElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(specificationEClass, Specification.class, "Specification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSpecification_OwnedPackages(), this.getRdalOrgPackage(), this.getRdalOrgPackage_Specification(), "ownedPackages", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_OwnedContactInformation(), this.getContactInformation(), null, "ownedContactInformation", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_OwnedConflicts(), this.getConflict(), null, "ownedConflicts", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_OwnedSystOverview(), this.getSystemOverview(), null, "ownedSystOverview", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_ConstraintLanguagesSpec(), theConstraintsPackage.getConstraintLanguagesSpec(), null, "constraintLanguagesSpec", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_OwnedActorReferences(), this.getActorReference(), null, "ownedActorReferences", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_PrimaryActors(), ecorePackage.getEObject(), null, "primaryActors", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecification_Version(), ecorePackage.getEString(), "version", null, 0, 1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_OwnedNonFuncProperties(), this.getNonFunctionalProperty(), null, "ownedNonFuncProperties", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpecification_OwnedStakeholders(), this.getStakeholder(), null, "ownedStakeholders", null, 0, -1, Specification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rdalOrgPackageEClass, RdalOrgPackage.class, "RdalOrgPackage", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRdalOrgPackage_Specification(), this.getSpecification(), this.getSpecification_OwnedPackages(), "specification", null, 1, 1, RdalOrgPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdalOrgPackage_SubPackages(), this.getRdalOrgPackage(), this.getRdalOrgPackage_Parent(), "subPackages", null, 0, -1, RdalOrgPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdalOrgPackage_ContractualElementEntries(), ecorePackage.getEFeatureMapEntry(), "contractualElementEntries", null, 0, -1, RdalOrgPackage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdalOrgPackage_Parent(), this.getRdalOrgPackage(), this.getRdalOrgPackage_SubPackages(), "parent", null, 0, 1, RdalOrgPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRdalOrgPackage_RefinementEntries(), ecorePackage.getEFeatureMapEntry(), "refinementEntries", null, 0, -1, RdalOrgPackage.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRdalOrgPackage_OwnedRefinements(), this.getElementRefinement(), null, "ownedRefinements", null, 0, -1, RdalOrgPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(requirementsPackageEClass, RequirementsPackage.class, "RequirementsPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirementsPackage_OwnedRequirements(), this.getAbstractRequirement(), this.getAbstractRequirement_Package(), "ownedRequirements", null, 1, -1, RequirementsPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsPackage_FunctionUsedIn(), ecorePackage.getEObject(), null, "functionUsedIn", null, 0, 1, RequirementsPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirementsPackage_OwnedRequirementsRefinements(), this.getRequirementRefinement(), null, "ownedRequirementsRefinements", null, 0, -1, RequirementsPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(goalsPackageEClass, GoalsPackage.class, "GoalsPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGoalsPackage_OwnedGoals(), this.getAbstractGoal(), this.getAbstractGoal_Package(), "ownedGoals", null, 1, -1, GoalsPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getGoalsPackage_OwnedGoalRefinements(), this.getGoalRefinement(), null, "ownedGoalRefinements", null, 0, -1, GoalsPackage.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(systemOverviewEClass, SystemOverview.class, "SystemOverview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemOverview_OwnedCapabilities(), this.getCapability(), null, "ownedCapabilities", null, 1, -1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemOverview_GlobalSystem(), ecorePackage.getEObject(), null, "globalSystem", null, 1, 1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemOverview_SystemToBe(), ecorePackage.getEObject(), null, "systemToBe", null, 1, 1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemOverview_OwnedContexts(), this.getSystemContext(), this.getSystemContext_SystemOverview(), "ownedContexts", null, 1, -1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemOverview_OwnedSystemBoundary(), this.getInteractionVariable(), null, "ownedSystemBoundary", null, 1, -1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemOverview_Purpose(), ecorePackage.getEString(), "purpose", null, 1, 1, SystemOverview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capabilityEClass, Capability.class, "Capability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systemContextEClass, SystemContext.class, "SystemContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemContext_GlobalSystemContext(), ecorePackage.getEObject(), null, "globalSystemContext", null, 1, 1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemContext_SystemContextBoundary(), this.getInteractionVariable(), null, "systemContextBoundary", null, 1, -1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemContext_Actors(), this.getActorReference(), null, "actors", null, 0, -1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemContext_SystemOverview(), this.getSystemOverview(), this.getSystemOverview_OwnedContexts(), "systemOverview", null, 0, 1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemContext_SystemToBe(), ecorePackage.getEObject(), null, "systemToBe", null, 1, 1, SystemContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_DesignVariable(), ecorePackage.getEObject(), null, "designVariable", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interactionVariableEClass, InteractionVariable.class, "InteractionVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionVariable_Type(), this.getInteractionVariableType(), "type", null, 1, 1, InteractionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInteractionVariable_Neglected(), ecorePackage.getEBoolean(), "neglected", null, 1, 1, InteractionVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actorReferenceEClass, ActorReference.class, "ActorReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActorReference_ReferencedActors(), ecorePackage.getEObject(), null, "referencedActors", null, 1, -1, ActorReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refineableElementEClass, RefineableElement.class, "RefineableElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(abstractRequirementEClass, AbstractRequirement.class, "AbstractRequirement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractRequirement_OwnedVerifiedBy(), this.getVerificationActivity(), this.getVerificationActivity_Requirements(), "ownedVerifiedBy", null, 0, -1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractRequirement_Risk(), this.getNormalizedRatio(), "risk", null, 0, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractRequirement_Package(), this.getRequirementsPackage(), this.getRequirementsPackage_OwnedRequirements(), "package", null, 1, 1, AbstractRequirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verificationActivityEClass, VerificationActivity.class, "VerificationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVerificationActivity_ExternalRefs(), ecorePackage.getEObject(), null, "externalRefs", null, 0, -1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVerificationActivity_Passed(), ecorePackage.getEBoolean(), "passed", null, 1, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationActivity_Requirements(), this.getAbstractRequirement(), this.getAbstractRequirement_OwnedVerifiedBy(), "requirements", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVerificationActivity_Category(), theSettingsPackage.getCategory(), null, "category", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequirement_ImageAssumptions(), this.getAssumption(), this.getAssumption_ImageRequirement(), "imageAssumptions", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRequirement_FunctionUsedIn(), ecorePackage.getEObject(), null, "functionUsedIn", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assumptionEClass, Assumption.class, "Assumption", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssumption_ImageRequirement(), this.getRequirement(), this.getRequirement_ImageAssumptions(), "imageRequirement", null, 0, 1, Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssumption_ImageAssumptions(), this.getAssumption(), null, "imageAssumptions", null, 0, -1, Assumption.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractGoalEClass, AbstractGoal.class, "AbstractGoal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractGoal_Conflicts(), this.getConflict(), this.getConflict_Goal(), "conflicts", null, 0, -1, AbstractGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractGoal_Package(), this.getGoalsPackage(), this.getGoalsPackage_OwnedGoals(), "package", null, 1, 1, AbstractGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemFunctionGoalEClass, SystemFunctionGoal.class, "SystemFunctionGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemFunctionGoal_UseCases(), ecorePackage.getEObject(), null, "useCases", null, 0, -1, SystemFunctionGoal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonFunctionalGoalEClass, NonFunctionalGoal.class, "NonFunctionalGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(qualityObjectiveEClass, QualityObjective.class, "QualityObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQualityObjective_Property(), this.getNonFunctionalProperty(), null, "property", null, 1, 1, QualityObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getQualityObjective_OwnedSensitivity(), this.getSensitivity(), null, "ownedSensitivity", null, 1, 1, QualityObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityObjective_Modality(), this.getModality(), "modality", null, 1, 1, QualityObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getQualityObjective_Bound(), ecorePackage.getEDouble(), "bound", null, 1, 1, QualityObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conflictEClass, Conflict.class, "Conflict", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConflict_Goal(), this.getAbstractGoal(), this.getAbstractGoal_Conflicts(), "goal", null, 1, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConflict_ContractualElement(), this.getAbstractContractualElement(), null, "contractualElement", null, 1, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConflict_Degree(), this.getNormalizedRatio(), "degree", null, 1, 1, Conflict.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referencedDesignElementsEClass, ReferencedDesignElements.class, "ReferencedDesignElements", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferencedDesignElements_OwnedDesignElementRefs(), this.getDesignElementReference(), this.getDesignElementReference_Parent(), "ownedDesignElementRefs", null, 1, -1, ReferencedDesignElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferencedDesignElements_AgregationType(), this.getAggregationType(), "agregationType", null, 0, 1, ReferencedDesignElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(designElementReferenceEClass, DesignElementReference.class, "DesignElementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDesignElementReference_DesignElement(), ecorePackage.getEObject(), null, "designElement", null, 1, 1, DesignElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignElementReference_Parent(), this.getReferencedDesignElements(), this.getReferencedDesignElements_OwnedDesignElementRefs(), "parent", null, 1, 1, DesignElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDesignElementReference_EvaluationResult(), ecorePackage.getEString(), "evaluationResult", null, 0, 1, DesignElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDesignElementReference_ParentTraceableElement(), this.getTraceableToDesignElementsElement(), null, "parentTraceableElement", null, 1, 1, DesignElementReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(verifiableDesignElementRefEClass, VerifiableDesignElementRef.class, "VerifiableDesignElementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(satisfiableDesignElementRefEClass, SatisfiableDesignElementRef.class, "SatisfiableDesignElementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(prioritizedSatDesignElementRefEClass, PrioritizedSatDesignElementRef.class, "PrioritizedSatDesignElementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrioritizedSatDesignElementRef_Priority(), this.getPositiveInteger(), "priority", null, 1, 1, PrioritizedSatDesignElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrioritizedSatDesignElementRef_Weight(), this.getNormalizedRatio(), "weight", null, 0, 1, PrioritizedSatDesignElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systOverviewDesignElemRefEClass, SystOverviewDesignElemRef.class, "SystOverviewDesignElemRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(systContextDesignElemRefEClass, SystContextDesignElemRef.class, "SystContextDesignElemRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refManuallySelectedDesignElementsEClass, RefManuallySelectedDesignElements.class, "RefManuallySelectedDesignElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(refQueryCollectedDesignElementsEClass, RefQueryCollectedDesignElements.class, "RefQueryCollectedDesignElements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefQueryCollectedDesignElements_QueryExpression(), theConstraintsPackage.getFormalLanguageExpression(), null, "queryExpression", null, 1, 1, RefQueryCollectedDesignElements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traceDesignElementRefEClass, TraceDesignElementRef.class, "TraceDesignElementRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraceDesignElementRef_Container(), ecorePackage.getEBoolean(), "container", null, 1, 1, TraceDesignElementRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = addEOperation(traceDesignElementRefEClass, null, "merge", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTraceDesignElementRef(), "modelElementReference", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(traceEClass, Trace.class, "Trace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrace_Specifications(), this.getSpecification(), null, "specifications", null, 0, -1, Trace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = addEOperation(traceEClass, this.getTraceDesignElementRef(), "modelElementReference", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEObject(), "modelElement", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(requirementsCoverageDataEClass, RequirementsCoverageData.class, "RequirementsCoverageData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequirementsCoverageData_NbRequirements(), ecorePackage.getEInt(), "nbRequirements", null, 0, 1, RequirementsCoverageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRequirementsCoverageData_VerificationLevel(), this.getNormalizedRatio(), "verificationLevel", null, 0, 1, RequirementsCoverageData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nonFunctionalPropertyEClass, NonFunctionalProperty.class, "NonFunctionalProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNonFunctionalProperty_DesignProperty(), ecorePackage.getEObject(), null, "designProperty", null, 0, 1, NonFunctionalProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sensitivityEClass, Sensitivity.class, "Sensitivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(subElementReferenceEClass, SubElementReference.class, "SubElementReference", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubElementReference_Weight(), this.getNormalizedRatio(), "weight", null, 1, 1, SubElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubElementReference_ReferencedElementEntries(), ecorePackage.getEFeatureMapEntry(), "referencedElementEntries", null, 1, 1, SubElementReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubElementReference_ReferencedElement(), this.getRefineableElement(), null, "referencedElement", null, 1, 1, SubElementReference.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(subRequirementReferenceEClass, SubRequirementReference.class, "SubRequirementReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubRequirementReference_Requirement(), this.getRequirement(), null, "requirement", null, 1, 1, SubRequirementReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(subGoalReferenceEClass, SubGoalReference.class, "SubGoalReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubGoalReference_Goal(), this.getAbstractGoal(), null, "goal", null, 1, 1, SubGoalReference.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(userPropertyEClass, UserProperty.class, "UserProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserProperty_Name(), ecorePackage.getEString(), "name", null, 1, 1, UserProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, UserProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(interactionVariableTypeEEnum, InteractionVariableType.class, "InteractionVariableType");
		addEEnumLiteral(interactionVariableTypeEEnum, InteractionVariableType.MONITORABLE);
		addEEnumLiteral(interactionVariableTypeEEnum, InteractionVariableType.CONTROLLABLE);

		initEEnum(aggregationTypeEEnum, AggregationType.class, "AggregationType");
		addEEnumLiteral(aggregationTypeEEnum, AggregationType.COMPOSITION);
		addEEnumLiteral(aggregationTypeEEnum, AggregationType.ALTERNATIVE);

		initEEnum(modalityEEnum, Modality.class, "Modality");
		addEEnumLiteral(modalityEEnum, Modality.MAXIMUM);
		addEEnumLiteral(modalityEEnum, Modality.MINIMUM);

		// Initialize data types
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveFactorEDataType, Float.class, "PositiveFactor", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(positiveIntegerEDataType, Long.class, "PositiveInteger", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(normalizedRatioEDataType, Float.class, "NormalizedRatio", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// gmf.link
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.compartment
		createGmf_2Annotations();
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (refineableElementEClass, 
		   source, 
		   new String[] {
			 "constraints", "deepUniqueDesignElements"
		   });	
		addAnnotation
		  (getReferencedDesignElements_OwnedDesignElementRefs(), 
		   source, 
		   new String[] {
			 "constraints", "sumWeightsLessEqualsOne"
		   });	
		addAnnotation
		  (designElementReferenceEClass, 
		   source, 
		   new String[] {
			 "constraints", "designElementsContainedInSpecifedArchSpecs"
		   });	
		addAnnotation
		  (normalizedRatioEDataType, 
		   source, 
		   new String[] {
			 "constraints", "rangeZeroOne"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.link";	
		addAnnotation
		  (getAbstractContractualElement_Stakeholders(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getAbstractContractualElement_ContactInformation(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash",
			 "color", "0,0,0"
		   });	
		addAnnotation
		  (getAbstractRequirement_OwnedVerifiedBy(), 
		   source, 
		   new String[] {
			 "target.decoration", "arrow",
			 "style", "dash"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";	
		addAnnotation
		  (contactInformationEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (uncertaintyEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });	
		addAnnotation
		  (conflictEClass, 
		   source, 
		   new String[] {
			 "label", "name"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.compartment";	
		addAnnotation
		  (getRequirementsPackage_OwnedRequirements(), 
		   source, 
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (getElementRefinement_SubElementRefEntries(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });	
		addAnnotation
		  (getElementRefinement_RefinedElementEntries(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });	
		addAnnotation
		  (getRequirementRefinement_OwnedSubRequirementRefs(), 
		   source, 
		   new String[] {
			 "group", "#subElementRefEntries"
		   });	
		addAnnotation
		  (getRequirementRefinement_RefinedRequirement(), 
		   source, 
		   new String[] {
			 "group", "#refinedElementEntries"
		   });	
		addAnnotation
		  (getGoalRefinement_OwnedSubGoalRefs(), 
		   source, 
		   new String[] {
			 "group", "#subElementRefEntries"
		   });	
		addAnnotation
		  (getGoalRefinement_RefinedGoal(), 
		   source, 
		   new String[] {
			 "group", "#refinedElementEntries"
		   });	
		addAnnotation
		  (getRdalOrgPackage_ContractualElementEntries(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });	
		addAnnotation
		  (getRdalOrgPackage_RefinementEntries(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });	
		addAnnotation
		  (getRdalOrgPackage_OwnedRefinements(), 
		   source, 
		   new String[] {
			 "group", "#refinementEntries"
		   });	
		addAnnotation
		  (getRequirementsPackage_OwnedRequirements(), 
		   source, 
		   new String[] {
			 "group", "#contractualElementEntries"
		   });	
		addAnnotation
		  (getRequirementsPackage_OwnedRequirementsRefinements(), 
		   source, 
		   new String[] {
			 "group", "#refinementEntries"
		   });	
		addAnnotation
		  (getGoalsPackage_OwnedGoals(), 
		   source, 
		   new String[] {
			 "group", "#contractualElementEntries"
		   });	
		addAnnotation
		  (getGoalsPackage_OwnedGoalRefinements(), 
		   source, 
		   new String[] {
			 "group", "#refinementEntries"
		   });	
		addAnnotation
		  (getSubElementReference_ReferencedElementEntries(), 
		   source, 
		   new String[] {
			 "kind", "group"
		   });	
		addAnnotation
		  (getSubRequirementReference_Requirement(), 
		   source, 
		   new String[] {
			 "group", "#referencedElementEntries"
		   });	
		addAnnotation
		  (getSubGoalReference_Goal(), 
		   source, 
		   new String[] {
			 "group", "#referencedElementEntries"
		   });
	}

} //RdalPackageImpl
