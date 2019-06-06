package com.github.mirozek.simpleweather.gui;

import javax.swing.JLabel;

public class CreateWeatherLabelsSpec {
    private JLabel zipCodeLabel;
    private JLabel WindLabel;
    private JLabel temperatureLabel;
    private JLabel pressureLabel;
    private JLabel cityNameLabel;

    public JLabel getZipCodeLabel() {
        return zipCodeLabel;
    }

    public void setZipCodeLabel(JLabel zipCodeLabel) {
        this.zipCodeLabel = zipCodeLabel;
    }

    public JLabel getWindLabel() {
        return WindLabel;
    }

    public void setWindLabel(JLabel windLabel) {
        WindLabel = windLabel;
    }

    public JLabel getTemperatureLabel() {
        return temperatureLabel;
    }

    public void setTemperatureLabel(JLabel temperatureLabel) {
        this.temperatureLabel = temperatureLabel;
    }

    public JLabel getPressureLabel() {
        return pressureLabel;
    }

    public void setPressureLabel(JLabel pressureLabel) {
        this.pressureLabel = pressureLabel;
    }

    public JLabel getCityNameLabel() {
        return cityNameLabel;
    }

    public void setCityNameLabel(JLabel cityNameLabel) {
        this.cityNameLabel = cityNameLabel;
    }


}
