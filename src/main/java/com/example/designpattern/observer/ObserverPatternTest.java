package com.example.designpattern.observer;

public class ObserverPatternTest {
    public static void main(String[] args) {
        EventManager eventManager = new EventManager();

        eventManager.subscribe(new EmailSender());
        eventManager.subscribe(new PointRewarder());

        PostService postService = new PostService(eventManager);
        postService.registerPost("옵저버 패턴 시작!");
    }
}
