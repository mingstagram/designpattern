package com.example.designpattern.strategy.discount;

import com.example.designpattern.Member;

public class RateDiscountPolicy implements DIscountPolicy {
    @Override
    public int discount(Member member, int price) {
        return (member.getGrade() == Grade.VIP) ? price * 20 / 100 : 0;
    }
}
