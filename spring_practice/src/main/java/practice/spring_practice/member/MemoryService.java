package practice.spring_practice.member;

public interface MemoryService {

    void join(Member member);

    Member findMember(Long memberId);
}
