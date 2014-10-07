package fr.openpeople.rdalte.ide.osate;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.core.resources.IResource;
import org.eclipse.emf.ecore.resource.Resource;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.workspace.WorkspacePlugin;

import fr.labsticc.framework.core.exception.ResourceAccessException;
import fr.labsticc.framework.emf.core.resource.IEMFResourceHandler;

public class OSATEResourceHandler implements IEMFResourceHandler {
	
	protected Collection<String> aadlExtensions;
	
	public OSATEResourceHandler() {
		aadlExtensions = new ArrayList<String>();
		aadlExtensions.add( WorkspacePlugin.SOURCE_FILE_EXT );
		aadlExtensions.add( WorkspacePlugin.MODEL_FILE_EXT );
	}

	@Override
	public boolean handlesResource( final IResource p_resource ) {
		return aadlExtensions.contains( p_resource.getFileExtension() );
	}

	@Override
	public Resource loadResource(IResource p_resource)
	throws ResourceAccessException {
		return OsateResourceUtil.getResource( p_resource );
	}
}
