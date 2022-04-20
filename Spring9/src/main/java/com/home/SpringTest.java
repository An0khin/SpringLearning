package com.home;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

public class SpringTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);

        System.out.println(context.getBean("mouse", Mouse.class).getButton());

        context.close();
    }
}
