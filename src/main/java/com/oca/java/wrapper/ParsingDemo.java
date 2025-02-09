package com.oca.java.wrapper;

public class ParsingDemo {
    public static void main(String[] args) {
        //* Parsing valid string values
        int intValue = Integer.parseInt("100");
        double doubleValue = Double.parseDouble("12.35");
        float floatValue = Float.parseFloat("45.67");
        long longValue = Long.parseLong("12345");
        short shortValue = Short.parseShort("200");
        byte byteValue = Byte.parseByte("120");

//        System.out.println("Parsed Integer: " + intValue);
//        System.out.println("Parsed Double: " + doubleValue);
//        System.out.println("Parsed Long: " + longValue);
//        System.out.println("Parsed Float: " + floatValue);
//        System.out.println("Parsed Short: " + shortValue);
//        System.out.println("Parsed Byte: " + byteValue);

        //* Boolean Parsing - Special Case
        boolean boolTrue1 = Boolean.parseBoolean("true");
        boolean boolTrue2 = Boolean.parseBoolean("TrUe");

        System.out.println("boolTrue1: " + boolTrue1);
        System.out.println("boolTrue2: " + boolTrue2);


    }
}
