package lesson13.hometask13;

import java.io.*;

// Cоздать папку hometask13 внутри проекта.
// Создать файл joke.txt в папке hometask13, поместить в него анектод (можно найти в интернете).
// Проанализировать и записать в другой файл longest-word.txt самое длинное слово в анектоде.
public class joke {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("joke.txt");

            file.write("When I see lovers' names carved in a tree, I don't think it's sweet. I just think it's surprising how many people bring a knife on a date.");
            file.close();
            System.out.println("\nFile write done");
        } catch (Exception e) {
            System.err.println(e);
        }
        FileWriter fileX = null;
        try {
            fileX = new FileWriter("joke.txt");
            fileX.write("When I see lovers' names carved in a tree, I don't think it's sweet. I just think it's surprising how many people bring a knife on a date.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        File fileY = new File("copyText.txt");
        copyContent(fileX, fileY);
    }

    public static void copyContent(FileWriter fileX, File fileY) throws FileNotFoundException {
        throw Exception {
            String[] words = fileX.split(" ");
            String longestWord = "";
            int longestWordLength = 0;
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                int length = word.length();
                if (length > longestWordLength) {
                    longestWord = word;
                    longestWordLength = length;
                }
            }
            FileInputStream in = new FileInputStream(longestWord);
            FileOutputStream out = new FileOutputStream(fileY);
            try {
                int n;
                while ((n = in.read()) != -1) {
                    out.write(n);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } finally {
                if (in != null) {
                    in.close();
                }
            }
            System.out.println("File Copied");
        }
    }
}
*/