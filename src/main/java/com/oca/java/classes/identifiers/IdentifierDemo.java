package com.oca.java.classes.identifiers;

public class IdentifierDemo {
    // Valid variables name
    int examTotal = 100;
    int _score = 90;
    int $price = 50;
    int value123 = 123;

    // Invalid Identifiers
    //int 1stvalue = 10;
    //int exam-total = 12;
    //int class = 45;
    //int @name = 209;

    public static void main(String[] args) {
        IdentifierDemo identifierDemo = new IdentifierDemo();
        System.out.println("examTotal: " + identifierDemo.examTotal);
        System.out.println("price: " + identifierDemo.$price);
        System.out.println("score: " + identifierDemo._score);
        System.out.println("value: " + identifierDemo.value123);
    }


}
