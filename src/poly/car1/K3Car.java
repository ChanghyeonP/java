package poly.car1;

public class K3Car implements Car {
    @Override
    public void startEngine() {
        System.out.println("K3Car start Engine");
    }

    @Override
    public void offEngine() {
        System.out.println("K3Car off Engine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car pressAccelerator");
    }
}
