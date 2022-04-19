package com.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);

        context.close();
    }
}
