package com.spring.beans;

import java.util.UUID;

public class PrototypeBean {
    private final String id = UUID.randomUUID().toString();
    public String getId() { return id; }
}
