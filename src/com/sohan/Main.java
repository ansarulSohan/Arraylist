package com.sohan;

public class Main {

    public static void main(String[] args) {

        Dimensions bedDimensions = new Dimensions(2, 6, 8);
        Bed bed = new Bed(bedDimensions, "Swan", "Wood");

        Dimensions tableDimensions = new Dimensions(3, 3, 5);
        Table table = new Table("Otobi", tableDimensions, "Plywood");

        Light light = new Light("SuperStar", "35w", "Fluorocent");
        Fan fan = new Fan("National", "12w");

        SingleRoom bedRoom = new SingleRoom(bed, table, light, fan);

        bedRoom.turnFanOn();
        bedRoom.turnFanOn();
        bedRoom.turnFanOff();


    }
}
