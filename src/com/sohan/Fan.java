package com.sohan;

public class Fan {
    private String manufacturer;
    private String powerConsumption;
    private boolean isTurnedOff = true;

    public Fan(String manufacturer, String powerConsumption) {
        this.manufacturer = manufacturer;
        this.powerConsumption = powerConsumption;
    }

    public void turnOnFan() {
        if (isTurnedOff) {
            System.out.println("Fan turned on.");
            isTurnedOff = false;
        }
        else {
            System.out.println("Fan already turned on.");
        }
    }


    public void turnOffFan() {
        if(isTurnedOff)
            System.out.println("Fan already turned off.");

        else {
            System.out.println("Fan turned off.");
            isTurnedOff = true;
        }
    }
}
