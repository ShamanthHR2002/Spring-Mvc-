package com.xworkz.annotations.components;

import org.springframework.stereotype.Component;


@Component
public class Dzire implements Car {
    public Dzire(){
        System.out.println("Const of Dzire");
    }
    @Override
    public void model() {
        System.out.println("Dzire car model 2019");
    }
}