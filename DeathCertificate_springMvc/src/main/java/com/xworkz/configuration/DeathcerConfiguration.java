package com.xworkz.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class DeathcerConfiguration {
    DeathcerConfiguration(){
        System.out.println("running DeathConfiguration .............");
    }
}
