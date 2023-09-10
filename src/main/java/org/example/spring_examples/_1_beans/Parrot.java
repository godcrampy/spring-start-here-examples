package org.example.spring_examples._1_beans;

public class Parrot {
    private final String name;

    public Parrot(String name) {
        System.out.println("Parrot constructor called");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
            "name='" + name + '\'' +
            '}';
    }
}
