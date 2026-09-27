import java.util.Scanner;
public class ScannerWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("프로그램을 종료하고 싶으시면 exit을 입력해주세요");
        while (true) {
            System.out.print("문자열을 입력하시면 그대로 출력합니다: ");
            String str = scanner.nextLine();
            
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println(str);
            }
        }
    }
}
