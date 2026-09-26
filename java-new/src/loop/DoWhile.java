package loop;

public class DoWhile {
    public static void main(String[] args) {
        int i = 10;
        while (i < 3) {
            System.out.println(i); //조건이 거짓이므로 실행 X
        }

        do {
            System.out.println(i); //한번은 무조건 실행됨
        } while (i < 3);
    }
}
