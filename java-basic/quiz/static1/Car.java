package quiz.static1;

public class Car {
    private String carName;
    private static int carCount;

    public Car(String carName) {
        this.carName = carName;
        carCount++;
    }

    static void showTotalCars() {
        System.out.println(carCount);
    }
}
