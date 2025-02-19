package com.solvd.Builder;

public class BuilderClient {
    public static void main(String[] args) {
        Computer com = new Computer.ComputerBuilder("amd ryzen 7 7800x3d","Nvidia RTX 3080Ti","32GB","2TB").setRtxEnabled(true).setRgbEnabled(true).build();

        String string = com.toString();

        System.out.println(string);
    }
}
