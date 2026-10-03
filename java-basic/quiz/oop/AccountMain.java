package quiz.oop;

public class AccountMain {
    public static void main(String[] args) {
        Account ac1 = new Account();

        ac1.deposit(10000);
        ac1.withdraw(9000);
        ac1.withdraw(2000);
        System.out.println(ac1.balance);
    }
}
