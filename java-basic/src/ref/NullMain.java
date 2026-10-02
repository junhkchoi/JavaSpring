package ref;

public class NullMain {
    public static void main(String[] args) {
        Data data = null;
        System.out.println("1. data = " + data);
        // 참조형 변수에는 항상 참조값이 들어가야하는데
        // 그것을 나중에 할당하고 싶을 때 null 대입
        data = new Data();
        System.out.println("2. data = " + data);

        data = null;
        System.out.println("3. data = " + data);
        // 아무도 참조하지 않는 객체는 가바지 컬렉션에 의해 
        // 메모리에서 제거된다. 
        
    }
}
