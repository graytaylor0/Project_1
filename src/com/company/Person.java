package com.company;
import java.util.ArrayList;

public abstract class Person {
    protected int id;
    protected String name;
    protected ArrayList<Movie> movies;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(){
        this.id = 0;
        this.name = "";
    }
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
