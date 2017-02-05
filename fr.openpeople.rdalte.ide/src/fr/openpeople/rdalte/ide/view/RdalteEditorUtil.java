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

import java.util.Collection;
import java.util.Collections;

import javax.activation.UnsupportedDataTypeException;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.ui.PartInitException;

import fr.labsticc.framework.core.IResourceHandler;
import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.emf.core.resource.BundleEMFResourceHandler;
import fr.labsticc.framework.ide.util.EditorUtil;
import fr.openpeople.rdalte.ide.RdalIdePlugin;

import fr.labsticc.framework.emf.view.ide.EMFEditorUtil;

/**
 * @author dblouin
 *
 */
public class RdalteEditorUtil {

	private static final IResourceHandler resourceHandler = new BundleEMFResourceHandler();

	public static void openEditor( EObject p_element ) 
	throws PartInitException, UnsupportedDataTypeException {
		for ( final IEditorHandler handler : RdalIdePlugin.getDefault().getEditorHandlers() ) {
			if ( handler.isEditorFor( p_element ) ) {
				handler.openEditor( p_element );
				
				return;
			}
		}
		
		EMFEditorUtil.selectIntoEditor( Collections.singletonList( p_element ) );
	}

	public static void openEditors( final Collection<String> p_fileIds ) 
	throws PartInitException, ResourceAccessException {
		EditorUtil.openEditors( p_fileIds, resourceHandler);
	}
//
//	public static void openEditor( final String p_fileId ) 
//	throws PartInitException, ResourceAccessException {
//		final IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
//		
//		if ( window != null && window.getActivePage() != null ) {
//			IFile file = ResourcesPlugin.getWorkspace().getRoot().getFileForLocation( new Path( p_fileId ) );
//			
//			if ( file == null ) {
//				// The file may be outside the workspace
//				IFileStore fileStore = EFS.getLocalFileSystem().getStore( new Path( p_fileId ) );
//				
//				if ( !fileStore.fetchInfo().exists() ) {
//					final String location = resourceHandler.locateResource( p_fileId );
//					
//					if ( location == null ) {
//						throw new PartInitException( "Unable to find file " + p_fileId );
//					}
//					
//					fileStore = EFS.getLocalFileSystem().getStore( new Path( location ) );
//
//					if ( !fileStore.fetchInfo().exists() ) {
//						throw new PartInitException( "Unable to find file " + p_fileId );
//					}
//				}
//
//				IDE.openEditorOnFileStore( window.getActivePage(), fileStore );
//			}
//			else {
//				IDE.openEditor( window.getActivePage(), file );
//			}
//		}
//	}
}
