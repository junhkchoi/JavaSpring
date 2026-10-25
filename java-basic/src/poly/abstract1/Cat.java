package poly.abstract1;

public class Cat extends AbstractAnimal {
    
    @Override 
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("냥이 이동");
    }
}
