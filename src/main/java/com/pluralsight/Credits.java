package com.pluralsight;

public class Credits {

    private double amount;

    //methods
    public Credits add (Credits cost){
        return new Credits(this.amount + cost.amount);
    }

    @Override
    public String toString() {
        return String.format("⏣%,.2f", amount) + " " + "CR";
    }

    //constructor
    public Credits(double amount) {
        this.amount = amount;
    }

    //getter/setter

    public double getAmount() {
        return amount;
    }
}
