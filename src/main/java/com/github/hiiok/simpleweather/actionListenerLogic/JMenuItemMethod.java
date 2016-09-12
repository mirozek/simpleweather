package com.github.hiiok.simpleweather.actionListenerLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import com.github.hiiok.simpleweather.menu.WeatherJMenuItem;

public class JMenuItemMethod extends WeatherJMenuItem implements ActionListener {

	public void actionPerformed(ActionEvent e) {
		Object getActEvent = e.getSource();

		if (getActEvent == exit) {
			System.exit(0);
		}

		if (getActEvent == about) {
			JOptionPane.showMessageDialog(null, "That is simple weather app.");

		}

		if (getActEvent == refresh) {
			
		}

	}

}
