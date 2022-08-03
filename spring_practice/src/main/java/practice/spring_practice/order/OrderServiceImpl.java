package practice.spring_practice.order;

import practice.spring_practice.discount.DiscountPolicy;
import practice.spring_practice.discount.FixDiscountPolicy;
import practice.spring_practice.member.Member;
import practice.spring_practice.member.MemberRepository;
import practice.spring_practice.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {
        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
