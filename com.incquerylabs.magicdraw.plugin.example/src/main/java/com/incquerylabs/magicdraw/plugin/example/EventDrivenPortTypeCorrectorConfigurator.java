package com.incquerylabs.magicdraw.plugin.example;

import java.awt.event.ActionEvent;

import javax.swing.KeyStroke;

import org.eclipse.viatra.query.runtime.api.AdvancedViatraQueryEngine;

import com.incquerylabs.magicdraw.plugin.example.trafos.FullModelEventDrivenTransformation;
import com.incquerylabs.v4md.ViatraQueryAdapter;
import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.BrowserContextAMConfigurator;
import com.nomagic.magicdraw.actions.MDActionsCategory;
import com.nomagic.magicdraw.core.Application;
import com.nomagic.magicdraw.core.Project;
import com.nomagic.magicdraw.task.BackgroundTaskRunner;
import com.nomagic.magicdraw.ui.browser.Tree;
import com.nomagic.task.ProgressStatus;
import com.nomagic.task.RunnableWithProgress;

public class EventDrivenPortTypeCorrectorConfigurator implements BrowserContextAMConfigurator {
	
	private static final String EVENT_DRIVEN_CAT__ID   = "EVENT_DRIVEN_TRANSFORMATION";
	private static final String EVENT_DRIVEN_CAT__NAME = "Event Driven Transformation";
	private static final String EVENT_DRIVEN_ENABLE__ID   = "EVENT_DRIVEN_TRANSFORMATION_ENABLE";
	private static final String EVENT_DRIVEN_ENABLE__NAME = "Enable Event Driven Transformation";
	private static final String EVENT_DRIVEN_DISABLE__ID   = "EVENT_DRIVEN_TRANSFORMATION_DISABLE";
	private static final String EVENT_DRIVEN_DISABLE__NAME = "Disable Event Driven Transformation";

	private final class TransformationHandlerAction extends NMAction {
		private static final long serialVersionUID = 1L;
		private final boolean IS_STARTER;

		public TransformationHandlerAction(String id, String name, KeyStroke key, String group, boolean isStarter) {
			super(id, name, key, group);
			IS_STARTER = isStarter;
		}

		@Override
		public void actionPerformed(ActionEvent event) {
			BackgroundTaskRunner.runWithProgressStatus(new RunnableWithProgress() {
				
				@Override
				public void run(ProgressStatus status) {
					Project project = Application.getInstance().getProject();
					ViatraQueryAdapter adapter = ViatraQueryAdapter.getOrCreateAdapter(project);
					AdvancedViatraQueryEngine engine = adapter.getEngine();
					if(IS_STARTER) {
						FullModelEventDrivenTransformation.start(engine);
					} else {
						FullModelEventDrivenTransformation.stop(engine);
					}
				}
			}, String.format("Port Corrector Transformation (%s)", IS_STARTER?"START":"STOP"), true);
		}
		
		@Override
		public boolean isEnabled() {
			Project project = Application.getInstance().getProject();
			ViatraQueryAdapter adapter = ViatraQueryAdapter.getOrCreateAdapter(project);
			AdvancedViatraQueryEngine engine = adapter.getEngine();
			return IS_STARTER ^ FullModelEventDrivenTransformation.isRunning(engine);
		}
		
	}

	@Override
	public int getPriority() {
		return AMConfigurator.MEDIUM_PRIORITY;
	}

	@Override
	public void configure(ActionsManager manager, Tree tree) {
		ActionsCategory cat = new MDActionsCategory(EVENT_DRIVEN_CAT__ID, EVENT_DRIVEN_CAT__NAME);
		TransformationHandlerAction enableAction = new TransformationHandlerAction(EVENT_DRIVEN_ENABLE__ID, EVENT_DRIVEN_ENABLE__NAME, null, null, true);
		cat.addAction(enableAction);
		TransformationHandlerAction disableAction = new TransformationHandlerAction(EVENT_DRIVEN_DISABLE__ID, EVENT_DRIVEN_DISABLE__NAME, null, null, false);
		cat.addAction(disableAction);
		manager.addCategory(cat);
	}

}
