package com.home;

import org.springframework.stereotype.Component;

@Component
public class Fantastic implements Genre {
    String name = "Fantastic";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
