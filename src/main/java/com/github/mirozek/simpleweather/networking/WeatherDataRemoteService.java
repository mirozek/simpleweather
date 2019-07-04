package com.github.mirozek.simpleweather.networking;

import com.github.mirozek.simpleweather.dto.WeatherResult;
import org.json.JSONObject;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.URL;

public class WeatherDataRemoteService implements InterfaceWeatherForecastURL {
    private JSONObject jsonObject;
    private final double KELWIN = 273.15;

    public WeatherDataRemoteService(String zipCode) {
        String url = InterfaceWeatherForecastURL.createWeatherForecastUrl(zipCode);
        try {
            String result = readUrl(url);
            if (result == null) {
                return;
            }
            jsonObject = new JSONObject(result);

        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } catch (RuntimeException e) {
            e.printStackTrace();
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
        final double temp = jsonObject.getJSONObject("main").getDouble("temp");
        return String.format("%.1f C", temp - KELWIN);
    }

    private String getPressure() {
        final double pressure = jsonObject.getJSONObject("main").getDouble("pressure");
        return String.format("%.0f hPa", pressure);
    }

    private String getCityName() {
        return jsonObject.getString("name");
    }

    private String getWindSpeed() {
        final double speed = jsonObject.getJSONObject("wind").getDouble("speed");
        return String.format("%.1f m/s", speed);
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
            JOptionPane.showMessageDialog(null, "Wrong ZipCode!");
        } finally {
            if (reader != null)
                reader.close();
        }
        return null;
    }
}