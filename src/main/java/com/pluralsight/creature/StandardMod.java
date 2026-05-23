package com.pluralsight.creature;

public class StandardMod {

    private String name;

    //methods

    @Override
    public String toString() {
        return "StandardMod: " + name ;
    }

    //constructor
    public StandardMod(String name) {
        this.name = name;
    }

    //getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
