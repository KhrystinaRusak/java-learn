package lesson13.examples;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class fileIntroduction {
    public static void main(String[] args) {
        File file1 = createFile("temp.txt");
        if (file1 != null) {
            file1.delete();
        }
        File file2 = createFile("temp.txt");
        if (file2 != null) {
            file2.delete();
        }
        File dir3 = createFile("C:\\Users\\37533\\Desktop\\java\\Examples");
        System.out.println(dir3.mkdir());
    }

    private static File createFile(String name) {
        File file = new File("temp.txt");
        if (!file.exists()) {
            try {
                boolean created = file.createNewFile();
            } catch (IOException e) {
                System.out.println("File wasn't created");
                return null;
            }
        }
        System.out.println(file.exists());
        System.out.println("Directory is exist " + file.isDirectory());
        file.delete();
        return file;
    }

    private static void printFileInfo(File file) {
        System.out.println("PARENT: " + file.getParentFile());
        System.out.println("NAME: " + file.getName());
        System.out.println("HIDDEN " + file.canWrite());
        System.out.println("LIST: " + Arrays.toString(file.listFiles()));
    }
}
