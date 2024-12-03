package com.xworkz.component;

import org.springframework.web.bind.annotation.RequestMapping;

public class Component {
    public Component(){
        System.out.println("Execute Component1 Const");
    }
    @RequestMapping("/submit")
    public String submit(){
        System.out.println("submit method in Component1");
        return "index.jsp";
    }
}
