package com.github.hiiok.simpleweather.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JTextField;

import org.json.JSONException;

import com.github.hiiok.simpleweather.networking.ConnectionLogic;

public class WeatherButton {

	public JButton getWeatherButton;
	private JTextField zipCodeTextField;
	private JTextField getTemperatureTextField;
	private JTextField getWindTextField;
	private JTextField getCityNameTextField;
	private JTextField getPressureTextField;

	public WeatherButton(JTextField zipCodeTextField, JTextField getTemperatureTextField, JTextField getWindTextField,
			JTextField getCityNameTextField, JTextField getPressureTextField) {
		getWeatherButton = new JButton("Get Weather");
		this.zipCodeTextField = zipCodeTextField;
		this.getTemperatureTextField = getTemperatureTextField;
		this.getWindTextField = getWindTextField;
		this.getCityNameTextField = getCityNameTextField;
		this.getPressureTextField = getPressureTextField;
	}

	public JButton createGetWeatherButton() {

		getWeatherButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String zipCode = zipCodeTextField.getText();

				try {
					// get walue of temperature;
					String getTemp = ConnectionLogic.getTempFromZipCode(zipCode);
					
					// changing *c to F made error;
					//double prasFahr = Double.parseDouble(getTemp);
					//double toCel = ((prasFahr - 32) * 5) / 9;
					// String prasedCel = String.valueOf(toCel);
					// temp is in Farh
					//String valueTemp = String.valueOf(toCel);
					getTemperatureTextField.setText(getTemp);

					// get walue of wind:speed;
					String getWind = ConnectionLogic.getWindFromZipCode(zipCode);
					getWindTextField.setText(getWind);

					// get walue of city name
					String getCityName = ConnectionLogic.getCityNameFromZipCode(zipCode);
					getCityNameTextField.setText(getCityName);

					// get value of pressure
					String getPressure = ConnectionLogic.getPressureFromZipCode(zipCode);
					getPressureTextField.setText(getPressure);
				} catch (JSONException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}

		});

		return getWeatherButton;
	}
}
