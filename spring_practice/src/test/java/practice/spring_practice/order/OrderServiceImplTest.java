package practice.spring_practice.order;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import practice.spring_practice.discount.FixDiscountPolicy;
import practice.spring_practice.member.Grade;
import practice.spring_practice.member.Member;
import practice.spring_practice.member.MemoryMemberRepository;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceImplTest {

    @Test
    void createOrder() {
        MemoryMemberRepository memberRepository = new MemoryMemberRepository();
        memberRepository.save(new Member(1L, "name", Grade.VIP));
        OrderServiceImpl orderService = new OrderServiceImpl(memberRepository, new FixDiscountPolicy());
        Order order = orderService.createOrder(1L, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}