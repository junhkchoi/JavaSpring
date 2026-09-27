import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("숫자: ");
            int num = scanner.nextInt();
            
            if (num == 0) {
                System.out.println("누적 합: " + sum);
                break;
            } /* else {
                sum += num;
                continue;
                }
                */
               sum += num;
               
        }
    }    
}
