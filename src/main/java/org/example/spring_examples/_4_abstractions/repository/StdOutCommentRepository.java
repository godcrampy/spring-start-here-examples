package org.example.spring_examples._4_abstractions.repository;

import org.example.spring_examples._4_abstractions.dto.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class StdOutCommentRepository implements CommentRepository {
    @Override
    public void storeComment(Comment comment) {
        System.out.println("Storing comment: " + comment);
    }
}
