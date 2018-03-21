/*
 *
 * Copyright (c) 2002 NoMagic, Inc. All Rights Reserved.
 */

package com.incquerylabs.magicdraw.plugin.example;

import com.nomagic.actions.AMConfigurator;
import com.nomagic.actions.ActionsCategory;
import com.nomagic.actions.ActionsManager;
import com.nomagic.actions.NMAction;
import com.nomagic.magicdraw.actions.MDActionsCategory;

public class ExampleMainMenuConfigurator implements AMConfigurator {

	String EXAMPLES = "Examples";

	/**
	 * Action will be added to manager.
	 */
	private NMAction action;

	/**
	 * Creates configurator.
	 * 
	 * @param action
	 *            action to be added to main menu.
	 */
	public ExampleMainMenuConfigurator(NMAction action) {
		this.action = action;
	}

	/**
	 * @see com.nomagic.actions.AMConfigurator#configure(ActionsManager) Methods
	 *      adds action to given manager Examples category.
	 */
	@Override
	public void configure(ActionsManager manager) {
		// searching for Examples action category
		ActionsCategory category = (ActionsCategory) manager.getActionFor(EXAMPLES);

		if (category == null) {
			// creating new category
			category = new MDActionsCategory(EXAMPLES, EXAMPLES);
			category.setNested(true);
			manager.addCategory(category);
		}
		category.addAction(action);
	}

	@Override
	public int getPriority() {
		return AMConfigurator.MEDIUM_PRIORITY;
	}

}