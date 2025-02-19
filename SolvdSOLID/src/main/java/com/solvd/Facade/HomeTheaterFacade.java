package com.solvd.Facade;

public class HomeTheaterFacade {
    private Amplifier amp;
    private DVDPlayer dvd;
    private Projector projector;
    private Lights lights;

    public HomeTheaterFacade(Amplifier amp, DVDPlayer dvd, Projector projector, Lights lights) {
        this.amp = amp;
        this.dvd = dvd;
        this.projector = projector;
        this.lights = lights;
    }


    public void watchMovie(String movie) {
        System.out.println("\n--- Get ready to watch a movie ---");
        lights.dim(30);
        projector.on();
        projector.setInput("DVD");
        amp.on();
        amp.setVolume(10);
        dvd.on();
        dvd.play(movie);
    }


    public void endMovie() {
        System.out.println("\n--- Shutting down the home theater ---");
        dvd.off();
        amp.off();
        projector.off();
        lights.on();
    }
}
