package practice.spring_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import practice.spring_practice.discount.DiscountPolicy;
import practice.spring_practice.discount.FixDiscountPolicy;
import practice.spring_practice.discount.RateDiscountPolicy;
import practice.spring_practice.member.MemberRepository;
import practice.spring_practice.member.MemberService;
import practice.spring_practice.member.MemberServiceImpl;
import practice.spring_practice.member.MemoryMemberRepository;
import practice.spring_practice.order.OrderService;
import practice.spring_practice.order.OrderServiceImpl;

@Configuration
public class AppConfig {

    @Bean
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public DiscountPolicy discountPolicy() {
        return new RateDiscountPolicy();
    }

    @Bean
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }
}
