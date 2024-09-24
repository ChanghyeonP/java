package Members_mg.management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import Members_mg.management.domain.Member;

import java.util.Optional;

public interface SpringDataJapMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    @Override
    Optional<Member> findByName(String name);
}