package CSE_Project;

class SavingsAccount extends Account {

    private final double tFee = 1.0;
    double preTrans;

    SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    @Override
    public double calculateTransactionFee(double amount) {
        return amount * (tFee / 100);
    }

    @Override
    public void deposit(double amount) {
        if (amount != 0) {
            balance += amount;
            preTrans = amount;
            System.out.println("Deposited " + amount + " Tk successful.");
        }
    }

    @Override
    public void withdraw(double wMoney) {

        if (wMoney != 0 && balance >= wMoney) {
            balance -= wMoney;
            preTrans = -wMoney;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Withdrawn " + wMoney + " Tk successful.");
        } else if (balance < wMoney) {
            System.out.println("Account balance insufficient.");
        }
    }

    @Override
    public void transactionHistory() {
        if (preTrans > 0) {
            System.out.println("Deposited " + preTrans);
        } else if (preTrans < 0) {
            System.out.println("Withdrown " + Math.abs(preTrans));
        } else {
            System.out.println("No transaction occured.");
        }
    }
}
