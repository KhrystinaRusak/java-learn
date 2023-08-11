package lesson14.model;

public class Person {
    private boolean alive;
    private int age;

    public Person(boolean alive, int age) {
        this.alive = alive;
        this.age = age;
    }

    //   @Override
//    public int hashCode() {
//        return Object.hash(alive, age);
//    }
}
