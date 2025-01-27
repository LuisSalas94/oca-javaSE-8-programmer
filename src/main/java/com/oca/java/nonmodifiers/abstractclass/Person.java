package com.oca.java.nonmodifiers.abstractclass;

abstract class Person {
    private String name;

    public void displayName() {
        System.out.println("Name: " + name);
    }

    public abstract void role();
}
