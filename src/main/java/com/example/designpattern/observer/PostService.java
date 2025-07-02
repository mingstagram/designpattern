package com.example.designpattern.observer;

public class PostService {

    private final EventManager eventManager;

    public PostService(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void registerPost(String title) {
        System.out.println("게시글 등록 완료: " + title);
        eventManager.notifyAll(title);
    }

}
