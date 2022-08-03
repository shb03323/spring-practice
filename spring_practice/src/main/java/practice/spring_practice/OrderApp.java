package practice.spring_practice;

import practice.spring_practice.member.Grade;
import practice.spring_practice.member.Member;
import practice.spring_practice.member.MemberService;
import practice.spring_practice.member.MemberServiceImpl;
import practice.spring_practice.order.Order;
import practice.spring_practice.order.OrderService;
import practice.spring_practice.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
    }
}
