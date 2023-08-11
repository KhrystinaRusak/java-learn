package lesson13.examples;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStringIntroduction {
    public static void main(String[] args) {
        String str = "I love native methods";
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("example.txt");
            fos.write(str.getBytes());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    System.out.println("");
                }
            }
        }

        try (FileOutputStream fos1 = new FileOutputStream("example.txt")) {
            fos1.write(str.getBytes());
        } catch (IOException e) {
            System.out.println("Failed");
        }
    }
}
