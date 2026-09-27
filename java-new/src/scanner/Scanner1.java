import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("문자열을 입력하세요");
        String str = scanner.nextLine(); //입력을 String으로 받는다
        System.out.println("입력한 문자열: " + str);

        System.out.print("숫자를 입력하세요: ");
        int intValue = scanner.nextInt();
        System.out.println("입력한 숫자: " + intValue);

    }
}
