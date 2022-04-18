package com.home;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

//        MainBean bean = context.getBean("someBean", MainBean.class);
//        System.out.println(bean.getName());

//        IPhone iphone = context.getBean("IPhone", IPhone.class);
//        System.out.println(iphone.getNumber());

        Case casePhone = context.getBean("case", Case.class);
        System.out.println(casePhone.getPhone());

        context.close();
    }
}
