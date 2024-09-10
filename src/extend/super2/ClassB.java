package extend.super2;

public class ClassB extends ClassA{

    public ClassB(int a) {
//        super(); // 기본 생성자는 생략 가능
        this(a, 0); // 다른 생성자에 super가 있으므로 super(기본생성자가아닌)를 생략할 수 있음
        System.out.println("ClassB.ClassB");
        System.out.println("a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB.ClassB");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
