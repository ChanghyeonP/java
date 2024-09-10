package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicMethod();

//        data.defaultField = 1; // 다른 패키지라 default도 접근 불가
//        data.defaultMethod();

//        data.privateField = 1; // private은 접근 불가
//        data.privateMethod();

        data.innerAccess();
    }
}