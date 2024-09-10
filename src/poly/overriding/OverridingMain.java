package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        Child child = new Child();
        System.out.println("child.value = " + child.value);
        child.method();

        Parent parent = new Parent();
        System.out.println("parent.value = " + parent.value);
        parent.method();

        Parent poly = new Child();
        System.out.println("poly.value = " + poly.value); // 변수는 오버라이딩 X
        poly.method(); // 메서드 오버라이딩, 오버라이딩 된 메서드는 항상 우선권을 가짐
    }
}
