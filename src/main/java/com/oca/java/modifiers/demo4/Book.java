package com.oca.java.modifiers.demo4;

public class Book {
    private int pages = 100;

    private int countPages() {
        System.out.println("Counting pages");
        return pages;
    }

    public void modifyTemplate() {
        int pageCount = countPages();
        System.out.println("Template modified with: " + pageCount + " pages.");
    }
}
