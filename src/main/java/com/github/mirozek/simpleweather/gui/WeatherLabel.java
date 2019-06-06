package com.github.mirozek.simpleweather.gui;

import javax.swing.JLabel;

public class WeatherLabel {

    private JLabel signZipCode, wind, temperature, pressureLabel, cityName;

    public JLabel createZipCodeLabel() {
        signZipCode = new JLabel("Enter your zip code:");
        return signZipCode;
    }

    public JLabel createCityNameLabel() {
        cityName = new JLabel("City Name:");
        return cityName;
    }

    public JLabel createPressureLabel() {
        pressureLabel = new JLabel("Pressure: ");
        return pressureLabel;
    }

    public JLabel createWindLabel() {
        wind = new JLabel("Wind:");
        wind.setVisible(true);
        return wind;
    }

    public JLabel createTemperature() {
        temperature = new JLabel("Temperature:");
        temperature.setVisible(true);
        return temperature;
    }
}
