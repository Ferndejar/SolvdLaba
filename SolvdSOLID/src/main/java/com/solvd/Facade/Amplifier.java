package com.solvd.Facade;

public class Amplifier {
    void on() { System.out.println("Amplifier is ON"); }
    void setVolume(int level) { System.out.println("Setting volume to " + level); }
    void off() { System.out.println("Amplifier is OFF"); }
}
