package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Finally {
    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("a.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Clean up: closing file reader");
            try {
                if(fileReader != null) {
                    fileReader.close();
                    System.out.println("File reader successfully closed");
                }
            }
            catch (IOException ex) {
                System.out.println("Error closing file reader");
                System.out.println(ex);
            }
        }
    }
}
