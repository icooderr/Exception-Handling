package exceptionhandling;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        try(FileReader fileReader = new FileReader("a.txt")) {
            System.out.println("File reader will auto close in try-resource as it" +
                    "is implementing AutoClosable interface");
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
