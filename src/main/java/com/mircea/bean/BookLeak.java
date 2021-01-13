package com.mircea.bean;

import java.util.Random;

public class BookLeak extends Book {

    @Override
    public int hashCode() {
        return new Random().nextInt();
    }
}
