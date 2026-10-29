package com.spring.beans.basic;

/** A simple Java object created and managed by Spring. */
public class BasicBean {
    private final String name;

    public BasicBean(String name) {
        this.name = name;
    }

    /** A normal Java method that can be called on this object. */
    public String greet() {
        return "Hello, " + name + "!";
    }
}
