package com.mircea.website;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.mircea"})
public class Library {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Library.class).run(args);
    }



}
