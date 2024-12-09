package exceptionhandling;

public class StackTraceExample {
    public static void main(String[] args) {
        try {
            level1();
        }
        catch (Exception e) {
            System.out.println("Exception class: " + e.getClass().getName());
            System.out.println("Message: " + e.getMessage());
            System.out.println("===== Stack Trace =====");
            StackTraceElement[] stackTrace = e.getStackTrace();
            for(StackTraceElement st: stackTrace) {
                System.out.println(st);
            }
        }
    }

    public static void level1() {
        level2();
    }

    public static void level2() {
        level3();
    }

    public static void level3() {
        int[] arr = new int[3];
        arr[5] = 30;
    }
}
