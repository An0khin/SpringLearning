package com.home;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        Paper paper = context.getBean("paper", Paper.class);
        System.out.println(paper);

        context.close();
    }
}
