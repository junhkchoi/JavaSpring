package quiz.poly.payment;

import java.util.*;

public class PayScannMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        payService payService = new payService();

        while (true) {
            System.out.print("결제수단을 선택해주세요: ");
            String payOption = scanner.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료");
                return;
            }
            
            System.out.print("결제 금액을 입력하세요");
            int amount = scanner.nextInt();

            payService.processPay(payOption, amount); // payService가 클라이언트
            
        }
    }
}
