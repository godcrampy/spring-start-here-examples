package org.example.spring_examples._5_bean_scopes.repository;

import org.example.spring_examples._4_abstractions.dto.Comment;

public interface CommentRepository {
    void saveComment(Comment comment);
}
