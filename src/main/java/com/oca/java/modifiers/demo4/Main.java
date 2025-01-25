package com.oca.java.modifiers.demo4;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.modifyTemplate();

        CourseBook courseBook = new CourseBook();
        courseBook.accessBook();
    }
}
