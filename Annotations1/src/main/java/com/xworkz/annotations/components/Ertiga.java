package com.xworkz.annotations.components;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component("Ertiga")
public class Ertiga implements Car {

    public Ertiga() {
        System.out.println("Const of Ertiga");
    }

    @Override
    public void model() {
        System.out.println("Ertiga car model 2017");
    }
}
