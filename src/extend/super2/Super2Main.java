package extend.super2;

public class Super2Main {

    public static void main(String[] args) {
        ClassC classC = new ClassC(); // 부모클래스부터 인스턴스를 생성하며 내려옴

        ClassB classB = new ClassB(10);
    }
}