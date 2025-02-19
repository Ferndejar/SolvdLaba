package com.solvd.abstractFactory;

public class FactoryClient {
    public static void main(String[] args) {
        // Creating cars for North America
        CarFactory muscleCarFactory = new MuscleCarFactory();
        Car muscleCar = muscleCarFactory.createCar();
        CarSpecification muscleCarSpec = muscleCarFactory.createSpecification();

        muscleCar.assemble();
        muscleCarSpec.display();

        // Creating cars for Europe
        CarFactory exoticCarFactory  = new ExoticCarFactory();
        Car exoticCar = exoticCarFactory .createCar();
        CarSpecification exoticCarSpec = exoticCarFactory.createSpecification();

        exoticCar.assemble();
        exoticCarSpec.display();
    }
}
