    package com;

import java.util.Random;
import java.util.UUID;

public class Aircraft {
            private String model;
            private String aircraft_cod;

            Aircraft(){
                Model[] modelos = Model.values();
                Random random = new Random();
                this.model = modelos[random.nextInt(modelos.length+1)].name();
                this.aircraft_cod = UUID.randomUUID().toString();
            }

            public String getModel(){
                return model;
            }

            public String getAircraft_cod(){
                return aircraft_cod;
            }
    }
