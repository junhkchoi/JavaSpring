package static2;

public class DecoData {
    
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        staticValue++; // 정적 변수 접근 가능 static -> static
        staticMethod(); // 정적 메서드 접근 가능 static -> static
        // 정적 메서드는 클래스에서 바로 접근하기 때문에 참조할 수 있는 주소가 없어서
        // 인스턴스 메서드 변수에 접근이 불가능 한것이다.

        // 다만 static메서드의 매개변수에 직접 참조값을 넣어주면 접근 가능.

        //instanceValue++; 인스턴스 변수 접근 불가능 static -> instance
       // instanceMethod(); 인스턴스 메서드 접근 불가능 static -> instance
    }

    public void instanceMethod() {
        instanceValue++;
        System.out.println("instanceMethod= " + instanceValue);
    }

    public static void staticMethod() {
        System.out.println("staticMethod= " + staticValue);
    }


}
