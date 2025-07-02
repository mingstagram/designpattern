package com.example.designpattern.strategy.discount;

import com.example.designpattern.Member;

public class FixDiscountPolicy implements DIscountPolicy {
    @Override
    public int discount(Member member, int price) {
        return (member.getCoupon()) ? 1000 : 0;
    }
}
