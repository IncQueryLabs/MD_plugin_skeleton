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

import javax.swing.JOptionPane;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;

import com.incquerylabs.magicdraw.plugin.example.trafos.FullModelBatchTransformation;
import com.incquerylabs.v4md.ViatraQueryAdapter;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;

public class PortTypeCorrectorAction extends MDAction {
	private static final long serialVersionUID = 8437220468635496371L;

	public PortTypeCorrectorAction() {
		super("PORT_CORRECTOR_TRANSFORMATION", "Correct all port types", null, null);
	}

	/**
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		Project project = Application.getInstance().getProject();
		String engineId = PortTypeCorrectorAction.class.getName();

		ViatraQueryAdapter adapter = ViatraQueryAdapter.getOrCreateAdapter(project,engineId);
		AdvancedViatraQueryEngine engine = adapter.getEngine();
		
		FullModelBatchTransformation trafo = new FullModelBatchTransformation(engine);
		trafo.execute();
		
		adapter.dispose(engineId);
		
		JOptionPane.showMessageDialog(MDDialogParentProvider.getProvider().getDialogParent(), "The correction has been performed");
	}

}