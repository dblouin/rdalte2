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
package fr.openpeople.rdalte.ide.view.traceability;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.core.DiagramEditingDomainFactory;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Display;

import fr.labsticc.framework.constraints.core.exception.ConstraintException;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.core.exception.SystemException;
import fr.labsticc.framework.core.util.ObjectReturnRunnable;
import fr.labsticc.framework.emf.core.resource.EMFResourcesVisitor;
import fr.labsticc.framework.settings.ide.SettingsPlugin;
import fr.labsticc.framework.settings.model.settings.ModelInterface;
import fr.labsticc.framework.settings.service.ISettingsServiceDelegate;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.IdentifiedElement;
import fr.openpeople.rdal2.model.rdal.RdalFactory;
import fr.openpeople.rdal2.model.rdal.Specification;
import fr.openpeople.rdal2.model.rdal.Trace;
import fr.openpeople.rdal2.model.rdal.TraceDesignElementRef;
import fr.openpeople.rdalte.ide.IRdalConstants;
import fr.openpeople.rdalte.ide.view.AbstractViewPageBusinessDelegate;
import fr.openpeople.rdalte.service.ContractualElementTracabilityServicesFacade;
import fr.openpeople.rdalte.service.IContractualElementBusinessDelegate;
import fr.openpeople.rdalte.service.IContractualElementTraceabilityBusinessDelegate;

public class IDEReqTraceabilityBusinessDelegate extends AbstractViewPageBusinessDelegate implements IContractualElementTraceabilityBusinessDelegate {

//	private static final Collection<EClass> SUPPORTED_SATISFIABLE_DESIGN_TYPES = SettingsPlugin.getDefault().getPropertyToTypeAssClasses( RdalPackage.eINSTANCE.getDesignElementReference_DesignElement() );
//
//	private static final Collection<EClass> SUPPORTED_SATISFIABLE_DESIGN_TYPES_INCL_CONTAINERS = SettingsPlugin.getDefault().getPropertyToTypeAssClassesInclContainers( RdalPackage.eINSTANCE.getDesignElementReference_DesignElement() );
//
//	private static final Collection<EClass> SUPPORTED_DESIGN_SPECIFICATION_TYPES = Collections.emptyList();//SettingsPlugin.getDefault().getPropertyToTypeAssClasses( null /* TODO Fix settings model RdalPackage.eINSTANCE.getSpecification_()*/ );
//	
//	private static final Collection<String> SUPPORTED_DESIGN_SPECIFICATION_FILE_TYPES = SettingsPlugin.getDefault().getSupportedLanguagesFileTypes();

	private final ContractualElementTracabilityServicesFacade tracabilityFacade;
	
	final Collection<? extends ModelInterface> systemArchitectureInterfaces; 

	public IDEReqTraceabilityBusinessDelegate( 	final IContractualElementBusinessDelegate p_requirementDelegate,
												final ISettingsServiceDelegate p_settingsDelegate ) {
		tracabilityFacade = new ContractualElementTracabilityServicesFacade( p_requirementDelegate, p_settingsDelegate );
		systemArchitectureInterfaces = SettingsPlugin.getDefault().allModelInterfaces();
	}
	
	// TODO: Move this to list?
	private String designSpecificationId( final EObject p_designSpecification ) {
		return EcoreUtil.getURI( p_designSpecification ).toString();
	}
	
	/**
	 * Performed in the delegate because it knows it is in the platform. Services are kept independent
	 * of this context.
	 * @param p_aadlElement
	 * @return
	 * @throws CoreException
	 */
	private Collection<Specification> workspaceSpecifications( 	final EObject p_designElement,
																final boolean pb_useEditingDomainResSet ) 
	throws CoreException, SystemException, InterruptedException, ConstraintException {
		final ResourceSet resSet;
		
		if ( pb_useEditingDomainResSet ) {
			final EditingDomain editingDomain = DiagramEditingDomainFactory.getInstance().createEditingDomain();
			resSet = editingDomain.getResourceSet();
		}
		else {
			final ModelInterface systArchInt = getSystArchModelInterface( p_designElement );
			
			if ( systArchInt != null && systArchInt.getCustomResourcet() != null ) {
				resSet = systArchInt.getCustomResourcet();
			}
			else {
				resSet = new ResourceSetImpl();
			}
		}

		final EMFResourcesVisitor visitor = new EMFResourcesVisitor( 	Collections.singleton( IRdalConstants.RDAL_EXTENSION ), 
																		null, 
																		null, 
																		resSet );
		
		for ( final IProject project : ResourcesPlugin.getWorkspace().getRoot().getProjects() ) {
			if ( project.isOpen() ) {
				project.accept( visitor );
			}
		}

		final EObject rootContainer = EcoreUtil.getRootContainer( p_designElement );
		final String rootContainerId = designSpecificationId( rootContainer );
		final Collection<Specification> specs = new ArrayList<Specification>();

		for ( final Resource res : visitor.getFoundEMFResources() ) {
			for ( final EObject content : res.getContents() ) {
				if ( content instanceof Specification ) {
					final Specification reqSpec = (Specification) content;
					
					for ( final DesignElementReference designSpec : tracabilityFacade.designElementReferences( reqSpec ) ) {
						// Only consider architecture specifications specified by the requirements specification.
						if ( rootContainerId.equals( designSpecificationId( designSpec.getDesignElement() ) ) ) {
							specs.add( reqSpec );
							
							break;
						}
					}
				}
			}
		}
		
		return specs;
	}

	@Override
	public Trace evaluateConstraints( final EObject p_designSpecification )
	throws ConstraintException, SystemException, InterruptedException {
		try {
			final Trace trace = tracabilityFacade.evaluateConstraints( 	SettingsPlugin.getDefault().getSpecification(),
																		p_designSpecification, 
																		workspaceSpecifications( p_designSpecification, false ) ); 

			// We must save the specifications to save the calculated coverage information.
			for ( final Specification spec : trace.getSpecifications() ) {
				final Resource res = spec.eResource();
				res.save( getSaveOptions() );
			}
			
			return trace;
		}
		catch( final CoreException p_ex ) {
			throw new ResourceAccessException( p_ex );
		}
		catch ( final IOException p_ex ) {
			throw new ResourceAccessException( p_ex );
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T extends IdentifiedElement> Collection<T> satisfiableNodes(	final EObject p_designElement, 
																			final Class<T> p_class, 
																			final boolean pb_recursive )
	throws ConstraintException, SystemException, InterruptedException {
		final ObjectReturnRunnableWithProgress runnable = new ObjectReturnRunnableWithProgress() {

			@Override
			public void run( final IProgressMonitor p_monitor ) {
				p_monitor.beginTask( "Searching Requirements...", 1 );
				
				try {
					result = tracabilityFacade.satisfiableNodes( 	p_designElement,
																	workspaceSpecifications( p_designElement, false ),
																	p_class, 
																	pb_recursive );
					p_monitor.worked( 1 );
				}
				catch ( final Throwable p_th ) {
					exception = p_th;
				}
				finally {
					p_monitor.done();
				}
			}
		};

		try {
			new ProgressMonitorDialog( Display.getCurrent().getActiveShell() ).run( false, false, runnable );
			
			if ( runnable.exception == null ) {
				return (Collection<T>) runnable.result;
			}

			if ( runnable.exception instanceof ConstraintException ) {
				throw (ConstraintException) runnable.exception;
			}
			if ( runnable.exception instanceof SystemException ) {
				throw (SystemException) runnable.exception;
			}
			if ( runnable.exception instanceof InterruptedException ) {
				throw (InterruptedException) runnable.exception;
			}

			throw new SystemException( runnable.exception );
		}
		catch ( final InvocationTargetException p_ex ) {
			throw new SystemException( p_ex );
		}
	}
	
	private static abstract class ObjectReturnRunnableWithProgress extends ObjectReturnRunnable implements IRunnableWithProgress {

		@Override
		public void run() {
			try {
				run( new NullProgressMonitor() );
			}
			catch ( final Throwable p_th ) {
				exception = p_th;
			}
		}
	}

	@Override
	public <T extends IdentifiedElement> Collection<? extends EObject> satisfiableNodes(	final EObject p_designElement, 
																							final T p_reqNode, 
																							final boolean pb_recursive )
	throws ConstraintException, SystemException, InterruptedException {
		return tracabilityFacade.satisfiableNodes( 	p_designElement, p_reqNode, pb_recursive );
	}

//	@Override
//	public Collection<EClass> supportedDesignSpecificationTypes() {
//		return SUPPORTED_DESIGN_SPECIFICATION_TYPES;
//	}
//
//	@Override
//	public Collection<String> supportedDesignSpecificationFileTypes() {
//		return SUPPORTED_DESIGN_SPECIFICATION_FILE_TYPES;
//	}
//
//	@Override
//	public Collection<EClass> supportedSatisfiableDesignTypes() {
//		return SUPPORTED_SATISFIABLE_DESIGN_TYPES;
//	}
//
//	@Override
//	public Collection<EClass> supportedSatisfiableDesignTypesInclContainers() {
//		return SUPPORTED_SATISFIABLE_DESIGN_TYPES_INCL_CONTAINERS;
//	}

	@Override
	public Trace evaluateConstraints( 	final Collection<EObject> p_designSpecifications,
										final Object p_progressModitor )
	throws ConstraintException, SystemException, InterruptedException {
		final IProgressMonitor monitor = (IProgressMonitor) p_progressModitor;
		final Trace report = RdalFactory.eINSTANCE.createTrace();
		
		for ( final EObject designSpec : p_designSpecifications ) {
			final Trace trace = evaluateConstraints( designSpec );
			
			// Use another list so that adding the elements does not corrupt the iterator
			final Collection<DesignElementReference> refElements = new ArrayList<DesignElementReference>( trace.getOwnedDesignElementRefs() );

			for ( final DesignElementReference ref : refElements ) {
				final TraceDesignElementRef existingRef = report.modelElementReference( ref.getDesignElement() );
				
				if ( existingRef == null ) {
					report.getOwnedDesignElementRefs().add( ref );
				}
				else {
					existingRef.merge( (TraceDesignElementRef) ref  );
				}
			}

			monitor.worked( 1 );
		}
		
		return report;
	}

	@Override
	public boolean isDesignElementSatisfiable( 	final Object p_context,
												final EObject p_designElement ) 
	throws ConstraintException, SystemException {
		return tracabilityFacade.isDesignElementSatisfiable( SettingsPlugin.getDefault().getSpecification(), p_context, p_designElement );
	}

	@Override
	public boolean isDesignElementSatisfiableInclContainers( 	final Object p_context,
																final EObject p_designElement ) 
	throws ConstraintException, SystemException {
		return tracabilityFacade.isDesignElementSatisfiableInclContainers( SettingsPlugin.getDefault().getSpecification(), p_context, p_designElement );
	}
	
	private ModelInterface getSystArchModelInterface( final Object p_component ) {
		for ( final ModelInterface systArchInterface : systemArchitectureInterfaces ) {
			if ( systArchInterface.isModelElement( p_component ) ) {
				return systArchInterface;
			}
		}
		
		throw new IllegalStateException( "No system architecture interface defined for component " + p_component );
	}

	@Override
	public Collection<EClass> supportedDesignSpecificationTypes( final Object p_context ) 
	throws ConstraintException, SystemException {
		return tracabilityFacade.supportedDesignSpecificationTypes( SettingsPlugin.getDefault().getSpecification(), p_context );
	}

	@Override
	public Collection<String> supportedDesignSpecificationFileTypes() {
		return tracabilityFacade.supportedDesignSpecificationFileTypes( SettingsPlugin.getDefault().getSpecification() );
	}
}
