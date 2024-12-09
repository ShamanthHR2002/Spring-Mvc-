package com.xworkz.configration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.xworkz")
@EnableWebMvc
public class FormConfiguration {
    FormConfiguration() {
        System.out.println("running FormConfiguration .............");
    }
}
