package com.company;

public class CrewMember extends Person {
    private String job;

    public CrewMember(){
        super();
        this.job = "";
    }

    public CrewMember(int id, String name, String job){
        super(id, name);
        this.job = job;
    }
    public String getRole(){
        return this.job;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Job: "  + job;
    }
}
