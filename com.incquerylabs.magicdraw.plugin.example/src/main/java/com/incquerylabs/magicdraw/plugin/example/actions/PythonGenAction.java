/*******************************************************************************
 * Copyright (c) 2010-2019, Gabor Bergmann, IncQuery Labs Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   Gabor Bergmann - initial API and implementation
 *******************************************************************************/
package com.incquerylabs.magicdraw.plugin.example.actions;

import java.awt.event.ActionEvent;
import java.io.File;
import java.util.List;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;

import com.incquerylabs.magicdraw.plugin.example.codegen.GenPython;
import com.incquerylabs.magicdraw.plugin.example.ui.wizard.SelectPackageAndOutputDirectoryWizard;
import com.incquerylabs.magicdraw.plugin.example.ui.wizard.SelectPackageAndOutputDirectoryWizard.FinalizeWizardAction;
import com.incquerylabs.v4md.ViatraQueryAdapter;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;

/**
 * @author Gabor Bergmann
 *
 */
public class PythonGenAction extends MDAction {
	private static final long serialVersionUID = 5056580037284941136L;

	public PythonGenAction() {
		super("PYTHON_CODE_GENERATOR", "Generate Python code", null, null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		SelectPackageAndOutputDirectoryWizard wizard = new SelectPackageAndOutputDirectoryWizard(new FinalizeWizardAction() {
			
			@Override
			public void finalizeWizard(List<Package> selectedPackages, File selectedFolder) {
				Project project = Application.getInstance().getProject();
				ViatraQueryAdapter adapter = ViatraQueryAdapter.getOrCreateAdapter(project);
				AdvancedViatraQueryEngine engine = adapter.getEngine();
				
				GenPython gen = new GenPython(engine, 
						selectedFolder.toString(), 
						"gen_project", 
						selectedPackages);
				gen.doGen();
			}
		});
		
		wizard.setVisible(true);
		
		//JOptionPane.showMessageDialog(MDDialogParentProvider.getProvider().getDialogParent(), "The code generation has been performed");
	}
}
