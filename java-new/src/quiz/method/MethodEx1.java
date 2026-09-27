package quiz.method;

public class MethodEx1 {
    public static void main(String[] args) {
        avg(1, 2, 3);
    }
    public static void avg(int a, int b, int c) {
        int sum = a + b + c;
        System.out.print("평균값: " + sum/3.0);
        return;
    }
}
