package com.oca.java.wrapper;

public class WrapperClassDemo {
    public static void main(String[] args) {
        //* Wrapper class objects can be created in three ways

        //* 1. Assignment (Autoboxing)
        Boolean bool1 = true;
        Character char1 = 'A';
        Byte byte1 = 10;
        Short short1 = 100;
        Integer int1 = 500;
        Long long1 = 1000L;
        Float float1 = 10.5f;
        Double double1 = 99.99;

//        System.out.println("Autoboxing examples:");
//        System.out.println("Boolean: " + bool1);
//        System.out.println("Character: " + char1);
//        System.out.println("Byte: " + byte1);
//        System.out.println("Short: " + short1);
//        System.out.println("Integer: " + int1);
//        System.out.println("Long: " + long1);
//        System.out.println("Float: " + float1);
//        System.out.println("Double: " + double1);


        //* 2. Using Wrapper Class Constructors (Deprecated) 🚨
//        Boolean bool2 = new Boolean(true);
//        Character char2 = new Character('A');
//        Byte byte2 = new Byte((byte) 20);
//        Short short2 = new Short((short) 200);
//        Integer int2 = new Integer(1000);
//        Long long2 = new Long(2000L);
//        Float float2 = new Float(20.5f);
//        Double double2 = new Double(199.99);

//        System.out.println("Constructor examples:");
//        System.out.println("Boolean: " + bool2);
//        System.out.println("Character: " + char2);
//        System.out.println("Byte: " + byte2);
//        System.out.println("Short: " + short2);
//        System.out.println("Integer: " + int2);
//        System.out.println("Long: " + long2);
//        System.out.println("Float: " + float2);
//        System.out.println("Double: " + double2);


        //* 3. Using `valueOf()` (Best Practice) 📌
        Boolean bool3 = Boolean.valueOf(true);
        Character char3 = Character.valueOf('Z');
        Byte byte3 = Byte.valueOf((byte) 10);
        Short short3 = Short.valueOf((short) 50);
        Integer int3 = Integer.valueOf(100);
        Long long3 = Long.valueOf(1000L);
        Float float3 = Float.valueOf(20.5f);
        Double double3 = Double.valueOf(188.55);

        System.out.println("Using valueOf() method:");
        System.out.println("Boolean: " + bool3);
        System.out.println("Character: " + char3);
        System.out.println("Byte: " + byte3);
        System.out.println("Short: " + short3);
        System.out.println("Integer: " + int3);
        System.out.println("Long: " + long3);
        System.out.println("Float: " + float3);
        System.out.println("Double: " + double3);

    }
}
