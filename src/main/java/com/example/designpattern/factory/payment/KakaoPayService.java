package com.example.designpattern.factory.payment;

import org.springframework.stereotype.Service;

@Service("kakao")
public class KakaoPayService implements PaymentService{
    @Override
    public void pay(int amount) {
        System.out.println("카카오페이로 " + amount + "원 결제합니다.");
    }
}
