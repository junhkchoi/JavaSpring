package poly.intetface1;

public class Cat implements InterfaceAnimal{
    
    @Override
    public void sound() {
        System.out.println("야옹");
    }

    @Override
    public void move() {
        System.out.println("냥이 이동");

    }
}
