package com.oca.java.modifiers.demo1.building;

import com.oca.java.modifiers.library.Book;

public class House {
    public House() {
        Book book = new Book();
        book.isbn = "123456789";
        book.printBook();
    }

    public static void main(String[] args) {
        House house = new House();
    }
}
