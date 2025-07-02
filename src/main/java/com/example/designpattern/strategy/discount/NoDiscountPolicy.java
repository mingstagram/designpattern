package com.example.designpattern.strategy.discount;

import com.example.designpattern.Member;
import org.springframework.stereotype.Component;

@Component
public class NoDiscountPolicy implements DIscountPolicy {
    @Override
    public int discount(Member member, int price) {
        return 0;
    }

    @Override
    public DiscountPolicyType getType() {
        return DiscountPolicyType.NONE;
    }
}
