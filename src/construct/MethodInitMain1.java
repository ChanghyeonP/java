package construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit[] memberInits = new MemberInit[2];
        memberInits[0] = new MemberInit();
        memberInits[1] = new MemberInit();

        memberInits[0].name = "parkchanghyeon";
        memberInits[0].age = 10;
        memberInits[0].grade = 3;

        memberInits[1].name = "Junuri";
        memberInits[1].age = 10;
        memberInits[1].grade = 3;

        for (MemberInit memberInit : memberInits) {
            System.out.println("member =" + memberInit);
        }

    }
}
