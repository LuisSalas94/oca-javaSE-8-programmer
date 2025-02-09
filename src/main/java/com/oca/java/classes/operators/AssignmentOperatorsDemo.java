package com.oca.java.classes.operators;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        // Simple assignment
        int a = 10;
        int b = 5;

        // shorthand assignment operators
        // addition
        // a = a + b
        //a += b;
//        System.out.println("a-> " + a);
        // subtraction
        //a -= b;
//        System.out.println("a-> " + a);
        // multiplication
        //a *= b;
//        System.out.println("a-> " + a);

        // division
        //a /= b;
//        System.out.println("a-> " + a);

        // modulus
        a %= b;
//        System.out.println("a-> " + a);

        // Valid Assignments
        double myDouble = 10.2;
        int myInt = 10;
        float myFloat = 10.5f;
//        System.out.println("myDouble: " + myDouble);
//        System.out.println("myInt: " + myInt);
//        System.out.println("myFloat: " + myFloat);

        // Invalid Assignments
        //double myDouble2 = true;
        //boolean myInt2 = 'c';

        // Multiple Assignments
        int x = 7, y = 10, z = 8;
        System.out.println("Before");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);

        System.out.println("\nAfter");
        x = y = z; // z = 8, y = 8, x = 8
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);



    }
}
