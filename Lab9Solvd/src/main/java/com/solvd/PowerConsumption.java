package com.solvd;

public enum PowerConsumption {

    LOW_CONSUMPTION(150),
    MID_CONSUMPTION(350),
    HIGH_CONSUMPTION(600),
    MAX_CONSUMPTION(1000);

    private int power;

    public int getPower() {
        return power;
    }

    PowerConsumption(int power) {
        this.power = power;
    }
}
