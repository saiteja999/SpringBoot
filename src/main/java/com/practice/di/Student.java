package com.practice.di;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Sai")
    private String studentName;

    @Value("1")
    private int id;

    public Student(){

    }
    public Student(String studentName, int id){
        this.studentName = studentName;
        this.id = id;
    }

    public void displayStudentInfo(){
        System.out.println("Student name is: " + studentName + " and id is "+ id);
    }
}
