package com.practice.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("examBean")
public class Exam {
    private Student student;
    private Invigilator invigilator;

    @Autowired
    public void setStudent(Student student) {
        this.student = student;
    }

    public Exam(){}

    public Exam(Student student){
        this.student = student;
    }

    @Autowired
    public void setInvigilator(Invigilator invigilator) {
        this.invigilator = invigilator;
    }
    public void displayExamInfo(){
        student.displayStudentInfo();
        invigilator.displayInfo();
    }
}
