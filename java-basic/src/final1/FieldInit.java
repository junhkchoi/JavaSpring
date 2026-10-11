package final1;

public class FieldInit {
    
    final int value = 10;
    // final을 필드에서 초기화하면 모든 인스턴스에 10으로 초기화 된다.
    // 힙 영역의 객체에서 중복이 발생하기때문에 더 좋은 방법은
    // static을 붙여서 공유하는 것이다
    static final int CONST_VALUE = 10;
    // 이러한 이유로 final + 필드 초기화 => static final이 효과적

    public FieldInit(int value) {
        // this.value = value; 이미 멤버 변수에 초기화를 했기 때문에 파라미터로
        // 값 넣는 거 불가능 
    }
}
