package org.example.spring_examples._6_aop.service;

import org.example.spring_examples._4_abstractions.dto.Comment;
import org.example.spring_examples._6_aop.aspects.Protected;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Protected
    public void saveComment(Comment comment) {
        System.out.println("Saving comment: " + comment);
    }
}
