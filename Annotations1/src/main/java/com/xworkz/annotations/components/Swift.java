package com.xworkz.annotations.components;

import org.springframework.stereotype.Component;

@Component("Swift")
public class Swift implements Car {
    public Swift(){
        System.out.println("Const of swift");
    }
    @Override
    public void model() {
        System.out.println("swift car model2016");
    }




}
