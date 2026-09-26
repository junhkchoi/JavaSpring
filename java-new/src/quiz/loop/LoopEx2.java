package quiz.loop;

public class LoopEx2 {
    public static void main(String[] args) {
        int num = 2, cnt = 1;

        System.out.println("while 버전");
        while (cnt <= 10) {
            System.out.println(num * cnt);
            cnt++;
        }

        System.out.println("for 버전");
        cnt = 1;
        for ( ; cnt <= 10 ; ) {
            System.out.println(num * cnt);
            cnt++;
        }
    }
}
