package com.github.mirozek.simpleweather.gui;

import java.awt.GridBagLayout;
import javax.swing.JFrame;

import com.github.mirozek.simpleweather.menu.WeatherJMenuBar;

public class WeatherFrame {

    private JFrame mainWindow;
    WeatherJMenuBar menuBar = new WeatherJMenuBar();

    public JFrame createMainWindow() {

        mainWindow = new JFrame();
        mainWindow.setTitle("Simple Weather Control");

        // center to middle of screen; doesn't work when is few screens;
        mainWindow.setLocationRelativeTo(null);
        mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainWindow.setLayout(new GridBagLayout());
        mainWindow.setResizable(false);
        mainWindow.setVisible(true);
        mainWindow.setSize(450, 200);
        mainWindow.setJMenuBar(menuBar.createMenuBar());
        mainWindow.repaint();

        return mainWindow;
    }

}