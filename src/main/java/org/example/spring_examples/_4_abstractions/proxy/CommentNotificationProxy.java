package org.example.spring_examples._4_abstractions.proxy;

import org.example.spring_examples._4_abstractions.dto.Comment;

public interface CommentNotificationProxy {
    void notify(Comment comment);
}
