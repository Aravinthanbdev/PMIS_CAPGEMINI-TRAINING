package com.spring.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanMethodExample {
    @Bean(name = "welcomeMessage")
    public String welcomeMessage() {
        return "Welcome to Spring @Bean methods";
    }
}
