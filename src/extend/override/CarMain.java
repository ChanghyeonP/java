package extend.override;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        Car electricCar2 = new ElectricCar();
        electricCar2.move(); // == electricCar.move()
//        electricCar2.charge(); // Car 클래스에 charge 메서드가 존재하지 않아 사용 불가능

        GasCar gasCar = new GasCar();
        gasCar.move();

    }
}

