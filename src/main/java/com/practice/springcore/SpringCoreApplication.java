package com.practice.springcore;


import com.practice.configuration.ExamConfig;
import com.practice.di.Exam;
import com.practice.di.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);

        ApplicationContext context = new AnnotationConfigApplicationContext(ExamConfig.class);
        System.out.println("config loaded");

        Exam e = context.getBean("exam", Exam.class);
        e.displayExamInfo();

        ((AnnotationConfigApplicationContext)context).close();
    }
}
