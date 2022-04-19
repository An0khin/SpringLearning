package com.home;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tree {
    @Value("${tree.name}")
    String name;

    @Override
    public String toString() {
        return this.name;
    }
}
