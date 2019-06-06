package com.github.mirozek.simpleweather;

import javax.swing.SwingUtilities;

public class AppLauncher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(GuiLauncher::new);
	}
}