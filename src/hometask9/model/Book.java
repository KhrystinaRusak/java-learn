package hometask9.model;

public class Book {
    String nameBook;
    int kolvoBook;
    short kolvoObjectClassBook;
    String authorBook;
    String nameLibrary;

    public Book(String string, String string2) {
        // TODO Auto-generated constructor stub
    }

    public void printUser() {
        System.out.println("Все книги принадлежат библиотеке: " + nameLibrary);
    }
}
