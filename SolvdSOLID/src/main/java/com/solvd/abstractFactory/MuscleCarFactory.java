package com.solvd.abstractFactory;

public class MuscleCarFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public CarSpecification createSpecification() {
        return new MuscleSpecification();
    }
}
