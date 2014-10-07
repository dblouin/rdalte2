/*******************************************************************************
 * Copyright (c) 2011 Lab-STICC Universite de Bretagne Sud, Lorient.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-B license available
 * at :
 * en : http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html
 * fr : http://www.cecill.info/licences/Licence_CeCILL-B_V1-fr.html
 * 
 * Contributors:
 * Dominique BLOUIN (Lab-STICC UBS), dominique.blouin@univ-ubs.fr
 ******************************************************************************/
package fr.openpeople.rdalte.ide.view;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Composite;

import fr.labsticc.framework.constraints.ide.ConstraintsIDEPlugin;
import fr.labsticc.framework.constraints.ide.view.FormalLanguageExpressionViewPage;
import fr.labsticc.framework.constraints.model.constraints.ConstraintsPackage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.core.exception.FunctionalException;
import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.ide.viewpart.EmptyPage;
import fr.labsticc.framework.ide.viewpart.IPageFactory;
import fr.labsticc.framework.ide.viewpart.IViewPartPage;
import fr.openpeople.rdal2.model.rdal.RdalPackage;
import fr.openpeople.rdal2.model.rdal.TextualContractualElement;
import fr.openpeople.rdal2.model.rdal.TraceableToDesignElementsElement;
import fr.openpeople.rdalte.ide.RdalBusinessDelegateFactory;
import fr.openpeople.rdalte.ide.view.contractelement.ContractualElementViewPage;
import fr.openpeople.rdalte.ide.view.contractelement.TraceableToDesignElementViewPage;
import fr.openpeople.rdalte.ide.view.traceability.RequirementTraceabilityViewPage;

public class RequirementsEditorPageFactory implements IPageFactory<EObject> {
	
	private static final RequirementsEditorPageFactory instance = new RequirementsEditorPageFactory();
	
	public static RequirementsEditorPageFactory getInstance() {
		return instance;
	}
	
	private final RdalBusinessDelegateFactory delegateFactory;
	
	private final Object traceabilityKey;
	
	private RequirementsEditorPageFactory() {
		delegateFactory = RdalBusinessDelegateFactory.getInstance();
		traceabilityKey = "designElementsTraceability";
	}
	
	private IViewPartPage<EObject> createEmptyPage( final Composite p_parent,
													final IExceptionHandler p_exceptionHandler ) {
		return new EmptyPage<EObject>(p_parent, p_exceptionHandler);
	}
	
	@Override
	public Object getPageKey( final EObject p_modelObject ) 
	throws FunctionalException, SystemException {
		if ( p_modelObject == null ) {
			return "EMPTY_PAGE";
		}
		
		// We want the same page for any element that can satisfy a requirement or can contain elements that can satisfy requirements.
		if ( delegateFactory.getTraceabilityBusinessDelegate().isDesignElementSatisfiableInclContainers( null, p_modelObject ) ) {
			return traceabilityKey;
		}

		// Use the same key for goals and requirements.
		if ( RdalPackage.eINSTANCE.getTextualContractualElement().isSuperTypeOf( p_modelObject.eClass() ) ) {
			return RdalPackage.eINSTANCE.getTextualContractualElement();
		}

		if ( RdalPackage.eINSTANCE.getTraceableToDesignElementsElement().isSuperTypeOf( p_modelObject.eClass() ) ) {
			return RdalPackage.eINSTANCE.getTraceableToDesignElementsElement();
		}
		
		return  p_modelObject.eClass();
	}
	
	@Override
	public IViewPartPage<? extends EObject> createPage( final Composite p_parent,
														final Object p_pageId,
														final IExceptionHandler p_exceptionHandler ) 
	throws ResourceAccessException {
		if ( p_pageId instanceof EClass ) {
			final EClass objClass = (EClass) p_pageId;
			
			if ( RdalPackage.eINSTANCE.getTextualContractualElement().equals( objClass ) ) {
				return createContractualElementViewPage( p_parent, p_exceptionHandler );
			}
			
			if ( RdalPackage.eINSTANCE.getTraceableToDesignElementsElement().equals( objClass ) ) {
				return createTraceableDesignElementPage( p_parent, p_exceptionHandler );
			}

			if ( ConstraintsPackage.eINSTANCE.getFormalLanguageExpression().equals( objClass ) ) {
				return createFormalLanguageExpressionPage( p_parent, p_exceptionHandler );
			}
		}
		
		if ( p_pageId == traceabilityKey ) {
			return createRequirementTracabilityViewPage( p_parent, p_exceptionHandler );
		}
		
		return createEmptyPage( p_parent, p_exceptionHandler );
	}
	
	private  IViewPartPage<EObject> createRequirementTracabilityViewPage( 	final Composite p_parent,
																			final IExceptionHandler p_exceptionHandler ) 
	throws ResourceAccessException {
		return new RequirementTraceabilityViewPage( p_parent, 
													delegateFactory.getTraceabilityBusinessDelegate(),
													p_exceptionHandler );
	}
	
	private IViewPartPage<TextualContractualElement> createContractualElementViewPage(	final Composite p_parent,
																						final IExceptionHandler p_exceptionHandler ) 
	throws ResourceAccessException {
		return new ContractualElementViewPage( 	p_parent, 
												delegateFactory.getRequirementBusinessDelegate(),
												ConstraintsIDEPlugin.getDefault().getViewersConfiguration(),
												p_exceptionHandler );
	}
	
	private IViewPartPage<TraceableToDesignElementsElement> createTraceableDesignElementPage(	final Composite p_parent,
																								final IExceptionHandler p_exceptionHandler ) 
	throws ResourceAccessException {
		return new TraceableToDesignElementViewPage( 	p_parent, 
														delegateFactory.getRequirementBusinessDelegate(),
														ConstraintsIDEPlugin.getDefault().getViewersConfiguration(),
														p_exceptionHandler );
	}
	
	private IViewPartPage<FormalLanguageExpression> createFormalLanguageExpressionPage(	final Composite p_parent,
																						final IExceptionHandler p_exceptionHandler ) 
	throws ResourceAccessException {
		return new FormalLanguageExpressionViewPage( 	p_parent, 
														ConstraintsIDEPlugin.getDefault().getViewersConfiguration(),
														p_exceptionHandler ) {
			@Override
			public void displayData( final FormalLanguageExpression p_expression ) {
				final EObject designElememRef;
				
				if ( p_expression == null || p_expression.eContainer() == null || p_expression.eContainer().eContainer() == null ) {
					designElememRef = null;
				}
				else {
					designElememRef = p_expression.eContainer().eContainer();
				}
				
				setContext( designElememRef );
				
				// Parent class sets the selected object
				super.displayData( p_expression );
			}
		};
	}
}
