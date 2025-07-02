package com.example.designpattern.strategy.discount;

import com.example.designpattern.Member;

public class NoDiscountPolicy implements DIscountPolicy {
    @Override
    public int discount(Member member, int price) {
        return 0;
    }
}
