public class Bank2 {

    public static void main(String[] args) {
        SavingAccount SA = new SavingAccount(5000, 0.5);
        SA.deposit(500);
        System.out.println("Current balance: " + SA.getBalance());
        SA.withdraw(200);
        System.out.println("Current balance: " + SA.getBalance());
        // double interest = SA.calculateInterest();
        System.out.println("Interest Earned: " + SA.calculateInterest());
    }
}

interface Account {
    void deposit(double amount);

    void withdraw(double amount);

    double getBalance();

}

interface Interest {
    double calculateInterest();
}

class SavingAccount implements Account,
        Interest {
    private double balance;
    private double interestRate;

    public SavingAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }
}
