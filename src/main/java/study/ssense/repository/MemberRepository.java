package study.ssense.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import study.ssense.entity.member.Member;

public interface MemberRepository extends JpaRepository<Member, Long> {

    Boolean existsByUsername(String username);

    Member findByUsername(String username);
}
