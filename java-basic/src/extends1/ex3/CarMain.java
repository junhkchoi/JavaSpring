package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar  electicCar = new ElectricCar();
        electicCar.move();

        GasCar gasCar = new GasCar();
        gasCar.move();
    }
}
