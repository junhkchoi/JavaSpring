package quiz.method;

public class MethodEx2 {
    public static void main(String[] args) {
        msg(3, "hello");
    }
    public static void msg(int cnt, String message) {
        for (int i = 1; i <= cnt; i++) {
            System.out.println(message);
        }
    }
}
