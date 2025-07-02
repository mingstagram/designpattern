package com.example.designpattern.factory.payment;

import org.springframework.stereotype.Service;

@Service
public class OrderService {

    private final PaymentServiceFactory factory;

    public OrderService(PaymentServiceFactory factory) {
        this.factory = factory;
    }

    public void processOrder(String paymentType, int amount) {
        PaymentService service = factory.getService(paymentType);
        service.pay(amount);
    }

}
