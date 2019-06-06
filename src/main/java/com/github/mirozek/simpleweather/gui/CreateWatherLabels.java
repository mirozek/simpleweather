package com.github.mirozek.simpleweather.gui;

import javax.swing.JLabel;

public class CreateWatherLabels {

	public CreateWeatherLabelsSpec arrangeComponent(JLabel zipCodeLabel, JLabel windLabel, JLabel temperatureLabel,
			JLabel pressureLabel, JLabel cityNameLabel) {

		CreateWeatherLabelsSpec createWeatherLabelsSpec = new CreateWeatherLabelsSpec();
		createWeatherLabelsSpec.setZipCodeLabel(zipCodeLabel);
		createWeatherLabelsSpec.setWindLabel(windLabel);
		createWeatherLabelsSpec.setTemperatureLabel(temperatureLabel);
		createWeatherLabelsSpec.setPressureLabel(pressureLabel);
		createWeatherLabelsSpec.setCityNameLabel(cityNameLabel);

		return createWeatherLabelsSpec;
	}
}
