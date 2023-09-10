package org.example.spring_examples._3_wiring_beans;

public class Parrot {
    private String name;

    public Parrot() {
    }

    public Parrot(String name) {
        this.name = name;
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
