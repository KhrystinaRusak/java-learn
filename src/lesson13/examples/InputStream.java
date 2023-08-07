package lesson13.examples;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("example1.txt")) {
            byte[] context = fis.readAllBytes();
            for (byte el : context) {
                System.out.println((char) el);
            }
            int b = -1;
            while ((b = fis.read()) != -1) {
                System.out.print(b);
            }
        } catch (IOException e) {
            System.out.println("Failed");
        }
    }
}
