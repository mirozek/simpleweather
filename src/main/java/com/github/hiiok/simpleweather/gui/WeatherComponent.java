package com.github.hiiok.simpleweather.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JTextField;
import org.json.JSONException;
import com.github.hiiok.simpleweather.networking.ConnectionLogic;

public class WeatherComponent {

	public JButton weatherComponent;
	Map<String, JTextField> textFields;

	public WeatherComponent(Map<String, JTextField> textFields) {
		weatherComponent = new JButton("Get Weather");
		this.textFields = textFields;
	}

	public JButton createWeatherComponent() {

		weatherComponent.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {

				String zipCode = textFields.get("zipCodeTextField").getText();

				try {
					// get value of temperature;
					String getTemp = ConnectionLogic.getTempFromZipCode(zipCode);
					textFields.get("temperatureTextField").setText(getTemp);

					// get value of wind:speed;
					String getWind = ConnectionLogic.getWindFromZipCode(zipCode);
					textFields.get("windTextField").setText(getWind);

					// get value of city name
					String getCityName = ConnectionLogic.getCityNameFromZipCode(zipCode);
					textFields.get("cityNameTextField").setText(getCityName);

					// get value of pressure
					String getPressure = ConnectionLogic.getPressureFromZipCode(zipCode);
					textFields.get("pressureTextField").setText(getPressure);
				} catch (JSONException e1) {
					e1.printStackTrace();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});

		return weatherComponent;
	}
}
