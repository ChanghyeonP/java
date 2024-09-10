package poly.car1;

public class Drive {
    private Car car;

    public void setCar(Car car){
        System.out.println("setting car");
        this.car = car;
    }

    public void drive(){
        System.out.println("drving car");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
