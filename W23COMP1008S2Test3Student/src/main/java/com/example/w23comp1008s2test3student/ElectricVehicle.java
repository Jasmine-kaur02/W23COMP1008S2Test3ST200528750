package com.example.w23comp1008s2test3student;

public class ElectricVehicle {

    private int range;

    public ElectricVehicle(String make, String model, double price,int year, int range) {
        this.range=range;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }
}
