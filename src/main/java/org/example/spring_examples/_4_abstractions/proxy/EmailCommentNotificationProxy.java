package org.example.spring_examples._4_abstractions.proxy;

import org.example.spring_examples._4_abstractions.dto.Comment;
import org.springframework.stereotype.Component;

@Component("emailCommentNotificationProxy")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override
    public void notify(Comment comment) {
        System.out.println("Sending Email: " + comment);
    }
}
