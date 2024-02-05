package Week1_Curric.BankApp;

public class TestAccount {
    public static void main(String[] args) {
        Account obj1 = new Account(6828,"Sani",20000);

        obj1.display();
        obj1.checkBalance();
        obj1.deposit(5000);
        obj1.checkBalance();
        obj1.withdraw(30000);
    }

}
