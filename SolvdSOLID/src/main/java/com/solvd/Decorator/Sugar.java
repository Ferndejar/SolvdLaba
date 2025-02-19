package com.solvd.Decorator;

public class Sugar extends CoffeeDecorator {
    public Sugar(Coffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 0.50;
    }
}
