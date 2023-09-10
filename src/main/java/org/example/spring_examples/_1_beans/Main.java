package org.example.spring_examples._1_beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
            ProjectConfig.class
        );

        System.out.println("Context created");

        System.out.println(context.getBean(Parrot.class));
        System.out.println(context.getBean(Parrot.class));
        System.out.println(context.getBean("emma", Parrot.class));
        System.out.println(context.getBean(Integer.class));
    }
}
