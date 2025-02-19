package com.solvd.Decorator;

public class DecoratorClient {
    public static void main(String[] args) {
        Coffe coffe = new SimpleCoffee();
        System.out.println(coffe.getDescription() + " -> $" + coffe.getCost());

        // Coffee with Milk
        coffe = new Milk(coffe);
        System.out.println(coffe.getDescription() + " -> $" + coffe.getCost());

        // Coffee with Milk and Sugar
        coffe = new Sugar(coffe);
        System.out.println(coffe.getDescription() + " -> $" + coffe.getCost());

        // Coffee with Milk, Sugar, and Whipped Cream
        coffe = new WhippedCream(coffe);
        System.out.println(coffe.getDescription() + " -> $" + coffe.getCost());
    }
}
