package com.xworkz.inti;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitilizer extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[0];
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{Configuration.class};
    }
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
        System.out.println("Enable Static resources");
        configurer.enable();
    }
}
