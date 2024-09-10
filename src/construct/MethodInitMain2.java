package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit member1 = new MemberInit();
        initMember(member1, "member1", 15, 90);


        MemberInit member2 = new MemberInit();
        initMember(member2, "member2", 18, 20);

        MemberInit[] members = {member1, member1};

        for (MemberInit member : members) {
            System.out.println("member = " + member);
        }
    }

    static void initMember(MemberInit member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;
    }
}

//main1 과 다르게 initmember메서드를 이용해서 초기화하여 하나로 캡슐화를 함
//main3 에서는 클래스 안에서 만든 초기화 매서드를 이용해서 캡슐화를 이용할 거임