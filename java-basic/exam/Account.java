package exam;

public class Account {
    private static int accountCount = 0;
    private int accountNumber;
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
        accountCount++;
        accountNumber = accountCount + 1000; 
    }

    public void deposit(int money) {
        System.out.println("초기 잔액: " + balance);
        balance += money;
        System.out.println("입금: " + money);
        System.out.println("현재 잔액: " + balance);
        System.out.println();
    }

    public void withdraw(int money) {
        System.out.println("현재 잔액: " + balance);
        System.out.println("출금: " + money);
        if (money > balance) {
            System.out.println("출금할 수 없습니다");
            System.out.println();
            return;
        }
        balance -= money;
        System.out.println("현재 잔액: " + balance);
        System.out.println();
    }
    public void checkAccount() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("예금주: " + owner);
        System.out.println("잔액: " + balance);
        System.out.println();
    }
    public static int getAccountCount() {
        return Account.accountCount;
    }
}
