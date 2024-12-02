package com.xworkz.annotations.components;

import org.springframework.stereotype.Component;

@Component
public class Grandvitara implements Car {
    public Grandvitara(){
        System.out.println("Const of Grandvitara");
    }
    @Override
    public void model() {
        System.out.println("Grandvitara model 2024");
    }
}