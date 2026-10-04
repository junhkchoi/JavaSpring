package access.b;

public class BankAccount {
    
    // 캡슐화를 할때엔 사용자에게 필요한 기능만 오픈하고 그렇지 않은
    // 기능은 숨긴다
    // 또 속성은 무조건 숨긴다.
    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // 입금 기능: public 메서드
    public void deposit(int amount) {
        if (isAmountVaild(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액이다.");
        }
    }

    private boolean isAmountVaild(int amount) {
        return amount > 0;
    }
}
