package com.github.hiiok.simpleweather;

import java.awt.GridBagConstraints;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
import com.github.hiiok.simpleweather.gui.WeatherTextPane;

public class GuiLauncher {

	public GuiLauncher() {

		WeatherFrame weatherFrames = new WeatherFrame();
		JFrame mainWindow = weatherFrames.createMainWindow();

//		WeatherTextPane weatherTextPane = new WeatherTextPane();
//		JTextField zipCodeTextField = weatherTextPane.createZipCodeTextPane();

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
		
		MainWindowLayout mainWindowLayout = new MainWindowLayout();
		mainWindowLayout.setButton(getWeatherButton);
		mainWindowLayout.setConstraints(constraints);
		mainWindowLayout.setLabels(labels);
		mainWindowLayout.setMainWindow(mainWindow);
		mainWindowLayout.setPopulator(populator);
		mainWindowLayout.setTextFields(textFields.getTextFields());

		MainWindowComponentDetails mainWindowComponentDetails = new MainWindowComponentDetails(mainWindowLayout);
		mainWindowComponentDetails.initializeComponentsDetail();
		Map<String, MainWindowComponentSpec> components = mainWindowComponentDetails.getMainWindowComponentDetails();

		MainWindowComponentSpec.setComponentSpec(components);
	}

}