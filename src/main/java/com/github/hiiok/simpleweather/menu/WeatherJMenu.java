package com.github.hiiok.simpleweather.menu;

import javax.swing.JMenu;

import com.github.hiiok.simpleweather.actionListenerLogic.JMenuItemMethod;

public class WeatherJMenu {

	private JMenu menu, help;

	WeatherJMenuItem weatherJMenuItem = new WeatherJMenuItem();

	public JMenu createWeatherMenu() {
		// add weatherJMenuItems save and exit

		menu = new JMenu("Menu");
		menu.add(weatherJMenuItem.createSaveMenu());
		menu.addSeparator();
		menu.add(weatherJMenuItem.createExitMenu());

		return menu;
	}

	public JMenu createWeatherHelpMenu() {
		// add weatherJMenuItems about

		help = new JMenu("Help");
		help.add(weatherJMenuItem.createAboutMenu());
		help.addActionListener(new JMenuItemMethod());

		return help;
	}
}