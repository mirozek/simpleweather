package com.github.hiiok.simpleweather.menu;

import javax.swing.JMenuItem;
import com.github.hiiok.simpleweather.actionListenerLogic.JMenuItemMethod;

public class WeatherJMenuItem {

	public static JMenuItem about, exit;

	public JMenuItem createExitMenu() {
		exit = new JMenuItem("Exit");
		exit.addActionListener(new JMenuItemMethod());
		return exit;
	}

	public JMenuItem createAboutMenu() {
		about = new JMenuItem("About");
		about.addActionListener(new JMenuItemMethod());
		return about;
	}
}