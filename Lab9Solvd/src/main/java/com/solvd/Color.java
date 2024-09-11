package com.solvd;

public enum Color {

    RED("RED",Consoles.NINTENDO),
    BLUE("BLUE",Consoles.PLAYSTATION),
    GREEN("GREEN",Consoles.XBOX);

    private String name;
    private Consoles consoles;

    Color(String name, Consoles consoles) {
        this.name = name;
        this.consoles = consoles;
    }

    public String getName() {
        return name;
    }

    public Consoles getConsoles() {
        return consoles;
    }
}
