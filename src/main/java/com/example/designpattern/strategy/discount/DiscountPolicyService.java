package com.example.designpattern.strategy.discount;

import com.example.designpattern.Member;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DiscountPolicyService {

    private final Map<DiscountPolicyType, DIscountPolicy> policyMap = new HashMap<>();

    public DiscountPolicyService(List<DIscountPolicy> policies) {
        for (DIscountPolicy policy : policies) {
            policyMap.put(policy.getType(), policy);
        }
    }

    public int applyDiscount(Member member, int price, DiscountPolicyType type) {
        DIscountPolicy policy = policyMap.getOrDefault(type, new NoDiscountPolicy());
        return policy.discount(member, price);
    }

}
