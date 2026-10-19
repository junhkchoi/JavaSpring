package extends1.super2;

public class ClassC extends ClassB {
    
    public ClassC() {
        // super(); ClassB에서 이미 생성자를 정의했기때문에 컴파일 오류
        super(20); // 상속관계에선 자식클래스의 생성자 첫줄에 반드시 super(..)을 호출해야한다
        // 단 기본생성자의 경우 생략가능 -> 자동으로 만들어줌
        
        System.out.println("ClassC 생성자");
    }
}
