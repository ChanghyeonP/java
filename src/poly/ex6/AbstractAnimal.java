package poly.ex6;

public abstract class AbstractAnimal {

    public abstract void sound();

    public void move(){
        System.out.println("AbstractAnimal.move");
    }
}
/*
* 추상 메서드는 자식 클래스에서 반드시 오버라이딩해야 하는 메서드를 말한다.
* 직접 인스턴스를 생성하지 못한다.
* 추상 클래스는 완전하지 않은 클래스입니다. 즉, 추상 메서드를 포함하고 있기 때문에, 해당 클래스 자체로는 사용할 수 없습니다.
추상 메서드는 선언만 되어 있고, 실제 구현이 없습니다. 구체적인 구현은 자식 클래스에서 제공해야 합니다.
자식 클래스가 추상 메서드를 오버라이딩하여 구체적인 구현을 제공해야만 해당 메서드를 사용할 수 있습니다.
*
* */