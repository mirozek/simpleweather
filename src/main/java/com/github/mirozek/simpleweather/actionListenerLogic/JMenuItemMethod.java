package com.github.mirozek.simpleweather.actionListenerLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.*;

import com.github.mirozek.simpleweather.gui.WeatherComponent;
import com.github.mirozek.simpleweather.menu.WeatherJMenuItem;
import com.github.mirozek.simpleweather.model.Weather;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.TransactionException;
import org.hibernate.cfg.Configuration;

public class JMenuItemMethod extends WeatherJMenuItem implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		Object getActEvent = e.getSource();

		if (getActEvent == exit) {
			System.exit(0);
		}

		if (getActEvent == about) {
			JOptionPane.showMessageDialog(null, "That is simple weather app.");

		}

		if (getActEvent == save) {
			Configuration configuration = new Configuration();
			configuration.addResource("hibernate.cfg.xml");
			configuration.configure();
			SessionFactory sessionFactory = configuration.buildSessionFactory();

			Transaction transaction = null;
			try (Session session = sessionFactory.openSession()) {
				transaction = session.beginTransaction();
				Map<String, JTextField> textFields = WeatherComponent.textFields;
				JTextField zipCodeTextField = textFields.get("zipCodeTextField");
				JTextField temperatureTextField = textFields.get("temperatureTextField");
				JTextField windTextField = textFields.get("windTextField");
				JTextField cityNameTextField = textFields.get("cityNameTextField");
				JTextField pressureTextField = textFields.get("pressureTextField");

				String zipCode = zipCodeTextField.getText();
				String temperature = temperatureTextField.getText();
				String wind = windTextField.getText();
				String cityName = cityNameTextField.getText();
				String pressure = pressureTextField.getText();

				Weather weather = new Weather();
				weather.setCityName(cityName);
				weather.setZipCode(zipCode);
				weather.setTemperature(temperature);
				weather.setWind(wind);
				weather.setPressure(pressure);

				session.save(weather);

				transaction.commit();
			} catch (TransactionException exception) {
				if (transaction != null) {
					transaction.rollback();
				}

				exception.printStackTrace();
			}
		}
	}

}
