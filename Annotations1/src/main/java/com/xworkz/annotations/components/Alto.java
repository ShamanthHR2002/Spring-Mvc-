package com.xworkz.annotations.components;

import org.springframework.stereotype.Component;

@Component
public class Alto implements Car {
    public Alto(){
        System.out.println("Const of Alto car");
    }
    @Override
    public void model() {
        System.out.println("Alto car model 2015");
    }

}