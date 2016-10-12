package com.github.hiiok.simpleweather.gui;

import javax.swing.JLabel;

public class CreateWatherLabels {
	// posiadamy tutaj b³ad odczytu nie wiem jak zmienic 

	public static void setComponentWeatherLabel(CreateWeatherLabelsSpec createWeatherLabelsSpec) {
		JLabel zipCodeLabel = createWeatherLabelsSpec.getZipCodeLabel();
		JLabel windLabel = createWeatherLabelsSpec.getWindLabel();
		JLabel temperatureLabel = createWeatherLabelsSpec.getTemperatureLabel();
		JLabel pressureLabel = createWeatherLabelsSpec.getPressureLabel();
		JLabel cityNameLabel = createWeatherLabelsSpec.getCityNameLabel();

	}

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
