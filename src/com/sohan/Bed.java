package com.sohan;

public class Bed {
    private Dimensions bedDimensions;
    private String manufacturer;
    private String material;

    public Bed(Dimensions bedDimensions, String manufacturer, String material) {
        this.bedDimensions = bedDimensions;
        this.manufacturer = manufacturer;
        this.material = material;
    }

    public Dimensions getBedDimensions() {
        return bedDimensions;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getMaterial() {
        return material;
    }
}
