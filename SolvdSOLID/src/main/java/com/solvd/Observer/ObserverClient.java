package com.solvd.Observer;

public class ObserverClient {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();

        WeatherDisplay display1 = new WeatherDisplay("Display 1");
        WeatherDisplay display2 = new WeatherDisplay("Display 2");

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setTemperature(25.5f);
        weatherStation.setTemperature(30.0f);

        weatherStation.removeObserver(display1);
        weatherStation.setTemperature(28.0f);
    }
}
