package org.example.spring_examples._4_abstractions;

import org.example.spring_examples._4_abstractions.dto.Comment;
import org.example.spring_examples._4_abstractions.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
@ComponentScan(basePackages = "org.example.spring_examples._4_abstractions")
public class Main {

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment("john", "hi there!");

        commentService.publishComment(comment);
    }
}
