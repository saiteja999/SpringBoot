package com.example.ioc;

public class Airtel implements Sim{
    public Airtel(){
        System.out.println("Airtel constructor");
    }

    @Override
    public void data() {
        System.out.println("Using data of airtel");
    }

    @Override
    public void calling() {
        System.out.println("Calling with airtel");
    }
}
