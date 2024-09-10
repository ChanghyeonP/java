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

public class Upcating {
    public static void main(String[] args) {
        Animal animal = new Dog();  // 업캐스팅 (자동)

        // 다운캐스팅을 통해 Dog 객체로 변환
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;  // 명시적 다운캐스팅
            dog.guard();  // Dog 클래스의 guard() 메서드를 호출
        }
    }
}
/*
interface Payment {
    void processPayment();
}

class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment");
    }
}

class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing PayPal payment");
    }
}

public class PaymentProcessor {
    public static void main(String[] args) {
        // 업캐스팅: 다양한 결제 방법을 Payment 인터페이스로 처리
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();

        process(payment1);
        process(payment2);
    }

    public static void process(Payment payment) {
        payment.processPayment();  // 공통된 인터페이스 메서드 호출
    }
}
*실제 현업의 예시 같은 인터페이스에서  통합으로 사용하기 위해서
*/
