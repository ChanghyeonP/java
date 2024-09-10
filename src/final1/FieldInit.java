package final1;

public class FieldInit {
    static final int CONST_VALUE = 10; // static final의 변수명은 대문자 언더바로 = 관례
    final int value = 10; // 초기값이 이미 할당되면 생성자를 통해서 변경하지못함
    // final int는 값을 바꾸지 못하는 10의 값이 이미 할당되어버림, 모든 인스턴스가 같은 값을 사용하므로 인스턴스 변수로 사용하게 되면 인스턴스에서 같은 값을 사용하면서 메모리 낭비를 하게됨, 또한 중복 코드를 양성함
    // 그렇기 떄문에 static final int로 사용하게되면 메서드 영역에 생성되므로 메모리 최적화가 되며 인스턴스생성 할 때마다 메모리 낭비를 하지 않아도됨
    // 이러한 이유 때문에 final 초기화를 하는경우 static을 사용하는 것이 효과적임

    public FieldInit() {
//        this.value = 20; // 재할당 불가
    }
}