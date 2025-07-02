package com.example.designpattern.factory;

public class FactoryPatternTest {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        Shape square  = ShapeFactory.getShape("square");

        circle.draw();
        square.draw();
    }
}
