package poly.intetface1;

import poly.abstract1.AbstractAnimal;

public class InterfaceMain {
    
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);

        moveAnimal(dog);
        moveAnimal(cat);

    }

    private static void soundAnimal(InterfaceAnimal animal) {
        animal.sound();
    }

    private static void moveAnimal(InterfaceAnimal animal) {
        animal.move();
    }
}
