package com.example.designpattern.observer;

public class EmailSender implements Observer {
    @Override
    public void handle(String postTitle) {
        System.out.println("[메일 발송] 새 게시글 등록: " + postTitle);
    }
}
