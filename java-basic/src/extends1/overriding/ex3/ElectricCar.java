package extends1.overriding.ex3;

public class ElectricCar extends Car{
    

    @Override  // 컴파일러가 move()를 제대로 오버라이딩 했는지 검사
    public void move() {
        System.out.println("전기차를 이동합니다");
    }

    public void charge() {
        System.out.println("전기 충전합니다");
    }

}
