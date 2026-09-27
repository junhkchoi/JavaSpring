package quiz.array;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("입력할 숫자의 개수: ");
        int cnt = scanner.nextInt();
        int[] numbers = new int[cnt];

        System.out.println(cnt + "개의 숫자를 입력하세요:");
        for (int i = 0; i < cnt ; i++) {
            numbers[i] = scanner.nextInt();
        }
        int minNum, maxNum;
        minNum = maxNum = numbers[0];

        for (int i : numbers) {
            if (i < minNum) {
                minNum = i;
            }
            if (i > maxNum) {
                maxNum = i;
            }
        }
        System.out.println("최소: " + minNum);
        System.out.println("최대: " + maxNum);
        
    }
}
