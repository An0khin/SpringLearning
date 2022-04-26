package com.home.forms;

public class Movie {
    private String name;
    private int id;
    private int rate;

    public Movie(String name, int id, int rate) {
        this.name = name;
        this.id = id;
        this.rate = rate;
    }

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }
}
