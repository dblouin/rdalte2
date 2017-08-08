package fr.tpt.rdalte.useme.examples;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import fr.labsticc.framework.ide.wizard.AbstractExampleWizard;

/**
 * Create the example projects.
 */
public class GyroExamplesWizard extends AbstractExampleWizard {

	// The plug-in ID
	protected static final String PLUGIN_ID = "fr.tpt.rdalte.useme.examples"; //$NON-NLS-1$
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
												EX_SRC_DIR + "ex_gyro_dsl.zip", 
												"gyro" ) );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_gyro_metamodel.zip", 
												"org.farrusco" ) );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_gyro_metamodel_edit.zip", 
												"org.farrusco.edit" ) );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_gyro_metamodel_design.zip", 
												"org.farrusco.design" ) );
		projects.add( new ProjectDescriptor( 	PLUGIN_ID, 
												EX_SRC_DIR + "ex_gyro_useme.zip", 
												"org.gyro.useme" ) );

		return projects;
	}
}
