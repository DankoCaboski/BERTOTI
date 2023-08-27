package com;

import java.util.Random;

public class Voo {
    private Aircraft aircraft_model;
    private String departure = "";
    private String destination = "";

    public Aircraft getaircraft_model() {
        return aircraft_model;
    }

    public void setaircraft_model(Aircraft aircraft_model) {
        this.aircraft_model = aircraft_model;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Voo(){

        LocalEnum[] local = LocalEnum.values();
        Random random = new Random();
        this.departure = local[random.nextInt(local.length)].name();
        this.destination = local[random.nextInt(local.length)].name();
        do {
            this.destination = local[random.nextInt(local.length)].name();
        } while (departure.equals(destination));

        this.aircraft_model = new Aircraft();
        
    }

    
}
