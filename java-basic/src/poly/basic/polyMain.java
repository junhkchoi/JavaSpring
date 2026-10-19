package poly.basic;

public class polyMain {
    public static void main(String[] args) {
        
        System.out.println("P -> P");
        Parent parent = new Parent();
        parent.parentMethod();

        System.out.println("C -> C");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        // 부모 타입 변수가 자식 인스턴스를 참조
        System.out.println("P => C");
        Parent poly = new Child();
        poly.parentMethod();
        // Child()를 생성하면 부모도 같이 메모리 상에 생기기 때문에 가능
        // 하지만 poly는 childMethod 메서드를 호출불가
        // poly가 Parent의 인스턴스이기 때문에 자식 메서드의 존재를 모른다
        // 예전에 그림 봐서 알겠지만 자식의 부모 방향으로 화살표였음
        // 부모에서 자식방향으로 내려가서 메서드 호출 불가

        // 부모 타입은 자신은 물론이고 모든 자식 타입을 참조할 수 있다
        // 부모가 자식의 자식의 자식의.. 를 참조

    }
}
