package method;

public class MethodValue0 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        b = 10; // java에서 변수는 항상 값을 복사해서 대입한다
        System.out.println(a);
        System.out.println(b);
    }
}
