package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Mouse {

    @Autowired
    @Qualifier("button")
    Button button;

    public String getButton() {
        return button.getName();
    }
}
