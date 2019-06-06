package com.github.mirozek.simpleweather.networking;

public interface InterfaceWeatherForecastURL {
    static String createWeatherForecastUrl(String zipCode) {
        return "http://api.openweathermap.org/data/2.5/weather?zip=" + zipCode
                + ",pl&appid=4b26fe53e5ee3e594d2309d461bb7ce3";
    }
}
