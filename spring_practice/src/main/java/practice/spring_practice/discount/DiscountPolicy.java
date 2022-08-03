package practice.spring_practice.discount;

import practice.spring_practice.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
