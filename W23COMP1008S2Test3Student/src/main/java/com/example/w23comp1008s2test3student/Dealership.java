package com.example.w23comp1008s2test3student;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Car> inventory;
    private String dealershipName;

    public Dealership(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public ArrayList<Car> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Car> inventory) {
        this.inventory = inventory;
    }

    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public void addCar(Car car)
    {

    }

    public Car getMostExpensiveCar()
    {
        return null;
    }

    public int getNumCarsInInventory()
    {
        return -1;
    }

    public void removeCar(Car car)
    {

    }

    public double getInventoryValue()
    {
        return -1.0;
    }

}
