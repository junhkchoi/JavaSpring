package quiz.loop;

public class LoopEx3 {
    public static void main(String[] args) {
        
        System.out.println("while 버전");
        int max = 100, sum = 0;
        while (max > 0) {
            sum += max;
            max--;
        }  
        System.out.println(sum);

        System.out.println("for 버전");
        max = 100;
        sum = 0;
        for ( ; max > 0 ; ) {
            sum += max;
            max--;
        }
        System.out.println(sum);
    }
}
