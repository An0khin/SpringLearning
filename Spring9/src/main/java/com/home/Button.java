package com.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Button {
    @Value("${Button.name}")
    String name;

    public String getName() {
        return name;
    }
}
