package lesson13.examples;

import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private int age;
    private char sex;

    public Student(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

}
