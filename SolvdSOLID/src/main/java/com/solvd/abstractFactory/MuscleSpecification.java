package com.solvd.abstractFactory;

public class MuscleSpecification implements CarSpecification
{
    @Override
    public void display() {
        System.out.println("Muscle America Car Specification: Safety features compliant with local regulations. With lots of horse power");

    }
}
