package com.github.hiiok.simpleweather;

import javax.swing.SwingUtilities;

public class Exc {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				GuiLauncher simbod = new GuiLauncher();
			}
		});
	}
}