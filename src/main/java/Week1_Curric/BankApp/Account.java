package Week1_Curric.BankApp;

public class Account {
    private int accountNumber;
    private String accountName;
    private float amount;

    public Account(int accountNumber, String accountName, float amount) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
            accountName = accountName;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        amount = amount;
    }
    void deposit(float amt){
        amount = amount + amt;
        System.out.println(amt +" "+ "Deposited in your account, Balance:"+ amount);
    }
    void withdraw(float amt){
        if( amount > amt){
            System.out.println("Account Balance is Sufficient");
        }else{
            System.out.println("Account Balance is Insufficient, Deposit funds");
        }

    }

    void checkBalance(){
        System.out.println("Your balance is: "+ amount);
    }
    void display(){
        System.out.println("Account Number: "+ accountNumber+" "+ "Account Name:" +accountName+ " Account balance:"+ amount);
    }
}
