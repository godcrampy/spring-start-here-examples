package org.example.spring_examples._3_wiring_beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name = "john";
    private Parrot parrot;

    public Person(@Qualifier("emma") Parrot parrot) {
        this.parrot = parrot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public void setParrot(Parrot parrot) {
        this.parrot = parrot;
    }

    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", parrot=" + parrot +
            '}';
    }
}
