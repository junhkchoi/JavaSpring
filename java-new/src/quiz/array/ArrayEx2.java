package quiz.array;
import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for(int i = 0; i <= 4; i++) {
            numbers[i] = scanner.nextInt();
        }

        for (int i : numbers) {
            System.out.print(i + ", "); 
        }
    }
}
