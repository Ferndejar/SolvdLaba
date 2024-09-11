package com.solvd;

public enum Consoles {

    PLAYSTATION ("Playstation", "PS5",2022, PowerConsumption.HIGH_CONSUMPTION),
    XBOX("XBOX","XBOX S",2021, PowerConsumption.MID_CONSUMPTION),
    NINTENDO("Nintendo","Switch",2019, PowerConsumption.LOW_CONSUMPTION),
    STEAM("Steam","Deck",2023,PowerConsumption.MAX_CONSUMPTION);


    private String name;
    private String model;

    private int yearOFProduction;

    private PowerConsumption powerConsumption;

    Consoles(String name, String model, int yearOFProduction, PowerConsumption powerConsumption) {
        this.name = name;
        this.model = model;
        this.yearOFProduction = yearOFProduction;
        this.powerConsumption = powerConsumption;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public PowerConsumption getPowerConsumption() {
        return powerConsumption;
    }

    public int getYearOFProduction() {
        return yearOFProduction;
    }
}
