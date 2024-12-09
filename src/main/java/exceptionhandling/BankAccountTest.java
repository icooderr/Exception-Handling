package exceptionhandling;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAmount(1000d);
        try {
            ba.withdraw(2000);
        }
        catch (InsufficientFundsException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Happy banking!");
        }
    }
}
