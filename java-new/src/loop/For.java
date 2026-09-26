package loop;

public class For {
    public static void main(String[] args) {
        /*
        int endNum = 20;
        for (int i = 1; i <= endNum; i++) {
            System.out.println(i);
        }
        */

        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            if (sum > 10) {
                System.out.println(sum);
                break;
            }

        }
    }
}
