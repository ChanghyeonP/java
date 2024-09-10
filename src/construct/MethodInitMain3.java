package construct;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class MethodInitMain3 {
    public static void main(String[] args){
        MemberInit m1 = new MemberInit();
        m1.initMember("park", 24, 3 );
        MemberInit m2 = new MemberInit();
        m2.initMember("ju", 21, 2);

        MemberInit[] members = {m1, m2};
        for(MemberInit member : members){
            System.out.println("member =" + member);
        }
    }
}
