package com.pluralsight.order;

import com.pluralsight.Credits;

public class Maintenance {

    public Credits getPrice(){
         return new Credits(150.00);

    }

    @Override
    public String toString() {
        return "Standard Maintenance " + " " + getPrice();
    }
}
