package quiz.array;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력해주세요: ");
        int numberOfStudents = scanner.nextInt();

        int[][] studentScores = new int[numberOfStudents][3];
        String[] subjects = {"국어: ", "수학: ", "영어: "};

        // 점수 입력
        for (int i = 0; i < studentScores.length; i++) {
            System.out.println((i + 1) + "번 학생의 점수");

            for (int j = 0; j < studentScores[i].length; j++) {
                System.out.print(subjects[j]);
                studentScores[i][j] = scanner.nextInt();
            }
        }

        // 총점 및 평균 출력
        for (int i = 0; i < studentScores.length; i++) {
            int sum = 0;

            for (int j = 0; j < studentScores[i].length; j++) {
                sum += studentScores[i][j];
            }

            System.out.println((i + 1) + "번 학생 총점: " + sum);
            System.out.println("평균: " + (double) sum / studentScores[i].length);
        }
    }
}