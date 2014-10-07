/**
 */
package fr.openpeople.rdal2.model.rdal.util;

import org.eclipse.emf.common.util.URI;

import org.eclipse.emf.ecore.xmi.impl.URIHandlerImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see fr.openpeople.rdal2.model.rdal.util.RdalResourceFactoryImpl
 * @generated
 */
public class RdalResourceImpl extends XMIResourceImpl {
	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @generated NOT
	 */
	public RdalResourceImpl(URI uri) {
		super(uri);
		
		// DB: Allow preserving the config sheme.
		getDefaultSaveOptions().put( OPTION_URI_HANDLER, new URIHandlerImpl.PlatformSchemeAware() );
	}

} //RdalResourceImpl
