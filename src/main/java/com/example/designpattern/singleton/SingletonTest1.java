package com.example.designpattern.singleton;

public class SingletonTest1 {
    public static void main(String[] args) {
        NormalService s1 = new NormalService();
        NormalService s2 = new NormalService();

        s1.logic();
        s2.logic();

        System.out.println("동일한 인스턴스인가? " + (s1 == s2));
        // 실행 결과: 서로 다른 인스턴스 → 메모리 낭비 & 자원 중복
    }
}
