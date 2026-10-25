package poly.ex1;

public class AnimalPolyMain2 {
    
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // Cat cat = new Cat();
        // Cow cow = new Cow();

        Animal[] animalArr = new Animal[] {new Dog(), new Cat(), new Cow()};
        
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");
    }
}
