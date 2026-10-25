package poly.mix;

public class MixMain {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Bird bird = new Bird();

        soundAnimal(dog);

        flyAnimal(bird);
        bird.move();

    }

    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    private static void flyAnimal(Fly fly) {
        fly.fly();
    }
}
