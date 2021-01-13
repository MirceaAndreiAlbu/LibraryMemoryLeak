package com.mircea.bean;

import java.util.Random;

public class Author {
    String name;
    String surname;
    int birthdayYear;
    boolean alive;

    public Author(){
        Random rand = new Random();
        this.name = "Author " + rand.nextInt();
        this.surname = "Author " + rand.nextInt();
        this.birthdayYear = rand.nextInt();
        this.alive = rand.nextBoolean();
    }
}
