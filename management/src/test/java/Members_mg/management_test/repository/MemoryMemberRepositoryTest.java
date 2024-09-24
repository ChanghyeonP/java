package Members_mg.management_test.repository;

import Members_mg.management.domain.Member;
import Members_mg.management.repository.MemberRepository;
import Members_mg.management.repository.MemoryMemberRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();
    MemoryMemberRepository repo = new MemoryMemberRepository();

    @AfterEach
    public void afterEach() {
        repo.clearStore();
    }
    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");


        Member result = repository.findByName("spring1").get();
        assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll() {
        Member[] members = new Member[2];
        members[0] = new Member();
        members[0].setName("spring1");
        repository.save(members[0]);
        members[1] = new Member();
        members[1].setName("spring2");
        repository.save(members[1]);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }
}
