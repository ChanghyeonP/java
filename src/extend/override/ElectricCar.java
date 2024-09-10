package extend.override;

public class ElectricCar extends Car { // ElectricCar -> Car

    @Override // 이름과 리턴 타입을 부모타입 등을 정확히 맞추면 주석은 없어도 됨, 하지만 사용하게 되면 부모의 기능의 오버라이딩이 잘못되었을때 컴파일 에러가 발생함
    public void move() { // 오버라이딩 = 부모의 기능을 자식이 새로 재정의하는 것
        System.out.println("fast move");
    }

    public void charge() {
        System.out.println("charge");
    }
}