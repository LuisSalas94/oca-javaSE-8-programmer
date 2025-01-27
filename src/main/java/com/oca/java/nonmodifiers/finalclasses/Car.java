package com.oca.java.nonmodifiers.finalclasses;

public class Car extends Vehicle {
    public Car() {
        super("car");
    }

    @Override
    public void move() {
        System.out.println(getType() + " is driving");
    }
}
