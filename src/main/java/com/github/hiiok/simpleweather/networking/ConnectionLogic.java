package com.github.hiiok.simpleweather.networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONString;
import org.json.JSONStringer;

import com.github.hiiok.simpleweather.actionListenerLogic.JTextFieldMethod;

public class ConnectionLogic extends JTextFieldMethod {

	private static Double temperature, wind, pressure;
	// private static int pressure;
	private static String cityName;

	// geting from json temp
	public static String getTempFromZipCode(String zipCode) throws IOException, JSONException {
		String url = createWeatherForecastUrl(zipCode);
		String json;

		try {
			json = readUrl(url);
			JSONObject obj = new JSONObject(json);
			temperature = obj.getJSONObject("main").getDouble("temp");
			double converTemp = (double) temperature - 273.15;
			String valueTemp = String.format("%.2f", converTemp);
			return valueTemp + " *C";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// get pressure
	public static String getPressureFromZipCode(String zipCode) throws IOException, JSONException {
		String url = createWeatherForecastUrl(zipCode);
		String json;

		try {
			json = readUrl(url);
			JSONObject obj = new JSONObject(json);
			pressure = obj.getJSONObject("main").getDouble("pressure");
			String hPa = String.valueOf(pressure);
			return hPa + " hPa";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// geting city name
	public static String getCityNameFromZipCode(String zipCode) throws IOException, JSONException {

		String url = createWeatherForecastUrl(zipCode);
		final String json;

		try {
			json = readUrl(url);

			JSONObject obj = new JSONObject(json);
			cityName = obj.getString("name");

			String valueCityName = String.valueOf(cityName);
			return valueCityName;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	// geting wind speed
	public static String getWindFromZipCode(String zipCode) throws IOException, JSONException {

		String url = createWeatherForecastUrl(zipCode);
		String json;
		try {
			json = readUrl(url);
			JSONObject obj = new JSONObject(json);
			wind = obj.getJSONObject("wind").getDouble("speed");
			String valueWind = String.valueOf(wind);
			return valueWind + " m/s";

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	// Double asds = Double.valueOf(temperature);
	// Double celsius = ((asds - 32)*5)/9;
	// String prasedCel = celsius.toString();
	// getTemperatureTextField.setText(prasedCel);

	public static String createWeatherForecastUrl(String zipCode) {
		return "http://api.openweathermap.org/data/2.5/weather?zip=" + zipCode
				+ ",pl&appid=4b26fe53e5ee3e594d2309d461bb7ce3";
	}

	private static String readUrl(String urlString) throws Exception {
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
		} finally {
			if (reader != null)
				reader.close();
		}

	}
}