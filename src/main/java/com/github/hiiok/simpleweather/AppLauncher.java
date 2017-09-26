package com.github.hiiok.simpleweather;

import javax.swing.SwingUtilities;

public class AppLauncher {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(GuiLauncher::new);
	}
}