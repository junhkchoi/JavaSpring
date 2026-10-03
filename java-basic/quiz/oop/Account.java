package quiz.oop;

public class Account {
    int balance;

    void deposit(int amount) {
        balance += amount;
        System.out.println("입금 후 잔액: " + balance); 
    }

    void withdraw(int amount) {
        if (balance - amount < 0) {
            System.out.println("잔액이 부족합니다");
        } else {
            balance -= amount;
            System.out.println("출금 후 잔액: " + balance);
        }
    }
}
