package com.oca.java.classes.operators;

public class WideningAndArithmetic {
    public static void main(String[] args) {
        //  ASCII Arithmetic with 'char'
        char char1 = 'a'; // 97
//        System.out.println("Character a: " + char1);
//        System.out.println("Character + Character: " + (char1 + char1)); // 194
//        System.out.println("Character - Character: " + (char1 - char1)); // 0

        /* Java automatically widens byte, short, and char to int in arithmetic operations.
        If a long value is present, all values (including int) are widened to long.
        If float or double is involved, all values are widened to double.
        */
        byte byteValue = 10;
        short shortValue = 20;
        char charValue = 'A'; // 65
        int resultInt = byteValue + shortValue + charValue;
        System.out.println("byteValue + shortValue+ charValue: " + resultInt);

        long resultLong = byteValue + shortValue + 100L;
        System.out.println("byteValue + shortValue + 100L: " + resultLong);






    }
}
