package poly.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent poly = new Child();
        System.out.println("poly");
        call(poly);

        System.out.println("parent");
        Parent parent = new Parent();
        call(parent);
    }

    private static void call(Parent parent) {
        parent.parentMethod();

        if (parent instanceof Child child) { // 자바 16부터 instanceof에서 바로 변수를 대입가능함
            System.out.println("child instance");
            child.childMethod();
        }
    }
}