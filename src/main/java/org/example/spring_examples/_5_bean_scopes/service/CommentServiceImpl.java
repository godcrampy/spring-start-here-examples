package org.example.spring_examples._5_bean_scopes.service;

import org.example.spring_examples._4_abstractions.dto.Comment;
import org.example.spring_examples._5_bean_scopes.repository.CommentRepository;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Lazy
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;

    public CommentServiceImpl(CommentRepository commentRepository) {
        System.out.println("Comment Service Constructor called");
        this.commentRepository = commentRepository;
    }

    @Override
    public void publishComment(Comment comment) {
        commentRepository.saveComment(comment);
    }
}
