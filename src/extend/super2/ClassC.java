package extend.super2;

public class ClassC extends ClassB {

    public ClassC() {
//        super(); // ClassB는 기본생성자가 없으므로 컴파일에러 발생함
        super(10, 20);
        System.out.println("ClassC.ClassC");
    }
}