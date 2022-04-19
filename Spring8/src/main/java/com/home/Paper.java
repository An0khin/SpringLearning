package com.home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Paper {
    @Autowired
    @Qualifier("tree")
    Tree tree;

    @Override
    public String toString() {
        return "Paper from " + tree;
    }
}
