package poly.ex6;

public class Dog extends AbstractAnimal implements Fly{
    @Override
    public void sound(){
        System.out.println("멍멍");
    }
    @Override
    public void fly(){
        System.out.println("not fly dog");
    }
}
