package practice.spring_practice;

import practice.spring_practice.discount.FixDiscountPolicy;
import practice.spring_practice.member.MemberService;
import practice.spring_practice.member.MemberServiceImpl;
import practice.spring_practice.member.MemoryMemberRepository;
import practice.spring_practice.order.OrderService;
import practice.spring_practice.order.OrderServiceImpl;

public class AppConfig {

    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new MemoryMemberRepository(), new FixDiscountPolicy());
    }
}
