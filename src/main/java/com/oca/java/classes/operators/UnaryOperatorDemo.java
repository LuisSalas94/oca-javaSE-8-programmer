package com.oca.java.classes.operators;

public class UnaryOperatorDemo {
    public static void main(String[] args) {
        int a = 5; // 6
        int b = ++a; // 6
        //System.out.println("a-> " + a + "\n" + "b-> " + b);


        int x = 5;
        int y = x++; // y = 5 then x = 6
        //System.out.println("x-> " + x + "\n" + "y-> " + y);


        int p = 10;
        int q = 20;
        //int result = ++p + q--;
        // 11 + 20 = 31
        //System.out.println("result-> " + result);
        int result2 = ++p + --q;
        // 11 + 19 = 30
        System.out.println("result2-> " + result2);


    }
}
