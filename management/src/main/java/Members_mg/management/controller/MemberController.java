package Members_mg.management.controller;

import Members_mg.management.domain.Member;
import Members_mg.management.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    //여러 컨트롤러가 맴버서비스를 가져쓸수있음 new를 쓰면 그래서
    //스프링 컨테이너에서 등록해서 씀
    private MemberService memberService;
    //생성자 주입을 권장
    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;

    }

    @GetMapping(value = "/members/new")
    public String createForm(){
        return "members/createMemberForm";
    }
//    @Autowired //생성자는 커맨드+n. autowired = 맴버서비스를 스프링 컨터네이서 가져다 씀
//    public MemberController(MemberService memberService) {
//        this.memberService = memberService;
//    }
//}
    @PostMapping(value = "/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping( value="/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }

}