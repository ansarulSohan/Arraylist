package com.sohan;

public class SingleRoom {
    private Bed bed;
    private Table table;
    private Light light;
    private Fan fan;

    public SingleRoom(Bed bed, Table table, Light light, Fan fan) {
        this.bed = bed;
        this.table = table;
        this.light = light;
        this.fan = fan;
    }

    public void turnLightOn() {
        light.turnOnLight();
    }

    public void turnLightOff() {
        light.turnOffLight();
    }

    public void turnFanOn() {
        fan.turnOnFan();
    }

    public void turnFanOff() {
        fan.turnOffFan();
    }


}
