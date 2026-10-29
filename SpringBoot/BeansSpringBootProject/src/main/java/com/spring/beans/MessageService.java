package com.spring.beans;

import org.springframework.stereotype.Service;

@Service
public class MessageService {
    private final MessageRepository repository;

    public MessageService(MessageRepository repository) {
        this.repository = repository;
    }

    public String format(String message) {
        return repository.addSignature(message);
    }
}
