package com.github.hiiok.simpleweather;

import java.awt.GridBagConstraints;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.github.hiiok.simpleweather.dto.TextFields;
import com.github.hiiok.simpleweather.gui.MainWindowComponentsPopulator;

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