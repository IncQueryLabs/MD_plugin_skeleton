package com.incquerylabs.magicdraw.plugin.example.ui.wizard;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.jidesoft.swing.FolderChooser;
import com.nomagic.magicdraw.ui.MagicDrawProgressStatusRunner;
import com.nomagic.magicdraw.ui.dialogs.MDDialogParentProvider;
import com.nomagic.magicdraw.uml.BaseElement;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;
import com.nomagic.ui.ExtendedPanel;
import com.nomagic.ui.wizard.DefaultWizardController;
import com.nomagic.ui.wizard.Wizard;
import com.nomagic.ui.wizard.WizardDlg;
import com.nomagic.ui.wizard.WizardInterface;
import com.nomagic.ui.wizard.WizardPanel;
import com.nomagic.uml2.ext.magicdraw.classes.mdkernel.Package;

public class SelectPackageAndOutputDirectoryWizard extends WizardDlg {

	private static final long serialVersionUID = 3608338542286096462L;
	private SelectScopeWizardPanel scopePanel;
	private FilePanel filePanel;
	private FinalizeWizardAction action;

	public SelectPackageAndOutputDirectoryWizard(FinalizeWizardAction action) {
			super(MDDialogParentProvider.getProvider().getDialogParent(), "Select Package and Output Directory", true);
			this.action = action;
			init(); // Panels have to be created
	}

	@Override
	protected WizardPanel[] createWizardPanels() {
		Wizard panel = this.getWizardPanel();
		
		Controller controller = new Controller(this, panel, action);
		panel.setWizardController(controller);

		scopePanel = new SelectScopeWizardPanel();
		filePanel = new FilePanel();
		return new WizardPanel[] { scopePanel, filePanel };
	}

	public class FilePanel extends ExtendedPanel implements WizardPanel {

		public final FolderChooser chooser;

		public FilePanel() {
			chooser = new FolderChooser();
			chooser.setApproveButtonText("Select");
			chooser.setRecentListVisible(false);
			FilePanel.this.add(chooser);
		}

		@Override
		public String getName() {
			return "Select output directory";
		}

		@Override
		public String getDescription() {
			return "Select the destination directory.";
		}

		@Override
		public void activate() {
		}

		@Override
		public void deactivate() {
		}

		@Override
		public boolean validateForNext() {
			return true;
		}

	}
	
	public interface FinalizeWizardAction {
		
		public void finalizeWizard(List<Package> selectedPackages, File selectedFolder);
		
	}
	
	public class Controller extends DefaultWizardController {

		private FinalizeWizardAction action;

		public Controller(WizardDlg dialog, WizardInterface wizardInterface, FinalizeWizardAction action) {
			super(dialog, wizardInterface);
			this.action = action;
			System.out.println("Controller ctor" + action);
		}

		@Override
		public boolean isFinishEnabled() {
			return getWizardPanels() != null && wizard.getSelectedIndex() == getWizardPanels().length - 1;
		}

		@Override
		public void doFinish() {
			super.doFinish();
			MagicDrawProgressStatusRunner.runWithProgressStatus(new RunnableWithProgress() {
				@Override
				public void run(ProgressStatus status) {
					status.setIndeterminate(true);
					File selectedFolder = filePanel.chooser.getSelectedFolder();
					List<BaseElement> selectedElements = scopePanel.getSelectionPanel().getSelectedElements();
					List<Package> selectedPackages = new ArrayList<>();
					for (BaseElement baseElement : selectedElements) {
						if(baseElement instanceof Package) {
							selectedPackages.add((Package) baseElement);
						}
					}
					finalizeWizard(selectedPackages, selectedFolder);
				}
			}, "Finalizing Wizard", false, 0);
		}

		protected void finalizeWizard(List<Package> selectedPackages, File selectedFolder) {
				System.out.println("Controller finalizeWizard" + action);
				action.finalizeWizard(selectedPackages, selectedFolder);
		}

	}

}
