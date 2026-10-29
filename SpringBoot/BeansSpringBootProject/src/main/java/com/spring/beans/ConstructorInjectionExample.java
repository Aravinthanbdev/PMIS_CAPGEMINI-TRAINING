package com.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectionExample {
    private final GreetingService greetingService;

    public ConstructorInjectionExample(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String runExample() {
        return greetingService.greet("Constructor Injection");
    }
}
