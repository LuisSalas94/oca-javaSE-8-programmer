package com.oca.java.modifiers.demo3.library;

public class CourseBook {
    public void accessBook() {
        Book book = new Book();
        book.issueCount = 5;
        book.issueHistory();
        System.out.println("CourseBook accessed issueCount");
        System.out.println("IssueCount:  " + book.issueCount);

    }
}
