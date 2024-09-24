package Members_mg.management.service;

import Members_mg.management.domain.Member;
import Members_mg.management.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

 //스프링이 올라올때 스프링이 맴버서비스를 컨테이너에 등록함
// 커맨드 쉬프트 t = 테스트 만들기
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class MemberService {
    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    /*
    회원가입
    */
    public Long join(Member member) {
        //같은 이름이 있는 중복회원 X
        validateDuplicateMember(member);   //커맨드+옵션+m 으로 기능을 메소드로 자동 추출가능
        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()) //옵션+커맨드+v 로 자동으로 생성해서 객체? 생성해줌
                .ifPresent(m -> {
            throw new IllegalStateException("존재하는 회원입니다");
                });
    }

    public List<Member> findMembers() {
        return memberRepository.findAll();
    }
    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    } }