package com.example.springcore;

import com.example.ioc.Airtel;
import com.example.ioc.Sim;
import com.example.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);

        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("config loaded");
        //Sim sim = (Sim)context.getBean("airtel");
        Sim sim = context.getBean("airtel", Sim.class);
        sim.calling();
    }
}
