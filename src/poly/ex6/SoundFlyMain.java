package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args){
        Dog dog = new Dog();
        Bird bird = new Bird();
        Chicken chicken = new Chicken();

        soundAnimal(bird);
        soundAnimal(chicken);
        soundAnimal(dog);

        flyAnimal(bird);
        flyAnimal(chicken);
        flyAnimal(dog);
    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("sound start");
        animal.sound();
        System.out.println("sound end");
    }

    private static void flyAnimal(Fly fly){
        System.out.println("fly start");
        fly.fly();
        System.out.println("fly end");
    }
}
