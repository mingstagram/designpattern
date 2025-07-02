package com.example.designpattern.factory.payment;

import org.springframework.stereotype.Service;

@Service("card")
public class CardPaymentService implements PaymentService {
    @Override
    public void pay(int amount) {
        System.out.println("카드로 " + amount + "원 결제합니다.");
    }
}
