package com.xworkz.annotations.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@PropertySource("classpath:persist.properties")
public class Callingcar {

    @Autowired
    @Qualifier("Swift")
    private Car car;

    @Autowired
    private Swift swift;

    @Value("${dbusername}")
    private String username;

    @Value("${password}")
    private String password;

    public Callingcar() {
        System.out.println("Const of Calling car");
    }

    public Callingcar(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @PostConstruct
    public void display() {
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);


        car.model();
    }
}
