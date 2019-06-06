package com.github.mirozek.simpleweather.dto;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JLabel;

import com.github.mirozek.simpleweather.gui.WeatherLabel;

public class Labels {

	private Map<String, JLabel> labels = new HashMap<String, JLabel>();
	private WeatherLabel weatherLabel;

	public Labels(WeatherLabel weatherLabel) {
		this.weatherLabel = weatherLabel;
	}

	private void initializeLabels() {
		labels.put("zipCodeLabel", weatherLabel.createZipCodeLabel());
		labels.put("cityNameLabel", weatherLabel.createCityNameLabel());
		labels.put("pressureLabel", weatherLabel.createPressureLabel());
		labels.put("windLabel", weatherLabel.createWindLabel());
		labels.put("temperatureLabel", weatherLabel.createTemperature());
	}

	public Map<String, JLabel> getLabels() {
		initializeLabels();
		return labels;
	}
}