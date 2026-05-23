package com.pluralsight.creature;

import com.pluralsight.Credits;

public enum Scale {
    CLASS_I,
    CLASS_II,
    CLASS_III,
    CLASS_IV;

    public Credits getBasePrice(){
       switch (this){
           case CLASS_I -> {
               return new Credits(800.00);
           }
           case CLASS_II -> {
               return new Credits(12000.00);
           }
           case CLASS_III -> {
               return new Credits(100000.00);
           }
           case CLASS_IV -> {
               return new Credits(150000.00);
           }
           default -> throw new IllegalStateException("Unknown Scale Class");
       }
    }
}

