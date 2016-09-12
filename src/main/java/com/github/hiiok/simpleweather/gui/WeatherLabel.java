package com.github.hiiok.simpleweather.gui;

import javax.swing.JLabel;

public class WeatherLabel {

	private JLabel signZipCode, Wind, temperature, PressureLabel, cityName;

	public JLabel createZipCodeLabel() {
		signZipCode = new JLabel("Enter your zip code:");
		return signZipCode;
	}
	
	public JLabel createCityNameLabel() {
		cityName = new JLabel("City Name:");
		return cityName;
	}
	
	
	public JLabel createPressureLabel(){
		PressureLabel = new JLabel("Pressure: ");
		return PressureLabel;
	}

	public JLabel createWindLabel() {
		Wind = new JLabel("Wind:");
		Wind.setVisible(true);
		return Wind;
	}
	

	public JLabel createTemperature() {
		temperature = new JLabel("Temperature:");
		temperature.setVisible(true);
		return temperature;
	}
}
