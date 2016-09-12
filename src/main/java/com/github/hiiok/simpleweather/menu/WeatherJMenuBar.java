package com.github.hiiok.simpleweather.menu;

import javax.swing.JMenuBar;

public class WeatherJMenuBar {

	private JMenuBar menuBar;

	public JMenuBar createMenuBar() {
		// add front menu buttons Menu and HelpMenu
		WeatherJMenu weatherjmenucomp = new WeatherJMenu();

		menuBar = new JMenuBar();
		menuBar.add(weatherjmenucomp.createWeatherMenu());
		menuBar.add(weatherjmenucomp.createWeatherHelpMenu());

		return menuBar;

	}
}