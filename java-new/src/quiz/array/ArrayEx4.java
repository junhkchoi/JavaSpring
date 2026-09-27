package quiz.array;
import java.util.Scanner;
public class ArrayEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, average;
        
        System.out.print("입력할 숫자의 개수: ");
        int time = scanner.nextInt();
        int[] numbers = new int[time];

        System.out.println(time + "개의 숫자를 입력하세요:");
        for(int i = 0; i <= (time - 1); i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        
        System.out.println("입력한 정수의 합계:" + sum);
        System.out.print("입력한 정수의 평균:" + (double)sum/numbers.length);

    }
}
