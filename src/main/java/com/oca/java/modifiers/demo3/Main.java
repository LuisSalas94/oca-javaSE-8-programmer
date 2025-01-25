package com.oca.java.modifiers.demo3;

import com.oca.java.modifiers.demo3.building.StoryBook;
import com.oca.java.modifiers.demo3.library.CourseBook;

public class Main {
    public static void main(String[] args) {
//        StoryBook storyBook = new StoryBook();
//        storyBook.readBook();

        CourseBook courseBook = new CourseBook();
        courseBook.accessBook();
    }
}
