package com.practice.di;

public class Exam {
    private Student student;
    private Invigilator invigilator;

    public Exam(Student student, Invigilator invigilator){
        this.student = student;
        this.invigilator = invigilator;
    }

    public void displayExamInfo(){
        student.displayStudentInfo();
        invigilator.displayInfo();
    }
}
