package com.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        TestBean test = context.getBean("testBean", TestBean.class);
        System.out.println(test.getName());

        TestBean test1 = context.getBean("testBean", TestBean.class);
        System.out.println(test);
        System.out.println(test1);

        context.close();
    }
}
