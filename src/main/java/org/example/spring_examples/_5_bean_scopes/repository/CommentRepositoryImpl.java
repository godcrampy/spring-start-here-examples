package org.example.spring_examples._5_bean_scopes.repository;


import org.example.spring_examples._4_abstractions.dto.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentRepositoryImpl implements CommentRepository {

    public CommentRepositoryImpl() {
        System.out.println("Comment Repository Constructor called");
    }

    @Override
    public void saveComment(Comment comment) {
        System.out.println("Saving Comment: " + comment);
    }
}
