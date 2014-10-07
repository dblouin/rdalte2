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
package fr.openpeople.rdalte.ide.view.contractelement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.swt.widgets.Text;

import fr.labsticc.framework.constraints.core.ICompletionProposal;
import fr.labsticc.framework.constraints.ide.view.UsedLibrarySelectionDialog;
import fr.labsticc.framework.constraints.model.constraints.ConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.Expression;
import fr.labsticc.framework.constraints.model.constraints.FormalConstraintLanguage;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageExpression;
import fr.labsticc.framework.constraints.model.constraints.FormalLanguageLibrary;
import fr.labsticc.framework.constraints.view.ConstraintPanel;
import fr.labsticc.framework.constraints.view.IConstraintPanelActionHandler;
import fr.labsticc.framework.constraints.view.IConstraintViewersConfiguration;
import fr.labsticc.framework.core.exception.IExceptionHandler;
import fr.openpeople.rdal2.model.rdal.TextualContractualElement;
import fr.openpeople.rdalte.ide.view.AbstractRdalEditorViewPage;
import fr.openpeople.rdalte.ide.view.EditorUtil;
import fr.openpeople.rdalte.service.IContractualElementBusinessDelegate;

public class ContractualElementViewPage extends AbstractRdalEditorViewPage<TextualContractualElement> {
	
	private final IContractualElementBusinessDelegate businessDelegate;

	private final ILabelProvider labelProvider;
	private ConstraintPanel pnlConstraint;
	private DesignElementsPanel pnlDesignElements;
	private Text tfdDescription;
	
	private TabFolder tabFolder;
	
	private final Image externalImage;
	
	public ContractualElementViewPage( 	final Composite p_parent,
										final IContractualElementBusinessDelegate p_businessDelegate,
										final IConstraintViewersConfiguration p_constraintViewsConfig,
										final IExceptionHandler p_execeptionHandler ) {
		super( p_parent, SWT.NULL, p_execeptionHandler );
		
		businessDelegate = p_businessDelegate;
		labelProvider = new LabelProvider() {

			@Override
			public String getText( final Object p_object ) {
				return businessDelegate.getText( p_object );
			}

			@Override
			public Image getImage( final Object p_object ) {
				return (Image) businessDelegate.getImage( p_object );
			}
		};

		pnlConstraint = null;
		pnlDesignElements = null;
		externalImage = createImage( "expressionsView.gif" );
		createControls( p_constraintViewsConfig );
	}
	
	@Override
	public String getExternalTitle() {
		return "Constraint";
	}
	
	@Override
	public Image getExternalImage() {
		return externalImage;
	}
	
	@Override
	public void dispose() {
		super.dispose();

		if ( !externalImage.isDisposed() ) {
			externalImage.dispose();
		}
	}

	private void createControls( final IConstraintViewersConfiguration p_constraintViewsConfig ) {
		setLayout( new FillLayout() );
		tabFolder = new TabFolder( this, SWT.NONE );
		tabFolder.addSelectionListener( new SelectionListener() {
			
			@Override
			public void widgetSelected(SelectionEvent e) {
				final int selectedTabIndex = ( (TabFolder) e.getSource() ).getSelectionIndex();
				
				switch ( selectedTabIndex ) {
					case 0:
						displayReferencedModelElements();
						break;
					case 1:
						displayConstraintExpression();
						break;
	
					default:
						break;
				}
				
				//tabFolder.update();
			}
			
			@Override
			public void widgetDefaultSelected(SelectionEvent e) {
			}
		} );
		
		//tabFolder.setLayout( new FillLayout() );
		createTabReferencedModelElements( tabFolder, p_constraintViewsConfig );
		createTabExpression( tabFolder, p_constraintViewsConfig );
	}

	/**
	 * Building Tab Item "Expression"
	 */
	private void createTabExpression( 	final TabFolder p_tabFolder,
										final IConstraintViewersConfiguration p_constraintViewsConfig ) {
		final TabItem item = new TabItem( p_tabFolder, SWT.NULL );
		item.setText( "Constraint Expression" );
		
		final IConstraintPanelActionHandler actionHandler = new IConstraintPanelActionHandler() {
			
			@Override
			public List<ICompletionProposal> completionProposalRequested( 	final String p_languageId,
																			final String p_constraintExpr,
																			final Collection<String> p_libraries ) {
				if ( isFormalLanguage( p_languageId ) ) {
					final TextualContractualElement requirement = saveData();
					
					try {
						return businessDelegate.computeCompletionProposals( requirement, p_constraintExpr );
					}
					catch ( final Throwable p_th ) {
						handleException( p_th, requirement );
					}
				}
				
				return null;
			}

			@Override
			public String constraintEvaluationRequested(	final String p_languageId,
															final String p_constraintExpr, 
															final Collection<String> p_libraries ) {
				if ( isFormalLanguage(p_languageId ) ) {
					final TextualContractualElement requirement = saveData();
					
					try {
						return businessDelegate.evaluateExpressionAsString( requirement );
					}
					catch ( final Throwable p_th ) {
						handleException( p_th, requirement );
					}
				}
				
				return null;
			}

			@Override
			public String constraintLoadingRequested( final String p_languageId ) {
				final TextualContractualElement requirement = saveData();
				
				final FileDialog fileDialog = new FileDialog( getShell(), SWT.OPEN );

				try {
					fileDialog.setFilterExtensions( new String[] { businessDelegate.languageFileExtension( requirement, p_languageId ) } );
					fileDialog.setText( "Load Constraint Expression" );
					final String resourceId = fileDialog.open();
	
					if ( resourceId != null ) {
						final String constraintText = businessDelegate.readConstraintText( 	p_languageId,
																							resourceId );
						
						// Must save the new data
						displayData( businessDelegate.setExpressionText( requirement, p_languageId, constraintText ) );
						
						return constraintText;
					}
				}
				catch ( final Throwable p_th ) {
					handleException( p_th, p_languageId );
				}
				
				return null;
			}

			@Override
			public void constraintSavingRequested( 	final String p_languageId,
													final String p_constraintExpression ) {
				final TextualContractualElement requirement = getSelectedObject();
				final String languageId = pnlConstraint.getLanguageId();
				
				final FileDialog fileDialog = new FileDialog( getShell(), SWT.SAVE );

				try {
					fileDialog.setFilterExtensions( new String[] { businessDelegate.languageFileExtension( 	requirement, 
																											p_languageId ) } );
					fileDialog.setText( "Save Constraint Expression" );
					final String resourceId = fileDialog.open();
	
					if ( resourceId != null ) {
						businessDelegate.persistConstraint( languageId, resourceId, p_constraintExpression );
					} 
				}
				catch ( final Throwable p_th ) {
					handleException( p_th, requirement );
				}
			}

			@Override
			public Collection<String> constraintLanguageChanged( final String p_newLanguageId ) {
				final TextualContractualElement requirement = saveData();

				try {
					displayData( businessDelegate.setExpressionLanguage( requirement, p_newLanguageId ) );
				}
				catch ( final Throwable p_th ) {
					handleException( p_th, getSelectedObject() );
				}
				
				final Expression expression = getSelectedObject().getOwnedExpression();
				
				if ( expression instanceof FormalLanguageExpression ) {
					return ( (FormalLanguageExpression) expression ).getUsedLibraryNames();
				}
				
				return null;
			}

			@Override
			public Collection<String> addLibrariesRequested( 	final String p_languageId,
																final Collection<String> p_currentLibraries  ) {
				final TextualContractualElement requirement = saveData();

				final FormalLanguageExpression expression = (FormalLanguageExpression) requirement.getOwnedExpression();
				
				try {
					final UsedLibrarySelectionDialog dialog = new UsedLibrarySelectionDialog( 	getShell(), 
																								labelProvider, 
																								expression,
																								businessDelegate.librariesChoice( expression ) );
					if ( dialog.open() == Window.OK ) {
						businessDelegate.setExpressionLibraries( requirement, dialog.getResult() );
						
						return expression.getUsedLibraryNames();
					}
				}
				catch ( final Throwable p_th ) {
					handleException( p_th , requirement );
				}
				
				return null;
			}

			@Override
			public void librariesRefreshRequested( final Collection<String> p_libraryNames ) {
				try {
					displayData( businessDelegate.refreshLibraries( saveData(), libraryIds( p_libraryNames ) ) );
				}
				catch ( final Throwable p_th ) {
					handleException( p_th , getSelectedObject() );
				}
			}

			@Override
			public void librariesDeleted( final Collection<String> p_libraryNames ) {
				try {
					businessDelegate.deleteLibraries( saveData(), libraryIds( p_libraryNames ) );
				}
				catch ( final Throwable p_th ) {
					handleException( p_th , getSelectedObject() );
				}
			}

			@Override
			public void openLibrariesRequested( final Collection<String> p_libraryNames ) {
				try {
					EditorUtil.openEditors( libraryIds( p_libraryNames ) );
				}
				catch ( final Throwable p_th ) {
					handleException( p_th, p_libraryNames );
				}
			}

			@Override
			public void constraintTextChanged( 	final String p_languageId, 
												final String p_constraintExpression ) {
				try {
					// Does not change the requirement other than the constraint text so no need to call 
					// displayData()
					businessDelegate.setExpressionText( saveData(), p_languageId, p_constraintExpression );
				}
				catch ( final Throwable p_th ) {
					handleException( p_th, getSelectedObject() );
				}
			}
		};

		final Composite pnlExpression = new Composite( p_tabFolder, SWT.NULL );
		item.setControl( pnlExpression );
		
		
		pnlExpression.setLayout( new GridLayout() );
		final Label lblDescription = new Label( pnlExpression, SWT.NULL );
		lblDescription.setText( "Description" );
		tfdDescription = new Text( pnlExpression, SWT.DEFAULT );
		tfdDescription.setEditable( true );
		tfdDescription.setLayoutData(	new GridData( 	GridData.FILL, 
														GridData.BEGINNING, 
														true, 
														false ) );
		
		tfdDescription.addModifyListener( new ModifyListener() {
			
			@Override
			public void modifyText( final ModifyEvent p_evt ) {
				try {
					businessDelegate.setDescriptionText( getSelectedObject(), ( (Text) p_evt.getSource() ).getText() );
				}
				catch( final Throwable p_th ) {
					getExceptionHandler().handleException( p_th, getSelectedObject() );
				}
			}
		} );
		
		pnlConstraint = new ConstraintPanel( 	pnlExpression,
												SWT.NULL,
												actionHandler,
												p_constraintViewsConfig,
												getExceptionHandler() );
		pnlConstraint.setLayoutData(	new GridData( 	GridData.FILL, 
														GridData.FILL, 
														true, 
														true ) );
		pnlConstraint.setLayout( new FillLayout() );
	}
	
	private Collection<String> libraryIds( final Collection<String> p_libraryNames ) {
		final Collection<String> libIds = new HashSet<String>();
		final FormalConstraintLanguage language = (FormalConstraintLanguage) ( (FormalLanguageExpression) getSelectedObject().getOwnedExpression() ).getLanguage();
		
		for ( final String libName : p_libraryNames ) {
			final FormalLanguageLibrary library = language.libraryByName( libName );
			
			if ( library != null ) {
				libIds.add( library.getId() );
			}
		}
		
		return libIds;
	}
	
	private boolean isFormalLanguage( final String p_languageId ) {
		return businessDelegate.constraintLanguage( getSelectedObject(), p_languageId ) instanceof FormalConstraintLanguage;
	}

	/**
	 * Building Tab Item "Design Elements"
	 */
	private void createTabReferencedModelElements( 	final TabFolder p_tabFolder,
													final IConstraintViewersConfiguration p_constraintViewsConfig ) {
		final TabItem item = new TabItem( p_tabFolder, SWT.NULL );
		item.setText( "Design Elements" );
		pnlDesignElements = new DesignElementsPanel( 	p_tabFolder, 
														SWT.NULL, 
														p_constraintViewsConfig,
														businessDelegate, 
														getExceptionHandler() );
		item.setControl( pnlDesignElements );
	}
	
	@Override
	public void displayData( final TextualContractualElement p_requirement ) {
		// Parent class sets the selected object
		super.displayData( p_requirement );

		tfdDescription.setText( p_requirement.getDescription() == null ? "" : p_requirement.getDescription() );
		
		displayReferencedModelElements();
		displayConstraintExpression();
	}
	
	private void displayReferencedModelElements() {
		if ( pnlDesignElements != null ) {
			pnlDesignElements.displayData( getSelectedObject() );
		}
	}
	
	private void displayConstraintExpression() {
		if ( pnlConstraint != null ) {
			final String expressionText;
			final String languageId;
	
			final Expression cstExpression = getSelectedObject().getOwnedExpression();
			
			if ( cstExpression == null ) {
				expressionText = null;
				languageId = null;
			}
			else {
				expressionText = cstExpression.getText();
				
				final ConstraintLanguage language = cstExpression.getLanguage();
				languageId = language == null ? null : language.getId();
			}
			
			final Set<String> definedLanguageIds = new TreeSet<String>();
	
			for ( final ConstraintLanguage language : definedLanguages() ) {
				definedLanguageIds.add( language.getId() );
			}
	
			pnlConstraint.configure( definedLanguageIds, languageId );
			pnlConstraint.displayConstraint( expressionText, null );
			displayLibraries( cstExpression );
		}
	}
	
	private void displayLibraries( final Expression p_expression ) {
		final Collection<String> libraryNames = new ArrayList<String>();

		if ( p_expression instanceof FormalLanguageExpression ) {
			for ( final FormalLanguageLibrary library : ( (FormalLanguageExpression) p_expression ).getUsedLibraries() ) {
				libraryNames.add( library.getName() );
			}
		}
		
		pnlConstraint.setLibraries( libraryNames );
	}
	
	private Collection<ConstraintLanguage> definedLanguages() {
		return businessDelegate.definedLanguages( getSelectedObject() );
	}
}
