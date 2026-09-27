package method;

public class Method1 {
    public static void main(String[] args) {
        int sum1 = add(5, 10);
    }
    public static int add(int a, int b) {
        printing();
        System.out.println(a + "+" + b  +"연산수행");
        int sum = a + b;
        return sum;
    }
    public static void printing() {
        System.out.print("프로그램을 실행합니다.");
        return;
    }
}