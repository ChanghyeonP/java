package extend.ex1;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar(); // ElectricCar와 Car를 포함해서 인스턴스를 생성함 -> 참조값 x001 하나에 ElectricCar, Car 두가지 클래스 정보가 공존한다는 의미임, 부모클래스 정보도 함께 생성됨
        electricCar.move(); // 부모 공간 move()와
        electricCar.charge(); // 자식 공간 charge()가 서로 구분되어 있음
        // 메서드를 호출할 때 기준은 호출하는 변수의 타입(클래스)을 기준으로 선택함
        System.out.println("-----------------");
        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.gaschange();
    }
}

