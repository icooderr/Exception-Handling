package exceptionhandling;

public class InsufficientFundsException extends RuntimeException{
    public InsufficientFundsException(double balance) {
        super("You have no sufficient funds to withdraw. " +
                "Current balance: " + balance);
    }
}
