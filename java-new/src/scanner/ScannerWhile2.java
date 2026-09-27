import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("enter the second number: ");
            int b = scanner.nextInt();
            if (a == 0 && b == 0) {
                System.out.println("shut down the program");
                break;
            } else {
                System.out.println("sum: " + (a+b));
            }


        }
    }
}
