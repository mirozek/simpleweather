package com.github.hiiok.simpleweather.dto;

import java.awt.GridBagConstraints;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.github.hiiok.simpleweather.gui.MainWindowComponentsPopulator;

public class MainWindowLayout {
	private Map<String, JLabel> labels;
	private Map<String, JTextField> textFields;
	private JButton button;
	private MainWindowComponentsPopulator populator;
	private JFrame mainWindow;
	private GridBagConstraints constraints;
	public Map<String, JLabel> getLabels() {
		return labels;
	}
	public void setLabels(Map<String, JLabel> labels) {
		this.labels = labels;
	}
	public Map<String, JTextField> getTextFields() {
		return textFields;
	}
	public void setTextFields(Map<String, JTextField> textFields) {
		this.textFields = textFields;
	}
	public JButton getButton() {
		return button;
	}
	public void setButton(JButton button) {
		this.button = button;
	}
	public MainWindowComponentsPopulator getPopulator() {
		return populator;
	}
	public void setPopulator(MainWindowComponentsPopulator populator) {
		this.populator = populator;
	}
	public JFrame getMainWindow() {
		return mainWindow;
	}
	public void setMainWindow(JFrame mainWindow) {
		this.mainWindow = mainWindow;
	}
	public GridBagConstraints getConstraints() {
		return constraints;
	}
	public void setConstraints(GridBagConstraints constraints) {
		this.constraints = constraints;
	}
}
