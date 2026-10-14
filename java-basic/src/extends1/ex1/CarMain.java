package extends1.ex1;

public class CarMain {
    public static void main(String[] args) {
        
        ElecticCar electicCar = new ElecticCar();
        electicCar.charge();
        electicCar.move();

        GasCar gasCar = new GasCar();
        gasCar.fillUp();
        gasCar.move();

        // 전기차든, 가솔린차든 자동차라는 상위 개념이 존재
        // 이런 경우 상속을 이용하면 좋다

    }
}
