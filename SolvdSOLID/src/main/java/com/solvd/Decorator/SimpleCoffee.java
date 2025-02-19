package com.solvd.Decorator;

public class SimpleCoffee implements Coffe{
    @Override
    public String getDescription() {
       return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.00;
    }
}
