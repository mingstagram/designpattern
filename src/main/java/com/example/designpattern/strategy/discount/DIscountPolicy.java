package com.example.designpattern.strategy.discount;

import com.example.designpattern.Member;

public interface DIscountPolicy {
    int discount(Member member, int price);
    DiscountPolicyType getType(); // 전략 키 반환용
}
