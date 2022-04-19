package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Book {
    String name = "Harry Potter";

    Genre genre1;
    Genre genre2;

    @Autowired
    Book(@Qualifier("fantastic") Genre genre1, @Qualifier("fantasy") Genre genre2) {
        this.genre1 = genre1;
        this.genre2 = genre2;
    }

    @Override
    public String toString() {
        return name + " is " + genre1 + " and " + genre2;
    }
}
