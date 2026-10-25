package poly.abstract1;

public class AbstarctMain {
    public static void main(String[] args) {
        
        // AbstractAnimal animal = new AbstractAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

        moveAnimal(dog);
        moveAnimal(cat);
        moveAnimal(cow);


    }
    private static void soundAnimal(AbstractAnimal animal) {
        animal.sound();
    }

    private static void moveAnimal(AbstractAnimal animal) {
        animal.move();
    }
    
}
