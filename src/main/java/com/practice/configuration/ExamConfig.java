package com.practice.configuration;

import com.practice.di.Exam;
import com.practice.di.Invigilator;
import com.practice.di.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.practice.di")
@PropertySource("classpath:student-info.properties")
public class ExamConfig {

//    @Bean(name = "invigilator")
//    public Invigilator invigilatorBean(){
//        Invigilator invigilator = new Invigilator();
//        invigilator.setId(2);
//        invigilator.setName("invig1");
//        return invigilator;
//    }
//
//    @Bean(name = {"student","otherStudent"})
//    public Student studentBean(){
//        return new Student("Sai",1);
//    }
//    @Bean(name = "exam")
//    public Exam examBean(){
//        Exam e = new Exam();
//        e.setInvigilator(invigilatorBean());
//        e.setStudent(studentBean());
//
//        return e;
//    }

}
