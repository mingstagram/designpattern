package com.example.designpattern.strategy.discount;

public class DiscountPolicyFactory {

    public static DIscountPolicy getPolicy(String type) {
        return switch (type.toLowerCase()) {
           case "vip" -> new RateDiscountPolicy();
           case "coupon" -> new FixDiscountPolicy();
            default -> new NoDiscountPolicy();
        };
    }

}
