package com.home;

import org.springframework.stereotype.Component;

@Component("someBean") //id in brackets //you can also use only @Component and then id will be mainBean
public class MainBean {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
