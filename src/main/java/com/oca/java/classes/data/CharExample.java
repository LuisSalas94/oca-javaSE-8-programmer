package com.oca.java.classes.data;

public class CharExample {
    public static void main(String[] args) {
        char letter = 'A';
        System.out.println("Character: " + letter);

        char unicodeChar = '\u0122';
        System.out.println("Unicode: " + unicodeChar);

        char numeriChar = 122;
        System.out.println("NumericChar: " + numeriChar);

        char castedChar = (char) -122;
        System.out.println("castedChar: " + castedChar);

        char char1 = 'A';
        char char2 = 'B';
        System.out.println("Sum of char1 + char2: " + (char1 + char2));

        char nextChar = 'A'; // 65
        nextChar++;
        System.out.println("nextChar: " + nextChar);
    }
}
