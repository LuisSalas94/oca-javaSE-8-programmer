package com.oca.java.wrapper;

public class RetrievingValuesDemo {
    public static void main(String[] args) {
        //* Boolean Wrapper Class
        //* booleanValue(): Returns the value of this Boolean object as a boolean primitive.
        Boolean boolObj = true;
        boolean boolValue = boolObj.booleanValue();
        //System.out.println("boolValue: " + boolValue);

        //* Character Wrapper Class
        //* charValue(): Returns the value of this Character object.
        Character charObj = 'A';
        char charValue = charObj.charValue();
        //System.out.println("charValue: " + charValue);

        //* Numeric Wrapper Classes
        Byte byteObj = 10;
        Short shortObj = 100;
        Integer integerObj = 1000;
        Long longObj = 1500L;
        Float floatObj = 150.00f;
        Double doubleObj = 199.00;

        byte byteValue = byteObj.byteValue();
        short shortValue = shortObj.shortValue();
        int intValue = integerObj.intValue();
        long longValue = longObj.longValue();
        float floatValue = floatObj.floatValue();
        double doubleValue = doubleObj.doubleValue();

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Integer value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);




    }
}
