package com.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class ComponentBeanExample {
    public String message() {
        return "This bean was discovered by component scanning (@Component).";
    }
}
