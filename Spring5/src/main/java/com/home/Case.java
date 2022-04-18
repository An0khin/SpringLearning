package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Case {
    @Autowired
    private Phone phone;

    //@Autowired
    Case(Phone phone) {
        this.phone = phone;
    }

//    @Autowired
//    public void setPhone(Phone phone) {
//        this.phone = phone;
//    }

    public Phone getPhone() {
        return phone;
    }
}
