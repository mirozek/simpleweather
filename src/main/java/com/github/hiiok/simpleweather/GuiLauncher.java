package com.github.hiiok.simpleweather;

import java.awt.GridBagConstraints;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.github.hiiok.simpleweather.dto.Labels;
import com.github.hiiok.simpleweather.dto.MainWindowComponentDetails;
import com.github.hiiok.simpleweather.dto.MainWindowLayout;
import com.github.hiiok.simpleweather.dto.TextFields;
import com.github.hiiok.simpleweather.gui.MainWindowComponentSpec;
import com.github.hiiok.simpleweather.gui.MainWindowComponentsPopulator;
import com.github.hiiok.simpleweather.gui.WeatherComponent;
import com.github.hiiok.simpleweather.gui.WeatherFrame;
import com.github.hiiok.simpleweather.gui.WeatherLabel;
import com.github.hiiok.simpleweather.gui.WeatherText;

public class GuiLauncher {

	public GuiLauncher() {

		WeatherFrame weatherFrames = new WeatherFrame();
		JFrame mainWindow = weatherFrames.createMainWindow();

		WeatherText weatherText = new WeatherText();
		TextFields textFields = new TextFields(weatherText);
		textFields.initializeTextFields();

		WeatherComponent weatherButtons = new WeatherComponent(textFields.getTextFields());
		JButton getWeatherButton = weatherButtons.createWeatherComponent();

		WeatherLabel weatherLabel = new WeatherLabel();

		GridBagConstraints constraints = new GridBagConstraints();
		Labels labelDTO = new Labels(weatherLabel);
		Map<String, JLabel> labels = labelDTO.getLabels();
		
		MainWindowComponentsPopulator populator = new MainWindowComponentsPopulator();
		
		MainWindowLayout mainWindowLayout = setMainWindowLayoutDetails(new MainWindowLayoutDetails(mainWindow, textFields, getWeatherButton, constraints, labels, populator));

		MainWindowComponentDetails mainWindowComponentDetails = new MainWindowComponentDetails(mainWindowLayout);
		mainWindowComponentDetails.initializeComponentsDetail();
		Map<String, MainWindowComponentSpec> components = mainWindowComponentDetails.getMainWindowComponentDetails();

		MainWindowComponentSpec.setComponentSpec(components);
	}

	private MainWindowLayout setMainWindowLayoutDetails(MainWindowLayoutDetails mainWindowLayoutDetails) {
		MainWindowLayout mainWindowLayout = new MainWindowLayout();
		mainWindowLayout.setButton(mainWindowLayoutDetails.getWeatherButton);
		mainWindowLayout.setConstraints(mainWindowLayoutDetails.constraints);
		mainWindowLayout.setLabels(mainWindowLayoutDetails.labels);
		mainWindowLayout.setMainWindow(mainWindowLayoutDetails.mainWindow);
		mainWindowLayout.setPopulator(mainWindowLayoutDetails.populator);
		mainWindowLayout.setTextFields(mainWindowLayoutDetails.textFields.getTextFields());
		return mainWindowLayout;
	}

}