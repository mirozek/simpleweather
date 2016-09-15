package com.github.hiiok.simpleweather.gui;

import java.awt.GridBagConstraints;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class MainWindowComponentsPopulator {

	public static void setComponentConstraint(MainWindowComponentSpec mainWindowComponentSpec) {

		GridBagConstraints constraints = mainWindowComponentSpec.getConstraints();
		JFrame parent = mainWindowComponentSpec.getParent();
		JComponent component = mainWindowComponentSpec.getComponent();

		constraints.fill = mainWindowComponentSpec.getFill();
		constraints.gridx = mainWindowComponentSpec.getGridx();
		constraints.gridy = mainWindowComponentSpec.getGridy();
		constraints.weightx = 1;
		constraints.weighty = 1;

		parent.add(component, constraints);
	}

	public MainWindowComponentSpec arrangeComponent(int gridx, int gridy, GridBagConstraints constraints, JFrame parent, JComponent component) {
		MainWindowComponentSpec mainWindowComponentSpec = new MainWindowComponentSpec();
		mainWindowComponentSpec.setFill(GridBagConstraints.CENTER);
		mainWindowComponentSpec.setGridx(gridx);
		mainWindowComponentSpec.setGridy(gridy);
		mainWindowComponentSpec.setConstraints(constraints);
		mainWindowComponentSpec.setParent(parent);
		mainWindowComponentSpec.setComponent(component);
		return mainWindowComponentSpec;
	}
}
