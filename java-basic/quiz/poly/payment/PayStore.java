package quiz.poly.payment;

public abstract class PayStore {
    

    public static Pay findPay(String option) {
        Pay pay;
        
        if (option.equals("kakao")) {
           return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
