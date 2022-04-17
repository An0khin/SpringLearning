package com.home;

public class RockMusic implements Music {
    String name;
    
    RockMusic() {
        this.name = "Rooooock";
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
