package org.example.spring_examples._4_abstractions.repository;

import org.example.spring_examples._4_abstractions.dto.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
