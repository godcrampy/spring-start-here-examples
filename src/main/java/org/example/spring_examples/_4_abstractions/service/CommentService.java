package org.example.spring_examples._4_abstractions.service;

import org.example.spring_examples._4_abstractions.dto.Comment;

public interface CommentService {
    void publishComment(Comment comment);
}
