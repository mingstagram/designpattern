package com.example.designpattern.factory.payment;

import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class PaymentServiceFactory {

    private final Map<String, PaymentService> serviceMap;

    public PaymentServiceFactory(Map<String, PaymentService> serviceMap) {
        this.serviceMap = serviceMap;
    }

    public PaymentService getService(String type) {
        return serviceMap.get(type);
    }

}
