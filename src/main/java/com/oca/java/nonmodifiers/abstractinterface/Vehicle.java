package com.oca.java.nonmodifiers.abstractinterface;

public class Vehicle implements Movable, Stoppable {

    @Override
    public void move() {
        System.out.println("Vehicle is moving");
    }

    @Override
    public void stop() {
        System.out.println("Vehicle has stopped");
    }
}
