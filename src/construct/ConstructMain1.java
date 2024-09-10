package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        MemberConstruct member1 = new MemberConstruct("member1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("member2", 18, 70);
        //이건 생성자 생성자는 객체 생성과 동시에 초기화
        //클래스에스 메서드는 객체가 생성된 후 호출할 수 있으며 생성자 처럼 객체의 필드(변수를 초기화 하는데 사용가능)
        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct member : members) {
            System.out.println("member = " + member);
        }
    }
}