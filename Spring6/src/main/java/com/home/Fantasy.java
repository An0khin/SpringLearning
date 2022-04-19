package com.home;

import org.springframework.stereotype.Component;

@Component
public class Fantasy implements Genre {
    String name = "Fantasy";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
