package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar  electicCar = new ElectricCar();
        electicCar.charge();
        electicCar.move();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();
    }
}
