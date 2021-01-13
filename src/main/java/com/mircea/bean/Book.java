package com.mircea.bean;

import java.util.Random;

public class Book {
    static Random rand = new Random();
    int bookID;
    String title;
    Boolean romana;

    public Book(){
        initialize();
    }

    private void initialize() {
        bookID = rand.nextInt();
        title = Double.toString(rand.nextDouble());
        romana = rand.nextBoolean();
    }
}