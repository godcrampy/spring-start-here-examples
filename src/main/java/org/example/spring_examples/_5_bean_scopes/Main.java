package org.example.spring_examples._5_bean_scopes;

import org.example.spring_examples._4_abstractions.dto.Comment;
import org.example.spring_examples._5_bean_scopes.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
@ComponentScan(basePackages = "org.example.spring_examples._5_bean_scopes")
public class Main {

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        System.out.println("Context Created");

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment("john", "hey there");

        commentService.publishComment(comment);

        context.getBean(CommentService.class).publishComment(comment);
    }
}
