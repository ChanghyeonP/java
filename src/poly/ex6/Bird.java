package poly.ex6;

public class Bird extends AbstractAnimal implements Fly{
    @Override
    public void fly(){
        System.out.println("Bird flying");
    }
    @Override
    public void sound(){
        System.out.println("짹 짹");
    }
}
