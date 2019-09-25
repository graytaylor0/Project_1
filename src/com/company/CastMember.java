package com.company;

public class CastMember extends Person{
    private String role;

    public CastMember(){
        super();
        this.role = "";
    }

    public CastMember(int id, String name, String role){
        super(id, name);
        this.role = role;
    }
    public String getRole(){
        return this.role;
    }

    @Override
    public String toString() {
        return "Id: " + id + " Name: " + name + " Role: " + role;
    }
}
