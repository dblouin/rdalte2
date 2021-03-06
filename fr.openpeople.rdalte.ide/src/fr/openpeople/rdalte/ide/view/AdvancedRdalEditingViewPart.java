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
/**
 * <copyright>
 ********************************************************************************
 * Copyright (c) 2009 Lab-STICC, Université de Bretagne-Sud.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the CeCILL-B FREE SOFTWARE LICENSE AGREEMENT
 * which accompanies this distribution, and is available at
 * http://www.cecill.info/licences/Licence_CeCILL-B_V1-en.html
 *
 * Contributors:
 *    Skander TURKI (Lab-STICC, UBS)
 *******************************************************************************
 * </copyright>
 *
 * $Id$
 */
package fr.openpeople.rdalte.ide.view;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IWorkbenchPart;

import fr.labsticc.framework.emf.core.util.EMFUtil;
import fr.labsticc.framework.ide.viewpart.AbstractEditorViewPart;
import fr.labsticc.framework.settings.ide.SettingsPlugin;
import fr.labsticc.framework.settings.model.settings.ModelInterface;
import fr.openpeople.rdalte.ide.RdalIdePlugin;


public class AdvancedRdalEditingViewPart extends AbstractEditorViewPart<EObject> /*implements IResourceChangeListener*/ {

    public AdvancedRdalEditingViewPart() {
    	super( RequirementsEditorPageFactory.getInstance(), RdalIdePlugin.getDefault().getExceptionHandler() );
    }
//    
//	@Override
//	public void createPartControl( final Composite p_parent ) {
//		super.createPartControl( p_parent );
//		
//    	ResourcesPlugin.getWorkspace().addResourceChangeListener( this, IResourceChangeEvent.PRE_BUILD | IResourceChangeEvent.POST_BUILD );
//	}
	
    @Override
	protected EObject selectedModelObject( 	final IWorkbenchPart p_part,
											final ISelection p_selection ) {

    	// Check for system architecture element
    	for ( final ModelInterface modInterface : SettingsPlugin.getDefault().allModelInterfaces() ) {
    		final Object object = modInterface.selectedModelObject( p_part, p_selection );
    		
    		if ( object instanceof EObject ) {
    			return (EObject) object;
    		}
    	}
    	
    	// Check for other elements (RDAL)
    	return EMFUtil.selectedObject( p_selection, EObject.class );
	}
//    
//	@Override
//	public void resourceChanged( final IResourceChangeEvent p_event ) {
//		final IResourceDelta delta = p_event.getDelta();
//		
//		try {
//			delta.accept( new IResourceDeltaVisitor() {
//
//				@Override
//				public boolean visit( final IResourceDelta p_delta ) {
//					try {
//						if ( 	p_delta.getResource().getType() == IResource.FILE && 
//								p_delta.getKind() == IResourceDelta.CHANGED && 
//								p_delta.getFlags() != IResourceDelta.MARKERS &&
//								p_delta.getResource().getProject().hasNature( RDALNature.NATURE_ID ) ) {
//							Display.getDefault().asyncExec( new Runnable() {
//								
//								@Override
//								public void run() {
//									// Perform a set focus to update the view according to the new selection after the build
//									// (usually no more selection).
//									final IWorkbenchPart part;
//									final IEditorPart editor = getSite().getPage().getActiveEditor();
//									
//									if ( editor!= null ) {
//										part = editor.getSite().getPart();
//									}
//									else {
//										part = null;
//									}
//
//									// TODO: Review this. Commented this because it causes the advanced RDAL editing view to be 
//									// cleared when saving the diagram in OSATE2...
//									//selectionChanged( part, null );
//								}
//							} );
//							
//							return false;
//						}
//
//						return true;
//					} 
//					catch ( final CoreException p_ex) {
//						getExceptionHandler().handleException( p_ex, null );
//						
//						return false;
//					}
//				}
//			} );
//		}
//		catch ( final CoreException p_ex ) {
//			getExceptionHandler().handleException( p_ex, null );
//		}
//	}
//
//	@Override
//	public void dispose() {
//		super.dispose();
//
//		ResourcesPlugin.getWorkspace().removeResourceChangeListener( this );
//	}
}
