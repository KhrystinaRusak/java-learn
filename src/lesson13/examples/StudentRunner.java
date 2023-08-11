package lesson13.examples;

import java.io.*;

public class StudentRunner {
    private static final String FILENAME = "student.txt";

    public static void main(String[] args) {
        Student student = new Student("Alex", 18, 'M');
        writeSerializedStudent(student);

    }

    private static void writeSerializedStudent(Student student) {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("student.txt"))) {
            output.writeObject(student);
        } catch (IOException e) {
            System.out.println("Cannot to write the file" + e.getMessage());
        }
    }

    private static Student readDeserialized() {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(FILENAME))) {
            Student student = (Student) input.readObject();
            return (Student) input.readObject();
        } catch (IOException e) {
            System.out.println("Cannot to write the file" + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
