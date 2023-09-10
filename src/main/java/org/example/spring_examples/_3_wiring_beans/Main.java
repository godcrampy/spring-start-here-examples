package org.example.spring_examples._3_wiring_beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println(context.getBean(Person.class));
    }
}
