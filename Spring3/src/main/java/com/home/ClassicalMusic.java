package com.home;

public class ClassicalMusic implements Music {
    String name;

    ClassicalMusic() {
        this.name = "Classic";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
