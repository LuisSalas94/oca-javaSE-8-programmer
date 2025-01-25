package com.oca.java.modifiers.demo2.building;

import com.oca.java.modifiers.demo2.library.Book;

public class StoryBook extends Book {
    public void accessProtectedMembers() {
        Book book = new Book();
        this.author = "George Orwell";
        this.modifyTemplate();
        System.out.println("Author: " + this.author);
    }

    public static void main(String[] args) {
        StoryBook storyBook = new StoryBook();
        storyBook.accessProtectedMembers();

    }

}
