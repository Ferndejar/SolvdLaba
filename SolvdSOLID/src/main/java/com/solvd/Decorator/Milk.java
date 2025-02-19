package com.solvd.Decorator;

public class Milk extends CoffeeDecorator {

    public Milk(Coffe coffe)  {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 1.50;
    }
}
