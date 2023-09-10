package org.example.spring_examples._2_stereotype_annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Main {
    public static void main(String[] args) {

        GenericApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println(context.getBean(Parrot.class));


        context.registerBean("john", Parrot.class, () -> {
            Parrot john = new Parrot();
            // this would be overridden by post-construct
            john.setName("john");
            return john;
        });
        System.out.println(context.getBeansOfType(Parrot.class));

        System.out.println(context.getBean("john", Parrot.class));
    }
}
