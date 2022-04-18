package com.home;

import org.springframework.stereotype.Component;

@Component
public class Xiaomi implements Phone {
    private String number;

    Xiaomi(String number) {
        this.number = number;
    }

    Xiaomi() {}

    @Override
    public String getNumber() {
        return number;
    }

    @Override
    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public void on() {
        System.out.println("Xiaomi is turning on");
    }
}
