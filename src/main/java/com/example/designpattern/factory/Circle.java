package com.example.designpattern.factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }
}
