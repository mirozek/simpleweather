package com.github.hiiok.simpleweather.gui;

import java.awt.GridBagConstraints;
import java.util.Map;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class MainWindowComponentSpec {
	private int fill;
	private int gridx; 
	private int gridy;
	private JFrame parent;
	private JComponent component; 
	private GridBagConstraints constraints;

	public int getFill() {
		return fill;
	}
	public void setFill(int fill) {
		this.fill = fill;
	}
	public int getGridx() {
		return gridx;
	}
	public void setGridx(int gridx) {
		this.gridx = gridx;
	}
	public int getGridy() {
		return gridy;
	}
	public void setGridy(int gridy) {
		this.gridy = gridy;
	}
	public JFrame getParent() {
		return parent;
	}
	public void setParent(JFrame parent) {
		this.parent = parent;
	}
	public JComponent getComponent() {
		return component;
	}
	public void setComponent(JComponent component) {
		this.component = component;
	}
	public GridBagConstraints getConstraints() {
		return constraints;
	}
	public void setConstraints(GridBagConstraints constraints) {
		this.constraints = constraints;
	}
	
	public static void setComponentSpec(Map<String, MainWindowComponentSpec> components) {
		MainWindowComponentsPopulator.setComponentConstraint(components.get("zipCodePositionSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("zipCodeTextFieldSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("getWeatherButtonSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("cityNameLabelSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("windLabelSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("pressureLabelSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("temperatureLabelSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("cityNameSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("windTextSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("temperatureTextFieldSpec"));
		MainWindowComponentsPopulator.setComponentConstraint(components.get("pressureTextFieldSpec"));

	}
}
