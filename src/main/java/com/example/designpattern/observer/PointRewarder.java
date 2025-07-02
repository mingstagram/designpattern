package com.example.designpattern.observer;

public class PointRewarder implements Observer {
    @Override
    public void handle(String postTitle) {
        System.out.println("[포인트 적립] 게시글 등록으로 50P 지급!");
    }
}
