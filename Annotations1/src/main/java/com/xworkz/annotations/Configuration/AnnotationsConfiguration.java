package com.xworkz.annotations.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("com.xworkz.annotations")
@Configuration
public class AnnotationsConfiguration {
    public AnnotationsConfiguration(){
        System.out.println("No-Args Const Configuration Class");
    }
}
