package com.solvd.model;

public class Car {

    private String model;

    private String brand;

    public Car()
    {

    };

    public Car(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
