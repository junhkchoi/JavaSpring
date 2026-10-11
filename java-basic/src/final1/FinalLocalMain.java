package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        final int data1; 
        // final 변수는 최초 초기화이후 값을 수정불가능
        // 지역변수에 설정할 경우 최초 한번만 할당 가능
        data1 = 10;
        // data1 = 20; 수정 불가능 컴파일 에러

        final int data2 = 20;
        method(10);

    }
    static void method(final int parameter) {
        // parameter = 20; 컴파일 오류
    }
}
