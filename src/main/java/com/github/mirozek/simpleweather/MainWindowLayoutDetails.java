package com.github.mirozek.simpleweather;

import java.awt.GridBagConstraints;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.github.mirozek.simpleweather.dto.TextFields;
import com.github.mirozek.simpleweather.gui.MainWindowComponentsPopulator;

public class MainWindowLayoutDetails {
	public JFrame mainWindow;
	public TextFields textFields;
	public JButton getWeatherButton;
	public GridBagConstraints constraints;
	public Map<String, JLabel> labels;
	public MainWindowComponentsPopulator populator;

	public MainWindowLayoutDetails(JFrame mainWindow, TextFields textFields, JButton getWeatherButton,
			GridBagConstraints constraints, Map<String, JLabel> labels, MainWindowComponentsPopulator populator) {
		this.mainWindow = mainWindow;
		this.textFields = textFields;
		this.getWeatherButton = getWeatherButton;
		this.constraints = constraints;
		this.labels = labels;
		this.populator = populator;
	}
}