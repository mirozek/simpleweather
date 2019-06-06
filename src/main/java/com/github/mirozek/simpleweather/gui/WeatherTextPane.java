package com.github.mirozek.simpleweather.gui;

import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import com.github.mirozek.simpleweather.actionListenerLogic.JTextFieldMethod;

public class WeatherTextPane {
    protected JFormattedTextField textZipCode;

    public JTextField createZipCodeTextPane() {
        textZipCode = new JFormattedTextField(createFormatter("##-###"));
        textZipCode.setColumns(6);
        textZipCode.setToolTipText("Enter here ZipCode");
        textZipCode.addActionListener(new JTextFieldMethod());
        textZipCode.setHorizontalAlignment(0);
        return textZipCode;
    }

    protected MaskFormatter createFormatter(String s) {
        MaskFormatter formatter = null;
        try {
            formatter = new MaskFormatter(s);
        } catch (java.text.ParseException exc) {
            System.err.println("formatter is bad: " + exc.getMessage());
            System.exit(-1);
        }
        return formatter;
    }
}
