package exam;

public class AccountMain {
    public static void main(String[] args) {
        Account account1 = new Account("홍길동", 10000);
        Account account2 = new Account("김철수", 50000);

        account1.deposit(5000);
        account1.withdraw(3000);

        account2.deposit(10000);
        account2.withdraw(70000);

        account1.checkAccount();
        account2.checkAccount();

        System.out.println(Account.getAccountCount());
    }
}
