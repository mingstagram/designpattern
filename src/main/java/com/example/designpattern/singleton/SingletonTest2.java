package com.example.designpattern.singleton;

public class SingletonTest2 {
    public static void main(String[] args) {
        SingletonService s1 = SingletonService.getInstance();
        SingletonService s2 = SingletonService.getInstance();

        s1.logic();
        s2.logic();

        System.out.println("동일한 인스턴스인가? " + (s1 == s2)); // true
    }
}
