package com.pluralsight.creature;

import com.pluralsight.Credits;

public class Adaptation {
    private String name;
    private Credits basePrice;
    private boolean isExtra;

    //methods
    public Credits getPrice(Scale scale){
        switch (scale){
            case CLASS_I -> {
                return new Credits(basePrice.getAmount() * 1);
            }
            case CLASS_II -> {
                return new Credits(basePrice.getAmount() * 2);
            }
            case CLASS_III -> {
                return new Credits(basePrice.getAmount() * 3);
            }
            case CLASS_IV -> {
                return new Credits(basePrice.getAmount() * 4);
            }
            default -> throw new IllegalStateException("Unknown Scale Class");

        }
    }
    //constructor
    public Adaptation(String name, Credits basePrice, boolean isExtra) {
        this.name = name;
        this.basePrice = basePrice;
        this.isExtra = isExtra;
    }

    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Credits getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Credits basePrice) {
        this.basePrice = basePrice;
    }

    public boolean isExtra() {
        return isExtra;
    }

    public void setExtra(boolean extra) {
        isExtra = extra;
    }
}
