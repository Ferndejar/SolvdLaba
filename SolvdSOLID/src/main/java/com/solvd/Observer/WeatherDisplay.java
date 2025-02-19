package com.solvd.Observer;

public class WeatherDisplay implements Observer {
    private String displayName;

    public WeatherDisplay(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public void update(float temperature) {
        System.out.println(displayName + " updated with temperature: " + temperature);
    }
}
