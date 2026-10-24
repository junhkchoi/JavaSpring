package poly.ex1;

public class AnimalSoundMainRef {
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        animalSound(dog);
        animalSound(cat);
        animalSound(cow);
    }

    private static void animalSound(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");

    }
}
