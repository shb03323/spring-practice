package practice.spring_practice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import practice.spring_practice.member.MemberRepository;
import practice.spring_practice.member.MemoryMemberRepository;

@Configuration
@ComponentScan(
        basePackages = "practice.spring_practice",
        // AppConfig 필터링
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Configuration.class)
)
public class AutoAppConfig {

    @Bean(name = "memoryMemberRepository")
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

}
