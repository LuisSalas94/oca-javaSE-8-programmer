package com.oca.java.nonmodifiers.finalclasses;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Bike");
        vehicle.move();

        Car car = new Car();
        car.move();
    }
}
