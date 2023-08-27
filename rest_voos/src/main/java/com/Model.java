package com;

public enum Model {
    BOEING_747("Boeing 747"),
    AIRBUS_A380("Airbus A380"),
    LOCKHEED_SR71("Lockheed SR-71 Blackbird"),
    CONCORDE("Concorde"),
    F_16("F-16 Fighting Falcon"),
    SPITFIRE("Supermarine Spitfire"),
    P_51_MUSTANG("North American P-51 Mustang");

    private String nome;

    Model(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}