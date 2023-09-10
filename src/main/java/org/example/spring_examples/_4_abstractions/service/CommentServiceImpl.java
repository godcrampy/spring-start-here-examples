package org.example.spring_examples._4_abstractions.service;

import org.example.spring_examples._4_abstractions.dto.Comment;
import org.example.spring_examples._4_abstractions.proxy.CommentNotificationProxy;
import org.example.spring_examples._4_abstractions.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {

    private final CommentRepository commentRepository;
    private final CommentNotificationProxy commentNotificationProxy;

    public CommentServiceImpl(
        CommentRepository commentRepository,
        @Qualifier("emailCommentNotificationProxy") CommentNotificationProxy commentNotificationProxy) {
        this.commentRepository = commentRepository;
        this.commentNotificationProxy = commentNotificationProxy;
    }

    @Override
    public void publishComment(Comment comment) {
        commentRepository.storeComment(comment);
        commentNotificationProxy.notify(comment);
    }
}
