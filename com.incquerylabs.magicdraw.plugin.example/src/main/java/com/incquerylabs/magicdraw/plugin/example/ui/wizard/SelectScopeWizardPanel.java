package com.incquerylabs.magicdraw.plugin.example.ui.wizard;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.Collection;
import java.util.Collections;

import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.JPanel;

import com.incquerylabs.magicdraw.plugin.example.ui.util.PackageFilter;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.resources.DialogResource;
import com.nomagic.magicdraw.ui.SelectionTextFieldSuggestion;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionComponentList;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionComponentTree;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionComponentsConfiguratorsManager;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionComponentsManager;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionDlg;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSelectionPanel;
import com.nomagic.magicdraw.ui.dialogs.selection.ElementSingleSelectionPanel;
import com.nomagic.magicdraw.ui.dialogs.selection.SelectionMode;
import com.nomagic.magicdraw.ui.dialogs.selection.TypeFilter;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.magicdraw.uml.ClassTypes;
import com.nomagic.ui.ExtendedPanel;
import com.nomagic.ui.wizard.SkippableWizardPanel;
import com.nomagic.uml2.ext.magicdraw.auxiliaryconstructs.mdmodels.Model;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Element;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;

public class SelectScopeWizardPanel extends ExtendedPanel implements SkippableWizardPanel {
	
	private ElementSelectionPanel selectionPanel;
	private ExtendedPanel combinedPanel = new ExtendedPanel(new GridBagLayout());
	private ExtendedPanel mainPanel = new ExtendedPanel();
	private ExtendedPanel extendedPanel = new ExtendedPanel();

	public SelectScopeWizardPanel() {
		initMainComponent();
		initExtendedComponent();

		setLayout(new BorderLayout());
		GridBagConstraints c = new GridBagConstraints();
		combinedPanel = new ExtendedPanel(new GridBagLayout());
		c.anchor = GridBagConstraints.CENTER;
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;
		combinedPanel.add(mainPanel, c);
		c.anchor = GridBagConstraints.SOUTH;
		c.gridy = 1;
		c.weightx = 0;
		c.weighty = 0;
		c.fill = GridBagConstraints.HORIZONTAL;
		combinedPanel.add(extendedPanel, c);
		add(combinedPanel);
	}

	public void initMainComponent() {
		clearPanel(mainPanel);
		mainPanel.setLayout(new BorderLayout());
		selectionPanel = new ElementSelectionPanel(model -> {});
		ElementSelectionComponentsManager manager = selectionPanel.getElementSelectionComponentsManager();
		manager.addSelectionComponent(createElementSelectionComponentTree());
		manager.addSelectionComponent(createElementSelectionComponentList());

		ElementSelectionComponentsConfiguratorsManager.getInstance().configure(manager);
		selectionPanel.setSelectionMode(SelectionMode.MULTIPLE_MODE);
		ElementSingleSelectionPanel multipleSelectionPanel = selectionPanel.getSingleSelectionPanel();
		multipleSelectionPanel.getSelectionConfiguration().setElementCreationEnabled(false);
		Object[] initialSelection = new Object[] { Application.getInstance().getProject().getPrimaryModel() };
		TypeFilter packageFilter = new PackageFilter(ClassTypes.getSubtypes(Package.class));
		selectionPanel.initialize(getRoots(), packageFilter, packageFilter, initialSelection);
		selectionPanel.getSelectionModeButton().setVisible(false);
		selectionPanel.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5),
				BorderFactory.createEtchedBorder()));
		selectionPanel.setNoneSelectionSupported(false);
		mainPanel.add(selectionPanel);

	}

	@Override
	public void activate() {
		// update suggestion so if previous step creates some package, next step
		// suggests it.
		selectionPanel.getSingleSelectionPanel().updateComponents(false);
	}

	private void initExtendedComponent() {
		extendedPanel.setLayout(new BorderLayout());
		extendedPanel.removeAll();
	}

	protected static ElementSelectionComponentList createElementSelectionComponentList() {
		return new ElementSelectionComponentList(ElementSelectionDlg.LIST_ID, DialogResource.getString("LIST"));
	}

	protected static ElementSelectionComponentTree createElementSelectionComponentTree() {
		return new ElementSelectionComponentTree(ElementSelectionDlg.TREE_ID, DialogResource.getString("TREE"));
	}

	protected Collection<? extends Element> getRoots() {
		Project project = Application.getInstance().getProject();
		return project != null ? project.getModels() : Collections.<Model>emptyList();
	}

	@Override
	public String getName() {
		return "Select scope";
	}

	@Override
	public String getDescription() {
		return "Select the package whose contents will be exported.";
	}

	@Override
	public boolean validateForNext() {
		JDialog dialog = selectionPanel.getParentDialog();
		if (dialog != null && !dialog.isVisible()) {
			return false;
		}
		Collection<BaseElement> selectedElements = selectionPanel.getSelectedElements();
		return selectionPanel != null
				&& (selectionPanel.isNoneSelectionSupported() && isNoneSelected() || selectedElements.size() > 0);
	}

	private boolean isNoneSelected() {
		SelectionTextFieldSuggestion suggestion = selectionPanel.getSingleSelectionPanel().getActiveComponent()
				.getSuggestion();
		boolean isSingleSelection = suggestion.isSingleSelection();
		Object[] objects = suggestion.getSelectedElements();
		return isSingleSelection && objects.length == 1
				&& DialogResource.getString("UNSPECIFIED_ELEMENT").equals(objects[0]);
	}

	public ElementSelectionPanel getSelectionPanel() {
		return selectionPanel;
	}

	private void clearPanel(JPanel panel) {
		panel.removeAll();
		if (selectionPanel != null) {
			selectionPanel.dispose();
		}
	}

	@SuppressWarnings("unused")
	public ExtendedPanel getCombinedPanel() {
		return combinedPanel;
	}

	public ExtendedPanel getMainPanel() {
		return mainPanel;
	}

	public ExtendedPanel getExtendedPanel() {
		return extendedPanel;
	}

	@Override
	public void deactivate() {
	}

	@Override
	public boolean shouldSkip() {
		return true;
	}

}
