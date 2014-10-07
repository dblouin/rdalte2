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
package fr.openpeople.rdal2.model.rdal.provider;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.emf.core.resource.EMFResourcesVisitor;
import fr.labsticc.framework.settings.model.settings.SettingsSpecification;
import fr.labsticc.framework.settings.model.settings.provider.AbstractSettingsPropertyDescriptor;
import fr.labsticc.framework.settings.service.ISettingsServiceDelegate;
import fr.openpeople.rdal2.model.rdal.DesignElementReference;
import fr.openpeople.rdal2.model.rdal.Specification;

public class SettingsRefPropertyDescriptor extends AbstractSettingsPropertyDescriptor {
	
    public SettingsRefPropertyDescriptor( 	final ISettingsServiceDelegate p_settingsDelegate,
											final AdapterFactory p_adapterFactory,
    	      								final ResourceLocator p_resourceLocator,
    	      								final IExceptionHandler p_exceptionHandler,
	      									final String p_displayName,
	      									final String p_description,
	      									final EStructuralFeature p_feature,
	      									final boolean pb_isSettable,
											final boolean pb_multiLine,
											final boolean pb_sortChoices,
											final Object p_staticImage,
											final String p_category,
											final String[] p_filterFlags ) {
    	super( 	p_settingsDelegate,
    			p_adapterFactory, 
    			p_resourceLocator, 
    			p_exceptionHandler,
    			p_displayName, 
    			p_description,
    			p_feature,
    			pb_isSettable,
				pb_multiLine,
				pb_sortChoices,
				p_staticImage,
				p_category,
				p_filterFlags );

    	itemDelegator = new ItemDelegator(adapterFactory, resourceLocator) {
    		@Override
    		public String getText( final Object p_object ) {
    			final String text = super.getText( p_object );
    			
    			if ( p_object instanceof EObject ) {
    				final EObject container = ( (EObject) p_object ).eContainer();
    				
    				if ( container != null ) {
    					return super.getText( container ) + "." + text;
    				}
    			}
    			
    			return text;
    		}
    	};
    }

	//@SuppressWarnings("unchecked")
	@Override
	//public Set<?> getChoiceOfValues( final Object p_object ) {
//		final Collection<EObject> elementsChoice = new EMFURIEqualsList<EObject>();
//		final Set<EObject> currentElements = new EMFURIEqualsList<EObject>();
//		final PropertyValueWrapper wrapper = (PropertyValueWrapper) getPropertyValue( p_object );
//		final Object value = wrapper.getEditableValue( p_object );
//		
//		// Test so that it works also for single cardinality features
//		if ( value instanceof Collection<?> )  {
//			currentElements.addAll( (Collection<EObject>) value );
//		}
//		
//		final SettingsSpecification settingsSpec = SettingsPlugin.getDefault().getSpecification();
//		
//		try {
//			final Set<EClass> supportedTypes = getSettingsDelegate().supportedTypes( 	settingsSpec,
//																						(EReference) getFeature( null ),
//																						p_object );
//			
//			if ( supportedTypes != null && !supportedTypes.isEmpty() ) {
//				for ( final Resource res : getScope( (EObject) p_object ) ) {
//					EMFUtil.fillContentOfTypes( res, supportedTypes, elementsChoice );
//				}
//			}
//			
//			elementsChoice.removeAll( currentElements );
//		}
//		catch ( final Throwable p_th ) {
//			getExceptionHandler().handleException( p_th, value );
//		}
//		
//		return elementsChoice;
//	}
    
	protected Set<Resource> getScope( final EObject p_object )
	throws CoreException, ResourceAccessException {
    	if ( p_object instanceof Specification ) {
    		return getWorkspaceScope( p_object );
    	}
    	
    	// All design elements of RDAL classes other than the specification class shall be contained by the 
    	// design elements of the RDAL specification.
    	final Set<Resource> scope = new HashSet<Resource>();

    	final Specification spec = (Specification) EcoreUtil.getRootContainer( p_object );
    	
    	if ( spec.getOwnedReferencedDesignElements() != null ) {
	    	for ( final DesignElementReference designRef : spec.getOwnedReferencedDesignElements().getOwnedDesignElementRefs() ) {
	    		if ( designRef.getDesignElement() != null ) {
	    			scope.add( designRef.getDesignElement().eResource() );
	    		}
	    	}
    	}
    	
    	return scope;
    }
	
	protected Set<Resource> getWorkspaceScope( final EObject p_object ) 
	throws CoreException, ResourceAccessException {
		final SettingsSpecification settingsSpec = getSettingsSpecification();
		final EMFResourcesVisitor resVisitor = new EMFResourcesVisitor( getSettingsDelegate().supportedLanguagesFileTypes( settingsSpec ),
																		null );
																		//null,
																		//p_object.eResource().getResourceSet() );
																		// Using the object's resource's resource set seems to be causing problems
																		// (cf bug found by BL on Mac). So use a new resource set.
		ResourcesPlugin.getWorkspace().getRoot().accept( resVisitor );

		return new HashSet<Resource>( resVisitor.getFoundEMFResources() );
	}
}
