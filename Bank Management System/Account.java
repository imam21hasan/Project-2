package CSE_Project;

public abstract class Account implements BankOperations {

    final private String accountNumber;
    double balance;

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public abstract double calculateTransactionFee(double amount);

    @Override
    public void checkBalance() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance : " + balance + " Tk");
    }
}
