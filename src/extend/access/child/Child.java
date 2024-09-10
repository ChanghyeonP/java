package extend.access.child;

import extend.access.parent.Parent;
public class Child extends Parent{

    public void call() {
        publicValue = 1;
        protectedValue = 2;
//        defaultValue = 1; // 다른 패키지 접근 불가, 컴파일 에러
//        privateValue = 1; // 접근 불가, 컴파일 오류

        publicMethod();
        protectedMethod();
//        defaultMethod();
//        privateMethod();

        printParent();
    }
}