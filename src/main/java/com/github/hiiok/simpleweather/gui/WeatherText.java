package com.github.hiiok.simpleweather.gui;

import com.github.hiiok.simpleweather.actionListenerLogic.JTextFieldMethod;

import javax.swing.*;

public class WeatherText extends JTextFieldMethod {
    private JTextField getCity, getWind, getPressure, getTemp;

    public JTextField createCityName() {
        getCity = new JTextField();
        getCity.setColumns(6);
        getCity.setEditable(false);
        return getCity;
    }

    public JTextField createWind() {
        getWind = new JTextField();
        getWind.setColumns(6);
        getWind.setEditable(false);
        return getWind;
    }

    public JTextField createPressure() {
        getPressure = new JTextField();
        getPressure.setColumns(6);
        getPressure.setEditable(false);
        return getPressure;
    }

    public JTextField createTemperature() {
        getTemp = new JTextField();
        getTemp.setColumns(6);
        getTemp.setEditable(false);
        return getTemp;
    }
}
