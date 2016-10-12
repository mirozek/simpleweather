package com.github.hiiok.simpleweather.dto;

import java.awt.GridBagConstraints;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import com.github.hiiok.simpleweather.gui.MainWindowComponentSpec;
import com.github.hiiok.simpleweather.gui.MainWindowComponentsPopulator;

public class MainWindowComponentDetails {

	private Map<String, MainWindowComponentSpec> mainWindowComponentDetails = new HashMap<String, MainWindowComponentSpec>();
	private MainWindowLayout mainWindowLayout;
	
	public MainWindowComponentDetails(MainWindowLayout mainWindowLayout){
		this.mainWindowLayout = mainWindowLayout;
	}
	
	public void initializeComponentsDetail(){
		MainWindowComponentsPopulator populator = mainWindowLayout.getPopulator();
		GridBagConstraints constraints = mainWindowLayout.getConstraints();
		JFrame mainWindow = mainWindowLayout.getMainWindow();
		Map<String, JLabel> labels = mainWindowLayout.getLabels();
		Map<String, JTextField> textFields = mainWindowLayout.getTextFields();
		JButton weatherComponent = mainWindowLayout.getButton();
				
		mainWindowComponentDetails.put("zipCodePositionSpec", populator.arrangeComponent(0, 0,constraints , mainWindow,	labels.get("zipCodeLabel")));
		mainWindowComponentDetails.put("zipCodeTextFieldSpec", populator.arrangeComponent(1, 0, constraints, mainWindow, textFields.get("zipCodeTextField")));
		mainWindowComponentDetails.put("getWeatherButtonSpec", populator.arrangeComponent(2, 0, constraints, mainWindow, weatherComponent));
		mainWindowComponentDetails.put("cityNameLabelSpec", populator.arrangeComponent(0, 1, constraints, mainWindow, labels.get("cityNameLabel")));
		mainWindowComponentDetails.put("windLabelSpec", populator.arrangeComponent(0, 2, constraints, mainWindow, labels.get("windLabel")));
		mainWindowComponentDetails.put("pressureLabelSpec", populator.arrangeComponent(0, 3, constraints, mainWindow, labels.get("pressureLabel")));
		mainWindowComponentDetails.put("temperatureLabelSpec", populator.arrangeComponent(0, 4, constraints, mainWindow, labels.get("temperatureLabel")));
		mainWindowComponentDetails.put("cityNameSpec", populator.arrangeComponent(1, 1, constraints, mainWindow , textFields.get("cityNameTextField")));
		mainWindowComponentDetails.put("windTextSpec", populator.arrangeComponent(1, 2, constraints, mainWindow, textFields.get("windTextField")));
		mainWindowComponentDetails.put("temperatureTextFieldSpec", populator.arrangeComponent(1, 4, constraints, mainWindow, textFields.get("temperatureTextField")));
		mainWindowComponentDetails.put("pressureTextFieldSpec", populator.arrangeComponent(1, 3, constraints, mainWindow, textFields.get("pressureTextField")));
	}
	
	public Map<String, MainWindowComponentSpec> getMainWindowComponentDetails(){
		
		return mainWindowComponentDetails;
	}
}
