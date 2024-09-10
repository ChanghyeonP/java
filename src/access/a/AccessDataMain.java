package access.a;

public class AccessDataMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

        data.defaultField = 1;
        data.defaultMethod();

//        data.privateField = 1; // private은 접근 불가
//        data.privateMethod();
        // 내부 호출로 접근가능하긴함

        data.innerAccess();
    }
}
