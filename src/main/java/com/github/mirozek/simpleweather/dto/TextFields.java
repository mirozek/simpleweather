package com.github.mirozek.simpleweather.dto;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JTextField;

import com.github.mirozek.simpleweather.gui.WeatherText;

public class TextFields {

    private Map<String, JTextField> textFields = new HashMap<>();
    private WeatherText weatherText;

    public TextFields(WeatherText weatherTex) {
        this.weatherText = weatherTex;
    }

    public void initializeTextFields() {
        textFields.put("cityNameTextField", weatherText.createCityName());
        textFields.put("windTextField", weatherText.createWind());
        textFields.put("pressureTextField", weatherText.createPressure());
        textFields.put("temperatureTextField", weatherText.createTemperature());
        textFields.put("zipCodeTextField", weatherText.createZipCodeTextPane());
    }

    public Map<String, JTextField> getTextFields() {
        return textFields;
    }
}
