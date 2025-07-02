package com.example.designpattern.strategy.discount;

import com.example.designpattern.Member;

public class StrategyPatternTest {
    public static void main(String[] args) {
        Member vipMember = new Member("멤버1", Grade.VIP, false);
        Member couponMember = new Member("멤버2", Grade.BASIC, true);
        Member basicMember = new Member("멤버3", Grade.BASIC, false);

        // 정책 선택
        DIscountPolicy vipPolicy = DiscountPolicyFactory.getPolicy("vip");
        DIscountPolicy couponPolicy = DiscountPolicyFactory.getPolicy("coupon");
        DIscountPolicy noPolicy = DiscountPolicyFactory.getPolicy("basic");

        // 할인 테스트
        System.out.println("VIP 할인: " + vipPolicy.discount(vipMember, 10000));
        System.out.println("쿠폰 할인: " + couponPolicy.discount(couponMember, 10000));
        System.out.println("일반 할인: " + noPolicy.discount(basicMember, 10000));
    }
}
