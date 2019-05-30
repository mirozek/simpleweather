package com.github.hiiok.simpleweather.networking;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.URL;

import com.github.hiiok.simpleweather.dto.WeatherResult;
import org.json.JSONObject;

import javax.swing.JOptionPane;

public class ConnectionLogic {
    private JSONObject jsonObject;

    public ConnectionLogic(String zipCode) {
        String url = createWeatherForecastUrl(zipCode);
        try {
            String result = readUrl(url);
            if (result == null) {
                return;
            }
            jsonObject = new JSONObject(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public WeatherResult getWeatherResult() {
        WeatherResult weatherResult = new WeatherResult();
        weatherResult.setCityName(getCityName());
        weatherResult.setPressure(getPressure());
        weatherResult.setTemp(getTemp());
        weatherResult.setWindSpeed(getWindSpeed());
        return weatherResult;
    }

    private String getTemp() {
        double temp = jsonObject.getJSONObject("main").getDouble("temp");
        return String.format("%.1f C", temp - 237.15);
    }

    private String getPressure() {
        double pressure = jsonObject.getJSONObject("main").getDouble("pressure");
        return String.format("%.0f hPa", pressure);
    }

    private String getCityName() {
        return jsonObject.getString("name");
    }

    private String getWindSpeed() {
        double speed = jsonObject.getJSONObject("wind").getDouble("speed");
        return String.format("%.1f m/s", speed);
    }


    private static String createWeatherForecastUrl(String zipCode) {
        return "http://api.openweathermap.org/data/2.5/weather?zip=" + zipCode
                + ",pl&appid=4b26fe53e5ee3e594d2309d461bb7ce3";
    }

    private static synchronized String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];

            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);
            return buffer.toString();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "ZipCode");
        } finally {
            if (reader != null)
                reader.close();
        }
        return null;
    }
}