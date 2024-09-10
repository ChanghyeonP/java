package updowncating;

class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }

    public void guard() {
        System.out.println("Dog guards the house");
    }
}

public class Downcating {
    public static void main(String[] args) {
        Animal animal = new Dog();  // 업캐스팅 (자동)

        // 다운캐스팅을 통해 Dog 객체로 변환
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  // 명시적 다운캐스팅
            dog.guard();  // Dog 클래스의 guard() 메서드를 호출
        }
    }
}

