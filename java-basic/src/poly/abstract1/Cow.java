package poly.abstract1;

public class Cow extends AbstractAnimal{
    
    @Override 
    public void sound() {
        System.out.println("음머");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
