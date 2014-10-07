/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdal2.model.rdal.impl;

import fr.openpeople.rdal2.model.rdal.*;

import java.util.Date;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RdalFactoryImpl extends EFactoryImpl implements RdalFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RdalFactory init() {
		try {
			RdalFactory theRdalFactory = (RdalFactory)EPackage.Registry.INSTANCE.getEFactory(RdalPackage.eNS_URI);
			if (theRdalFactory != null) {
				return theRdalFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RdalFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdalFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case RdalPackage.REQUIREMENT_REFINEMENT: return createRequirementRefinement();
			case RdalPackage.GOAL_REFINEMENT: return createGoalRefinement();
			case RdalPackage.CONTACT_INFORMATION: return createContactInformation();
			case RdalPackage.STAKEHOLDER: return createStakeholder();
			case RdalPackage.RATIONALE: return createRationale();
			case RdalPackage.UNCERTAINTY: return createUncertainty();
			case RdalPackage.SPECIFICATION: return createSpecification();
			case RdalPackage.REQUIREMENTS_PACKAGE: return createRequirementsPackage();
			case RdalPackage.GOALS_PACKAGE: return createGoalsPackage();
			case RdalPackage.SYSTEM_OVERVIEW: return createSystemOverview();
			case RdalPackage.CAPABILITY: return createCapability();
			case RdalPackage.SYSTEM_CONTEXT: return createSystemContext();
			case RdalPackage.VARIABLE: return createVariable();
			case RdalPackage.INTERACTION_VARIABLE: return createInteractionVariable();
			case RdalPackage.ACTOR_REFERENCE: return createActorReference();
			case RdalPackage.VERIFICATION_ACTIVITY: return createVerificationActivity();
			case RdalPackage.REQUIREMENT: return createRequirement();
			case RdalPackage.ASSUMPTION: return createAssumption();
			case RdalPackage.SYSTEM_FUNCTION_GOAL: return createSystemFunctionGoal();
			case RdalPackage.NON_FUNCTIONAL_GOAL: return createNonFunctionalGoal();
			case RdalPackage.QUALITY_OBJECTIVE: return createQualityObjective();
			case RdalPackage.CONFLICT: return createConflict();
			case RdalPackage.DESIGN_ELEMENT_REFERENCE: return createDesignElementReference();
			case RdalPackage.VERIFIABLE_DESIGN_ELEMENT_REF: return createVerifiableDesignElementRef();
			case RdalPackage.SATISFIABLE_DESIGN_ELEMENT_REF: return createSatisfiableDesignElementRef();
			case RdalPackage.PRIORITIZED_SAT_DESIGN_ELEMENT_REF: return createPrioritizedSatDesignElementRef();
			case RdalPackage.SYST_OVERVIEW_DESIGN_ELEM_REF: return createSystOverviewDesignElemRef();
			case RdalPackage.SYST_CONTEXT_DESIGN_ELEM_REF: return createSystContextDesignElemRef();
			case RdalPackage.REF_MANUALLY_SELECTED_DESIGN_ELEMENTS: return createRefManuallySelectedDesignElements();
			case RdalPackage.REF_QUERY_COLLECTED_DESIGN_ELEMENTS: return createRefQueryCollectedDesignElements();
			case RdalPackage.TRACE_DESIGN_ELEMENT_REF: return createTraceDesignElementRef();
			case RdalPackage.TRACE: return createTrace();
			case RdalPackage.REQUIREMENTS_COVERAGE_DATA: return createRequirementsCoverageData();
			case RdalPackage.NON_FUNCTIONAL_PROPERTY: return createNonFunctionalProperty();
			case RdalPackage.SENSITIVITY: return createSensitivity();
			case RdalPackage.SUB_REQUIREMENT_REFERENCE: return createSubRequirementReference();
			case RdalPackage.SUB_GOAL_REFERENCE: return createSubGoalReference();
			case RdalPackage.USER_PROPERTY: return createUserProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case RdalPackage.INTERACTION_VARIABLE_TYPE:
				return createInteractionVariableTypeFromString(eDataType, initialValue);
			case RdalPackage.AGGREGATION_TYPE:
				return createAggregationTypeFromString(eDataType, initialValue);
			case RdalPackage.MODALITY:
				return createModalityFromString(eDataType, initialValue);
			case RdalPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case RdalPackage.POSITIVE_FACTOR:
				return createPositiveFactorFromString(eDataType, initialValue);
			case RdalPackage.POSITIVE_INTEGER:
				return createPositiveIntegerFromString(eDataType, initialValue);
			case RdalPackage.NORMALIZED_RATIO:
				return createNormalizedRatioFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case RdalPackage.INTERACTION_VARIABLE_TYPE:
				return convertInteractionVariableTypeToString(eDataType, instanceValue);
			case RdalPackage.AGGREGATION_TYPE:
				return convertAggregationTypeToString(eDataType, instanceValue);
			case RdalPackage.MODALITY:
				return convertModalityToString(eDataType, instanceValue);
			case RdalPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case RdalPackage.POSITIVE_FACTOR:
				return convertPositiveFactorToString(eDataType, instanceValue);
			case RdalPackage.POSITIVE_INTEGER:
				return convertPositiveIntegerToString(eDataType, instanceValue);
			case RdalPackage.NORMALIZED_RATIO:
				return convertNormalizedRatioToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementRefinement createRequirementRefinement() {
		RequirementRefinementImpl requirementRefinement = new RequirementRefinementImpl();
		return requirementRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalRefinement createGoalRefinement() {
		GoalRefinementImpl goalRefinement = new GoalRefinementImpl();
		return goalRefinement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContactInformation createContactInformation() {
		ContactInformationImpl contactInformation = new ContactInformationImpl();
		return contactInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Uncertainty createUncertainty() {
		UncertaintyImpl uncertainty = new UncertaintyImpl();
		return uncertainty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification createSpecification() {
		SpecificationImpl specification = new SpecificationImpl();
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemOverview createSystemOverview() {
		SystemOverviewImpl systemOverview = new SystemOverviewImpl();
		return systemOverview;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capability createCapability() {
		CapabilityImpl capability = new CapabilityImpl();
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rationale createRationale() {
		RationaleImpl rationale = new RationaleImpl();
		return rationale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionVariable createInteractionVariable() {
		InteractionVariableImpl interactionVariable = new InteractionVariableImpl();
		return interactionVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActorReference createActorReference() {
		ActorReferenceImpl actorReference = new ActorReferenceImpl();
		return actorReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemContext createSystemContext() {
		SystemContextImpl systemContext = new SystemContextImpl();
		return systemContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conflict createConflict() {
		ConflictImpl conflict = new ConflictImpl();
		return conflict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DesignElementReference createDesignElementReference() {
		DesignElementReferenceImpl designElementReference = new DesignElementReferenceImpl();
		return designElementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerifiableDesignElementRef createVerifiableDesignElementRef() {
		VerifiableDesignElementRefImpl verifiableDesignElementRef = new VerifiableDesignElementRefImpl();
		return verifiableDesignElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatisfiableDesignElementRef createSatisfiableDesignElementRef() {
		SatisfiableDesignElementRefImpl satisfiableDesignElementRef = new SatisfiableDesignElementRefImpl();
		return satisfiableDesignElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrioritizedSatDesignElementRef createPrioritizedSatDesignElementRef() {
		PrioritizedSatDesignElementRefImpl prioritizedSatDesignElementRef = new PrioritizedSatDesignElementRefImpl();
		return prioritizedSatDesignElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystOverviewDesignElemRef createSystOverviewDesignElemRef() {
		SystOverviewDesignElemRefImpl systOverviewDesignElemRef = new SystOverviewDesignElemRefImpl();
		return systOverviewDesignElemRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystContextDesignElemRef createSystContextDesignElemRef() {
		SystContextDesignElemRefImpl systContextDesignElemRef = new SystContextDesignElemRefImpl();
		return systContextDesignElemRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefManuallySelectedDesignElements createRefManuallySelectedDesignElements() {
		RefManuallySelectedDesignElementsImpl refManuallySelectedDesignElements = new RefManuallySelectedDesignElementsImpl();
		return refManuallySelectedDesignElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefQueryCollectedDesignElements createRefQueryCollectedDesignElements() {
		RefQueryCollectedDesignElementsImpl refQueryCollectedDesignElements = new RefQueryCollectedDesignElementsImpl();
		return refQueryCollectedDesignElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TraceDesignElementRef createTraceDesignElementRef() {
		TraceDesignElementRefImpl traceDesignElementRef = new TraceDesignElementRefImpl();
		return traceDesignElementRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stakeholder createStakeholder() {
		StakeholderImpl stakeholder = new StakeholderImpl();
		return stakeholder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsPackage createRequirementsPackage() {
		RequirementsPackageImpl requirementsPackage = new RequirementsPackageImpl();
		return requirementsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GoalsPackage createGoalsPackage() {
		GoalsPackageImpl goalsPackage = new GoalsPackageImpl();
		return goalsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assumption createAssumption() {
		AssumptionImpl assumption = new AssumptionImpl();
		return assumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemFunctionGoal createSystemFunctionGoal() {
		SystemFunctionGoalImpl systemFunctionGoal = new SystemFunctionGoalImpl();
		return systemFunctionGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFunctionalGoal createNonFunctionalGoal() {
		NonFunctionalGoalImpl nonFunctionalGoal = new NonFunctionalGoalImpl();
		return nonFunctionalGoal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QualityObjective createQualityObjective() {
		QualityObjectiveImpl qualityObjective = new QualityObjectiveImpl();
		return qualityObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerificationActivity createVerificationActivity() {
		VerificationActivityImpl verificationActivity = new VerificationActivityImpl();
		return verificationActivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trace createTrace() {
		TraceImpl trace = new TraceImpl();
		return trace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementsCoverageData createRequirementsCoverageData() {
		RequirementsCoverageDataImpl requirementsCoverageData = new RequirementsCoverageDataImpl();
		return requirementsCoverageData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonFunctionalProperty createNonFunctionalProperty() {
		NonFunctionalPropertyImpl nonFunctionalProperty = new NonFunctionalPropertyImpl();
		return nonFunctionalProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sensitivity createSensitivity() {
		SensitivityImpl sensitivity = new SensitivityImpl();
		return sensitivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubRequirementReference createSubRequirementReference() {
		SubRequirementReferenceImpl subRequirementReference = new SubRequirementReferenceImpl();
		return subRequirementReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubGoalReference createSubGoalReference() {
		SubGoalReferenceImpl subGoalReference = new SubGoalReferenceImpl();
		return subGoalReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserProperty createUserProperty() {
		UserPropertyImpl userProperty = new UserPropertyImpl();
		return userProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionVariableType createInteractionVariableTypeFromString(EDataType eDataType, String initialValue) {
		InteractionVariableType result = InteractionVariableType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInteractionVariableTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationType createAggregationTypeFromString(EDataType eDataType, String initialValue) {
		AggregationType result = AggregationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAggregationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modality createModalityFromString(EDataType eDataType, String initialValue) {
		Modality result = Modality.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertModalityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createPositiveFactorFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveFactorToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createPositiveIntegerFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPositiveIntegerToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDateFromString(EDataType eDataType, String initialValue) {
		return (Date)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDateToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Float createNormalizedRatioFromString(EDataType eDataType, String initialValue) {
		return (Float)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNormalizedRatioToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RdalPackage getRdalPackage() {
		return (RdalPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RdalPackage getPackage() {
		return RdalPackage.eINSTANCE;
	}

} //RdalFactoryImpl
