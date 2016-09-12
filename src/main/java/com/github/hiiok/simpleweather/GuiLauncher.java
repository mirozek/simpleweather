package com.github.hiiok.simpleweather;

import java.awt.GridBagConstraints;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import com.github.hiiok.simpleweather.gui.MainWindowComponentSpec;
import com.github.hiiok.simpleweather.gui.MainWindowComponentsPopulator;
import com.github.hiiok.simpleweather.gui.WeatherButton;
import com.github.hiiok.simpleweather.gui.WeatherFrame;
import com.github.hiiok.simpleweather.gui.WeatherLabel;
import com.github.hiiok.simpleweather.gui.WeatherText;
import com.github.hiiok.simpleweather.gui.WeatherTextPane;

public class GuiLauncher {

	public GuiLauncher() {
		WeatherFrame weatherFrames = new WeatherFrame();
		JFrame mainWindow = weatherFrames.createMainWindow();
		
		WeatherTextPane weatherTextPane = new WeatherTextPane();
		JTextField zipCodeTextField = weatherTextPane.createZipCodeTextPane();
	
		WeatherText getURLinfo = new WeatherText();
		JTextField getCityNameTextField = getURLinfo.createCityName();
		JTextField getPressureTextField = getURLinfo.createPressure();
		JTextField getTemperatureTextField = getURLinfo.createTemperature();
		JTextField getWindTextField = getURLinfo.createWind();
		
		WeatherButton weatherButtons = new WeatherButton(zipCodeTextField, getTemperatureTextField, getWindTextField, getCityNameTextField, getPressureTextField);
		JButton getWeatherButton = weatherButtons.createGetWeatherButton();
		
		WeatherLabel weatherLabels = new WeatherLabel();
		JLabel zipCodeLabel = weatherLabels.createZipCodeLabel();
		JLabel WindLabel = weatherLabels.createWindLabel();
		JLabel temperatureLabel = weatherLabels.createTemperature();
		JLabel pressureLabel = weatherLabels.createPressureLabel();
		JLabel cityNameLabel = weatherLabels.createCityNameLabel();

		GridBagConstraints constraints = new GridBagConstraints();
		MainWindowComponentsPopulator populator = new MainWindowComponentsPopulator();

		MainWindowComponentSpec zipCodePositionSpec = populator.arrangeComponent(0, 0, constraints, mainWindow,	zipCodeLabel);
		MainWindowComponentSpec zipCodeTextFieldSpec = populator.arrangeComponent(1, 0, constraints, mainWindow, zipCodeTextField);
		MainWindowComponentSpec getWeatherButtonSpec = populator.arrangeComponent(2, 0, constraints, mainWindow, getWeatherButton);
		MainWindowComponentSpec cityNameLabelSpec = populator.arrangeComponent(0, 1, constraints, mainWindow, cityNameLabel);
		MainWindowComponentSpec WindLabelSpec = populator.arrangeComponent(0, 2, constraints, mainWindow, WindLabel);
		MainWindowComponentSpec pressureLabelSpec = populator.arrangeComponent(0, 3, constraints, mainWindow, pressureLabel);
		MainWindowComponentSpec temperatureLabelSpec = populator.arrangeComponent(0, 4, constraints, mainWindow, temperatureLabel);
		MainWindowComponentSpec getCityNameSpec = populator.arrangeComponent(1, 1, constraints, mainWindow , getCityNameTextField);
		MainWindowComponentSpec getWindTextSpec = populator.arrangeComponent(1, 2, constraints, mainWindow, getWindTextField);
		MainWindowComponentSpec getTemperatureTextFieldSpec = populator.arrangeComponent(1, 4, constraints, mainWindow, getTemperatureTextField);
		MainWindowComponentSpec getPressureTextFieldSpec = populator.arrangeComponent(1, 3, constraints, mainWindow, getPressureTextField);
		
		MainWindowComponentsPopulator.setComponentConstraint(zipCodePositionSpec);
		MainWindowComponentsPopulator.setComponentConstraint(zipCodeTextFieldSpec);
		MainWindowComponentsPopulator.setComponentConstraint(getWeatherButtonSpec);
		MainWindowComponentsPopulator.setComponentConstraint(pressureLabelSpec);
		MainWindowComponentsPopulator.setComponentConstraint(temperatureLabelSpec);
		MainWindowComponentsPopulator.setComponentConstraint(WindLabelSpec);
		MainWindowComponentsPopulator.setComponentConstraint(cityNameLabelSpec);
		MainWindowComponentsPopulator.setComponentConstraint(getCityNameSpec);
		MainWindowComponentsPopulator.setComponentConstraint(getPressureTextFieldSpec);
		MainWindowComponentsPopulator.setComponentConstraint(getTemperatureTextFieldSpec);
		MainWindowComponentsPopulator.setComponentConstraint(getWindTextSpec);
	}
}