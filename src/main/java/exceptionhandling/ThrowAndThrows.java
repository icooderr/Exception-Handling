package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowAndThrows {
    public static void main(String[] args) throws FileNotFoundException {
        m1();
    }

    public static void m1() throws FileNotFoundException {
        m2();
    }

    public static void m2() throws FileNotFoundException {
        m3();
    }

    public static void m3() throws FileNotFoundException {
        throw new FileNotFoundException("File not found");
    }
}
