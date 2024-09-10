package poly.ex6;

public class Chicken extends AbstractAnimal implements Fly {
    @Override
    public void sound(){
        System.out.println("꼬끼옥");
    }
    @Override
    public void fly(){
        System.out.println("Chicken Not Fly");
    }


}
