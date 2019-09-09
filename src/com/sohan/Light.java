package com.sohan;

public class Light {
    private String manufacturer;
    private String powerConsumption;
    private String tech;
    private boolean isTurnedOff = true;

    public Light(String manufacturer, String powerConsumption, String tech) {
        this.manufacturer = manufacturer;
        this.powerConsumption = powerConsumption;
        this.tech = tech;
    }

    public void turnOnLight() {
        if (isTurnedOff) {
            System.out.println("Light turned on.");
            isTurnedOff = false;
        }
        else {
            System.out.println("Light already turned on.");
        }
    }


    public void turnOffLight() {
        if(isTurnedOff)
            System.out.println("Light already turned off.");

        else {
            System.out.println("Light turned off.");
            isTurnedOff = true;
        }
    }
}
