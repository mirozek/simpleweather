package com.github.mirozek.simpleweather.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "weather")
public class Weather {
    private long id;

    @Column(name = "city_name", nullable = false)
    private String cityName;

    @Column(name = "temperature", nullable = false)
    private String temperature;

    @Column(name = "zip_code", nullable = false)
    private String zipCode;

    @Column(name = "wind", nullable = false)
    private String wind;

    @Column(name = "pressure", nullable = false)
    private String pressure;

    public Weather() {
    }

    public Weather(long id, String cityName, String temperature, String zipCode, String wind, String pressure) {
        this.id = id;
        this.cityName = cityName;
        this.temperature = temperature;
        this.zipCode = zipCode;
        this.wind = wind;
        this.pressure = pressure;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }


    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }


    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }


    public String getPressure() {
        return pressure;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    @Override
    public String toString() {
        return "City name " + cityName + ", Zip Code " + zipCode + ", temperature: " + temperature + ", wind: " + wind + ", pressure: " + pressure;
    }

}
