package com.example.springcore;

import com.example.ioc.Airtel;
import com.example.ioc.Sim;
import com.example.ioc.Vodafone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCoreApplication.class, args);
        Sim sim = new Airtel();
        sim.calling();
    }
}
