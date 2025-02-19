package com.solvd.Decorator;

public class WhippedCream extends CoffeeDecorator{
    public WhippedCream(Coffe coffe) {
        super(coffe);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Whipped Cream";
    }

    @Override
    public double getCost() {
        return decoratedCoffee.getCost() + 2.00;
    }
}
