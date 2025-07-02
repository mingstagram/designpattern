package com.example.designpattern;

import com.example.designpattern.strategy.discount.DiscountPolicyService;
import com.example.designpattern.strategy.discount.DiscountPolicyType;
import com.example.designpattern.strategy.discount.Grade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class StrategySpringDiTest {

    @Autowired
    private DiscountPolicyService discountPolicyService;

    @Test
    void discountTest() {
        Member vip = new Member("멤버1", Grade.VIP, false);
        Member coupon = new Member("멤버2", Grade.BASIC, true);
        Member normal = new Member("멤버3", Grade.BASIC, false);

        int vipDiscount = discountPolicyService.applyDiscount(vip, 10000, DiscountPolicyType.VIP);
        int couponDiscount = discountPolicyService.applyDiscount(coupon, 10000, DiscountPolicyType.COUPON);
        int normalDiscount = discountPolicyService.applyDiscount(normal, 10000, DiscountPolicyType.NONE);

        System.out.println("VIP 할인: " + vipDiscount);
        System.out.println("쿠폰 할인: " + couponDiscount);
        System.out.println("일반 할인: " + normalDiscount);

    }
}
