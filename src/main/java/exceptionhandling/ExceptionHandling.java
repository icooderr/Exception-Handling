package exceptionhandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        int[] numerator = {10, 32, 20, 45, 68};
        int[] denominator = {2, 4, 0, 5, 4};

        for(int i = 0; i < 10; i++) {
            try {
                int result = divide(numerator[i], denominator[i]);
                System.out.println(result);
            }
            catch (IndexOutOfBoundsException ex) {
                System.out.println(ex);
            }
        }
        System.out.println("Divide successfully completed");
    }

    private static int divide(int num1, int num2) {
        try {
            return num1 / num2;
        }
        catch (ArithmeticException | IndexOutOfBoundsException ex) {
            System.out.println(ex);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        return -1;
    }
}
