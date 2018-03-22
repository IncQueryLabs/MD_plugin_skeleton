package com.incquerylabs.magicdraw.plugin.example;

import java.awt.event.ActionEvent;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.swing.JOptionPane;

import org.eclipse.collections.impl.collector.Collectors2;
import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;

import com.incquerylabs.magicdraw.plugin.example.queries.TEST;
import com.incquerylabs.magicdraw.plugin.example.queries.TESTPattern.Match;
import com.incquerylabs.v4md.ViatraQueryAdapter;
import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.actions.MDAction;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.plugins.Plugin;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;

public class ExamplePlugin extends Plugin {
	@Override
	public boolean close() {
		return true;
	}

	@Override
	public void init() {

		ActionsConfiguratorsManager manager = ActionsConfiguratorsManager.getInstance();
		manager.addMainMenuConfigurator(new ExampleMainMenuConfigurator(new SimpleAction("EXAMPLE_ACTION", "Example Action")));

	}

	@Override
	public boolean isSupported() {
		return true;
	}

	class SimpleAction extends MDAction {
		private static final long serialVersionUID = 8437220468635496371L;

		public SimpleAction(String id, String name) {
			super(id, name, null, null);
		}

		/**
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		@Override
		public void actionPerformed(ActionEvent e) {
			Project project = Application.getInstance().getProject();
			ViatraQueryAdapter adapter = ViatraQueryAdapter.getOrCreateAdapter(project);
			AdvancedViatraQueryEngine engine = adapter.getEngine();
			
			String string = TEST.instance().getTESTPattern(engine).getAllMatches().stream().map( c -> c.getValueOfClass().getName()).collect(Collectors.joining("\n"));
			
			
			JOptionPane.showMessageDialog(MDDialogParentProvider.getProvider().getDialogParent(),
					string);
		}

	}

}
