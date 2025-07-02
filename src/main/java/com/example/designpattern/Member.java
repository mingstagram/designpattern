package com.example.designpattern;

import com.example.designpattern.strategy.discount.Grade;

public class Member {
    private final String name;
    private final Grade grade;
    private final boolean coupon;

    public Member(String name, Grade grade, boolean coupon) {
        this.name = name;
        this.grade = grade;
        this.coupon = coupon;
    }

    public String getName() {
        return name;
    }

    public Grade getGrade() {
        return grade;
    }

    public boolean getCoupon() {
        return coupon;
    }
}