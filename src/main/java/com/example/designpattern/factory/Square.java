package com.example.designpattern.factory;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
    }
}
