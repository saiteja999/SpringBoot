package com.practice.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("examBean")
public class Exam {

    @Autowired
    private Student student;

    @Autowired
    private Invigilator invigilator;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Exam(){}

    public Exam(Student student){
        this.student = student;
    }

    public void setInvigilator(Invigilator invigilator) {
        this.invigilator = invigilator;
    }
    public void displayExamInfo(){
        student.displayStudentInfo();
        invigilator.displayInfo();
    }
}
