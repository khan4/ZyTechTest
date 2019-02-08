package com.example.topway.zytechtest;

public class DataModel {

    private String time;
    private String weather;
    private String sunSet;
    private String temp;

    public DataModel(String time, String weather, String sunSet, String temp) {
        this.time = time;
        this.weather = weather;
        this.sunSet = sunSet;
        this.temp = temp;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getSunSet() {
        return sunSet;
    }

    public void setSunSet(String sunSet) {
        this.sunSet = sunSet;
    }

    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }
}
