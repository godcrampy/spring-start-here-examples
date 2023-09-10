package org.example.spring_examples._6_aop;

import org.example.spring_examples._4_abstractions.dto.Comment;
import org.example.spring_examples._6_aop.service.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.support.GenericApplicationContext;

@Configuration
@ComponentScan(basePackages = "org.example.spring_examples._6_aop")
@EnableAspectJAutoProxy
public class Main {

    public static void main(String[] args) {
        GenericApplicationContext context = new AnnotationConfigApplicationContext(Main.class);

        CommentService commentService = context.getBean(CommentService.class);

        Comment comment = new Comment("john", "Hey!");

        commentService.saveComment(comment);
    }
}
