package com.example.designpattern.singleton;

public class SingletonService {

    // 1. static 영역에 유일한 인스턴스 하나만 생성
    private static final SingletonService instance = new SingletonService();

    // 2. 생성자를 private으로 막아 외부에서 new 키워드로 생성 못하게 함
    private SingletonService() {}

    // 3. 인스턴스를 호출할 수 있는 static 메서드 제공
    public static SingletonService getInstance() {
        return instance;
    }

    public void logic() {
        System.out.println("싱글톤 객체 호출: " + this);
    }

}
