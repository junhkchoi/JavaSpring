package poly.basic;

public class CastingMain {
    public static void main(String[] args) {
     // 부모 변수가 자식 인스턴스 참조
    Parent poly = new Child();
    // 부모의 기능은 호출 가능하나, 자식의 기능 호출 불가
    //poly.childMethod;

        // 다운 캐스팅 (P -> C)
        Child child = (Child) poly;
        child.childMethod();
       
    }
}
