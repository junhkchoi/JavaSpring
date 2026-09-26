package loop;

public class Break_Continue {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (true) {
            sum += i;
            if (sum > 10) {
                System.out.println(sum);
                break;
            }
            i++;
        }

        i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}
