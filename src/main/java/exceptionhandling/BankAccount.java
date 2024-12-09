package exceptionhandling;

public class BankAccount {
    private Double balance;

    public Double getAmount() {
        return balance;
    }

    public void setAmount(Double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if(amount > balance) {
            throw new InsufficientFundsException(balance);
        }
        balance -= amount;
        System.out.println("Amount " + amount + " successfully withdrawn");
    }
}
