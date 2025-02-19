package com.solvd.abstractFactory;

public class Ford implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Ford Mustang car.");
    }
}
