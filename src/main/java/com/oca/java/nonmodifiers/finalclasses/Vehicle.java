package com.oca.java.nonmodifiers.finalclasses;

public class Vehicle {
    private String type;

    public Vehicle(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void move() {
        System.out.println(type + " is moving");
    }
}
