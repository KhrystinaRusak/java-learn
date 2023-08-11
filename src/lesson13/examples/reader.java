package lesson13.examples;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class reader {
    private static final String inputString = "Sitius, Altius, Fortius, The Olympic Game";

    public static void main(String[] args) {

        try (FileWriter writer = new FileWriter("tms2.txt")) {
            writer.append(inputString);
        } catch (IOException e) {
            System.out.println("Failed");
        }
        readFile();


    }

    private static void readFile() {
        try (FileReader reader = new FileReader("tms2.txt");) {
            int symbol = 0;
            boolean first = true;
            char previusSymbol = 0;
            while ((symbol = reader.read()) != -1) {
                if (first) {
                    System.out.print((char) symbol);
                } else {
                    first = false;
                }
                previusSymbol = (char) symbol;
            }
        } catch (IOException e) {
            System.out.println("Failed");
        }
    }

    private static void writeSomething() {

    }
}
