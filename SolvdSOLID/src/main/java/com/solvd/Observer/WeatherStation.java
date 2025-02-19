package com.solvd.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    private List<Observer> observers;
    private float temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);  // Notify each observer with the latest temperature
        }
    }

    // Method to change the temperature and notify observers
    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();  // Notify all observers when temperature changes
    }
}
