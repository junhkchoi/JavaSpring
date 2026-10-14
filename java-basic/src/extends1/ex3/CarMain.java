package extends1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar  electicCar = new ElectricCar();
        electicCar.charge();
        electicCar.move();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.fillH2o();
        hydrogenCar.move();
    }
}
