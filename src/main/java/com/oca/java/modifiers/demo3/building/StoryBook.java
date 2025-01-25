package com.oca.java.modifiers.demo3.building;

import com.oca.java.modifiers.demo3.library.Book;

public class StoryBook {
    public void readBook() {
        Book book = new Book();
        //book.issueCount = 4;
        System.out.println("StoryBook cannot access");
    }
}
