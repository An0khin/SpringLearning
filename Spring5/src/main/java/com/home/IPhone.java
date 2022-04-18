package com.home;

import org.springframework.stereotype.Component;

public class IPhone implements Phone {
    private String number;

    IPhone(String number) {
        this.number = number;
    }

    IPhone() {}

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
        System.out.println("IPhone is turning on");
    }
}
