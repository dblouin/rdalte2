package fr.tpt.mem4csd.rdalte.dssl.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import fr.labsticc.framework.ide.wizard.AbstractExampleWizard;

/**
 * Create the example projects.
 */
public class GyroExamplesWizard extends AbstractExampleWizard {

	// The plug-in ID
	protected static final String PLUGIN_ID = "fr.tpt.mem4csd.rdalte.dssl.examples"; //$NON-NLS-1$
	protected static final String EX_SRC_DIR = "examples_src/"; //$NON-NLS-1$

	/**
	 * {@inheritDoc}
	 * 
	 * @see AbstractExampleWizard#getProjectDescriptors()
	 */
	@Override
	protected Collection<ProjectDescriptor> getProjectDescriptors() {
		final List<ProjectDescriptor> projects = new ArrayList<ProjectDescriptor>( 1 );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_gyro_metamodel.zip", 
												"org.gyro.metamodel" ) );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_gyro_metamodel_edit.zip", 
												"org.gyro.metamodel.edit" ) );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_gyro_metamodel_design.zip", 
												"org.gyro.metamodel.design" ) );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_gyro_rdal.zip", 
												"org.gyro.rdal" ) );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_gyro_useme.zip", 
												"org.gyro.useme" ) );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_dssl_metamodel.zip", 
												"fr.tpt.mem4csd.dssl.model" ) );

		return projects;
	}
}
