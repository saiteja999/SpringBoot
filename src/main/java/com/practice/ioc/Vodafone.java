package com.practice.ioc;

public class Vodafone implements Sim{
    @Override
    public void data() {
        System.out.println("Using data of Vodafone");
    }

    @Override
    public void calling() {
        System.out.println("Calling with Vodafone");
    }
}
