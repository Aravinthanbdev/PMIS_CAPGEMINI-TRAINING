package com.spring.beans;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    private final MessageService messageService;

    public GreetingService(MessageService messageService) {
        this.messageService = messageService;
    }

    public String greet(String name) {
        return messageService.format("Hello, " + name);
    }
}
