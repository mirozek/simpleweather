package com.github.mirozek.simpleweather.gui;

import java.awt.event.ActionEvent;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JTextField;

import com.github.mirozek.simpleweather.dto.WeatherResult;
import com.github.mirozek.simpleweather.networking.ConnectionLogic;

public class WeatherComponent {

    public JButton weatherComponent;
    public static Map<String, JTextField> textFields;

    public WeatherComponent(Map<String, JTextField> textFields) {
        weatherComponent = new JButton("Get Weather");
        this.textFields = textFields;
    }

    public JButton createWeatherComponent() {
        weatherComponent.addActionListener(this::createListener);

        return weatherComponent;
    }

    private void createListener(ActionEvent event) {
        String zipCode = textFields.get("zipCodeTextField").getText();
        if (!zipCode.matches("\\d{2,2}-\\d{3,3}")) {
            return;
        }
        // get value of temperature;
        ConnectionLogic conn = new ConnectionLogic(zipCode);
        if (conn == null) {
            return;
        }
        WeatherResult weatherResult = conn.getWeatherResult();

        String getTemp = weatherResult.getTemp();
        textFields.get("temperatureTextField").setText(getTemp);

        // get value of wind:speed;
        String getWind = weatherResult.getWindSpeed();
        textFields.get("windTextField").setText(getWind);

        // get value of city name
        String getCityName = weatherResult.getCityName();
        textFields.get("cityNameTextField").setText(getCityName);

        // get value of pressure
        String getPressure = weatherResult.getPressure();
        textFields.get("pressureTextField").setText(getPressure);
    }

    public Map<String, JTextField> getTextFields() {
        return textFields;
    }
}
