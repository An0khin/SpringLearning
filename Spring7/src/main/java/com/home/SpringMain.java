package com.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book.hashCode());

        Book book1 = context.getBean("book", Book.class);
        System.out.println(book1);
        System.out.println(book1.hashCode());

        context.close();
    }
}
