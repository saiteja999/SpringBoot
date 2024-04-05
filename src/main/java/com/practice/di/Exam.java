package com.practice.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Exam {
    private Student student;

    public Exam(){}

    public Exam(Student student){
        this.student = student;
    }

    public void displayExamInfo(){
        student.displayStudentInfo();
    }
}
