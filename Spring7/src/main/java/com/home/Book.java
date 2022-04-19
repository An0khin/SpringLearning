package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class Book {
    String name = "Harry Potter";

    Genre genre1;
    Genre genre2;

    @Value("${book.genre3}")
    String genre3;

    @Autowired
    Book(@Qualifier("fantastic") Genre genre1, @Qualifier("fantasy") Genre genre2) {
        this.genre1 = genre1;
        this.genre2 = genre2;
    }

    @Override
    public String toString() {
        return name + " is " + genre1 + " and " + genre2 + " and " + genre3;
    }

    @PostConstruct
    public void initMethod() {
        System.out.println("Initializing");
    }

    @PreDestroy
    public void destroyMethod() {
        System.out.println("Destroying");
    }
}
