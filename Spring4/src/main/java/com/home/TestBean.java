package com.home;

public class TestBean {
    String name;

    private TestBean() {}

    public static TestBean getTestBean() {
        System.out.println("Getting bean...");
        return new TestBean();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void doMyInit() {
        System.out.println("Initialization...");
    }

    public void doMyDestroy() {
        System.out.println("Destroying");
    }
}
