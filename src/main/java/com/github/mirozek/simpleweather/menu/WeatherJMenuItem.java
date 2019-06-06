package com.github.mirozek.simpleweather.menu;

import javax.swing.JMenuItem;

import com.github.mirozek.simpleweather.actionListenerLogic.JMenuItemMethod;

public class WeatherJMenuItem {

	public static JMenuItem about, exit, save;

	public JMenuItem createSaveMenu() {
		save = new JMenuItem("Save");
		save.addActionListener(new JMenuItemMethod());
		return save;
	}

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