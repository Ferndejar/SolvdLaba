package com.solvd.Decorator;

public abstract class CoffeeDecorator implements Coffe{

    protected Coffe decoratedCoffee;

    public CoffeeDecorator(Coffe coffe) {
        this.decoratedCoffee = coffe;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost();
    }
}
