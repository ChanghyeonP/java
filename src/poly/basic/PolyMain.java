package poly.basic;

public class PolyMain {
    public static void main(String[] args){
        Parent parent = new Parent();
        parent.parentMethod();

        Child child = new Child();
        child.childMethod();
        child.parentMethod();

        // 부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child();
        poly.parentMethod();
//  poly.childMethod(); // 자식을 담을 수는 있어도 타입은 부모 타입이기 때문에 자식의 기능을 호출할 수 없음, 캐스팅을 사용하면 사용 가능

// Child child1 = new Parent(); // 자식은 부모를 담을 수 없음
        Parent poly2 = new Grandson();

    }
}
