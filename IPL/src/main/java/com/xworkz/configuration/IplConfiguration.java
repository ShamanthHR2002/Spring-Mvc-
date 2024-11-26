package com.xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class IplConfiguration {
    IplConfiguration(){
        System.out.println("running IplConfiguration");
    }
    @Bean
    public String teamName(){
        return "RCB";
    }
    public double budget(){
        return 500;
    }
    @Bean
    public String ownerName(){
        return "virat";
    }
    @Bean
    public double batCost(){
        return 10000;
    }
    @Bean
    public double ballCost(){
        return 1000;
    }
}