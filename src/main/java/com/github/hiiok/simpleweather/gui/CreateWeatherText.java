package com.github.hiiok.simpleweather.gui;

import javax.swing.JTextField;

public class CreateWeatherText {
	WeatherText getURLinfo = new WeatherText();
	JTextField getCityNameTextField = getURLinfo.createCityName();
	JTextField getPressureTextField = getURLinfo.createPressure();
	JTextField getTemperatureTextField = getURLinfo.createTemperature();
	JTextField getWindTextField = getURLinfo.createWind();
}
