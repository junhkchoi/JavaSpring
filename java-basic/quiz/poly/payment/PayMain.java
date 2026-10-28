package quiz.poly.payment;

public class PayMain {
    

    public static void main(String[] args) {
        payService payService = new payService();
        
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1); // payService가 클라이언트
        

        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}
