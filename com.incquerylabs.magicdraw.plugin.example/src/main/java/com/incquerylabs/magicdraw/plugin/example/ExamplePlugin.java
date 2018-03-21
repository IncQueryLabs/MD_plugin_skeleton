package com.incquerylabs.magicdraw.plugin.example;

import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

import com.nomagic.magicdraw.actions.ActionsConfiguratorsManager;
import com.nomagic.magicdraw.actions.MDAction;
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
			JOptionPane.showMessageDialog(MDDialogParentProvider.getProvider().getDialogParent(),
					"This is:" + getName());
		}

	}

}
