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
package fr.openpeople.rdalte.ide;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.labsticc.framework.ide.util.PluginUtil;
import fr.openpeople.rdal2.model.rdal.provider.RdalItemProviderAdapterFactory;
import fr.openpeople.rdalte.ide.view.IEditorHandler;
import fr.openpeople.rdalte.ide.view.traceability.navigator.ICoverageLister;

/**
 * The activator class controls the plug-in life cycle
 */
public class RdalIdePlugin extends AbstractUIPlugin {

	// The plug-in ID
	private static final String COVERAGE_LISTER_EXT_ID = "coverageListers";
	private static final String COVERAGE_LISTER_EXT_PROVIDER_ELEM = "provider";
	private static final String COVERAGE_LISTER_EXT_PROVIDER_ELEM_CLASS_ATT = "class";

	private static final String EDITOR_HANDLER_EXT_ID = "editorHandlers";
	private static final String EDITOR_HANDLER_EXT_HANDLER_ELEM = "handler";
	private static final String EDITOR_HANDLER_EXT_HANDLER_ELEM_CLASS_ATT = "class";

	private static final String ADDITIONAL_ADAPTER_FACT_EXT_ID = ".additionalAdapterFactories";
	private static final String ADDITIONAL_ADAPTER_FACT_EXT_FACTORY_ELEM = "factory";
	private static final String ADDITIONAL_ADAPTER_FACT_EXT_FACTORY_ELEM_CLASS_ATT = "class";

	// The shared instance
	private static RdalIdePlugin plugin;
	
	private IExceptionHandler exceptionHandler;
	
	private final Collection<ICoverageLister> coverageListers;
	private final Collection<IEditorHandler> editorHandlers;

	private ComposedAdapterFactory adapterFactory;
	
	private Logger logger;

	/**
	 * The constructor
	 */
	public RdalIdePlugin() {
		coverageListers = new ArrayList<ICoverageLister>();
		editorHandlers = new ArrayList<IEditorHandler>();
		
		try {
			logger = LoggerFactory.getLogger( getClass() );
		}
		catch( final Throwable p_th ) {
			p_th.printStackTrace();
		}
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context)
	throws Exception {
		super.start(context);

		plugin = this;
		exceptionHandler = new RdalteExceptionHandler( LoggerFactory.getLogger( RdalIdePlugin.class ) );
		initCoverageListers();
		initEditorHandlers();
		initItemProviderFactories();
		System.out.println( "RDAL Plugin started." );
		logger.info( "RDAL Plugin started." );
	}

	private void initItemProviderFactories() 
	throws CoreException {
		adapterFactory = new ComposedAdapterFactory();
		adapterFactory.addAdapterFactory( new RdalItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory( new ResourceItemProviderAdapterFactory() );
		//adapterFactory.addAdapterFactory( new EcoreItemProviderAdapterFactory() );

		final IExtensionPoint point = Platform.getExtensionRegistry().getExtensionPoint( getBundle().getSymbolicName() + ADDITIONAL_ADAPTER_FACT_EXT_ID);

		for (final IExtension extension : point.getExtensions() ) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();

			for (final IConfigurationElement element : elements ) {
				if ( ADDITIONAL_ADAPTER_FACT_EXT_FACTORY_ELEM.equals(element.getName())) {
					logger.info( "Adding adapter " + element.getAttribute( ADDITIONAL_ADAPTER_FACT_EXT_FACTORY_ELEM_CLASS_ATT ) );
					adapterFactory.addAdapterFactory( (AdapterFactory) element.createExecutableExtension(ADDITIONAL_ADAPTER_FACT_EXT_FACTORY_ELEM_CLASS_ATT));
				}
			}
		}

		adapterFactory.addAdapterFactory( new ReflectiveItemProviderAdapterFactory() );
	}

	public AdapterFactory getItemProvidersAdapterFactory() {
		return adapterFactory;
	}
	
	private void initCoverageListers() 
	throws CoreException {
		for( final IExtension extension : PluginUtil.getExtensionPointExtensions( getBundle().getSymbolicName(), COVERAGE_LISTER_EXT_ID ) ) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
		
			for( final IConfigurationElement element : elements ) {
				if ( COVERAGE_LISTER_EXT_PROVIDER_ELEM.equals( element.getName() ) ) {
					coverageListers.add( (ICoverageLister) element.createExecutableExtension( COVERAGE_LISTER_EXT_PROVIDER_ELEM_CLASS_ATT ) );
				}
			}
		}
	}
	
	private void initEditorHandlers() 
	throws CoreException {
		for( final IExtension extension : PluginUtil.getExtensionPointExtensions( getBundle().getSymbolicName(), EDITOR_HANDLER_EXT_ID ) ) {
			final IConfigurationElement[] elements = extension.getConfigurationElements();
		
			for( final IConfigurationElement element : elements ) {
				if ( EDITOR_HANDLER_EXT_HANDLER_ELEM.equals( element.getName() ) ) {
					editorHandlers.add( (IEditorHandler) element.createExecutableExtension( EDITOR_HANDLER_EXT_HANDLER_ELEM_CLASS_ATT ) );
				}
			}
		}
	}

	public Collection<IEditorHandler> getEditorHandlers() {
		return editorHandlers;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		exceptionHandler = null;
		coverageListers.clear();
		editorHandlers.clear();
		adapterFactory = null;
		
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static RdalIdePlugin getDefault() {
		return plugin;
	}

	public IExceptionHandler getExceptionHandler() {
		return exceptionHandler;
	}

	public Collection<ICoverageLister> getDefinedCoverageListers() {
		return coverageListers;
	}
}
