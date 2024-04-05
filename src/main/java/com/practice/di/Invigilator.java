package com.practice.di;

import org.springframework.beans.factory.annotation.Value;

public class Invigilator {
    private int id;
    private String name;

    public Invigilator(){}

    public void setId(int id) {
        System.out.println("setter of id");
        this.id = id;
    }


    public void setName(String name) {
        System.out.println("setter of name");
        this.name = name;
    }
    public Invigilator(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public void displayInfo(){
        System.out.println("data of invigilator: "+ id + " "+ name);
    }
}
