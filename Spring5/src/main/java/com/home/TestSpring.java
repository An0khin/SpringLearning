package com.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MainBean bean = context.getBean("someBean", MainBean.class);
        System.out.println(bean.getName());

        context.close();
    }
}
