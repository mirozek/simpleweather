package com.github.mirozek.simpleweather.actionListenerLogic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.github.mirozek.simpleweather.gui.WeatherTextPane;

public class JTextFieldMethod extends WeatherTextPane implements ActionListener {

	public String prasedZipCode;

	public void actionPerformed(ActionEvent e) {
		Object getActEvent = e.getSource();
		if (getActEvent == textZipCode) {
			prasedZipCode = textZipCode.getText();
		}
	}
}
