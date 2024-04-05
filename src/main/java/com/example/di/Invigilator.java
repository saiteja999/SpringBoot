package com.example.di;

public class Invigilator {
    private int id;
    private String name;

    public Invigilator(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    public void displayInfo(){
        System.out.println("data of invigilator: "+ id + " "+ name);
    }
}
