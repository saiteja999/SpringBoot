package com.practice.configuration;

import com.practice.di.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.practice.di")
public class ExamConfig {

    @Bean
    public Student studentBean(){
        Student student = new Student("Sai",1);
        return student;
    }

}
