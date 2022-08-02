package practice.spring_practice.member;

public interface MemberRepository {

    void save(Member member);

    Member findById(Long memberId);
}
