package com.oca.java.classes.comments;

public class MyClass {

    /**
     * @param name the name to include in the message
     * @return a greeting message in the format of "Hello + name"
     */
    public static String printName(String name) {
        return "Hello: " + name;
    }

    public static void main(String[] args) {
        System.out.println(printName("Fernando"));
    }


}
