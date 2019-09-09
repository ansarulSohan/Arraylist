package com.sohan;

public class Table {
    private String manufacturer;
    private Dimensions tableDimension;
    private String material;

    public Table(String manufacturer, Dimensions tableDimension, String material) {
        this.manufacturer = manufacturer;
        this.tableDimension = tableDimension;
        this.material = material;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public Dimensions getTableDimension() {
        return tableDimension;
    }

    public String getMaterial() {
        return material;
    }
}
