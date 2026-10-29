package com.spring.beans;

import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {
    public String addSignature(String message) {
        return message + " — from MessageRepository";
    }
}
