package org.example.spring_examples._2_stereotype_annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {
    private String name;

    public Parrot() {
    }

    public Parrot(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
            "name='" + name + '\'' +
            '}';
    }
}
