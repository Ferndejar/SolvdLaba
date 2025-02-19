package com.solvd.abstractFactory;

public class ExoticCarFactory implements CarFactory{

    @Override
    public Car createCar() {
        return new Lamborghini();
    }

    @Override
    public CarSpecification createSpecification() {
        return new ExoticSpecification();
    }
}
