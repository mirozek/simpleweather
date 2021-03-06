package com.github.mirozek.simpleweather.menu;

import javax.swing.JMenu;

import com.github.mirozek.simpleweather.actionListenerLogic.JMenuItemMethod;

public class WeatherJMenu {

	private JMenu menu, help;

	WeatherJMenuItem weatherJMenuItem = new WeatherJMenuItem();

	public JMenu createWeatherMenu() {
		menu = new JMenu("Menu");
		menu.add(weatherJMenuItem.createSaveMenu());
		menu.add(weatherJMenuItem.createExitMenu());
		return menu;
	}

	public JMenu createWeatherHelpMenu() {
		help = new JMenu("Help");
		help.add(weatherJMenuItem.createAboutMenu());
		help.addActionListener(new JMenuItemMethod());
		return help;
	}
}