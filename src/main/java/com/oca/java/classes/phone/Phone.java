package com.oca.java.classes.phone;

public class Phone {
    // instance variables
    String model;
    String company;
    double weight;

    // constructor
    public Phone(String model) {
        this.model = model;
    }

    // methods
    void makeCall(String number) {
        System.out.println("Calling : " + number);
    }

    void receiveCall() {
        System.out.println("Receiving call");
    }

    public static void main(String[] args) {
        Phone apple = new Phone("Apple");
        Phone samsung = new Phone("Samsung");


    }
}
