package hometask9.model;

public class Reader {
    private String nameReaderLibrary;
    private int numberReaderLibrary;

    public Reader(String nameBook, String kolvoObjectClassBook) {

    }

    public void takeBook(int kolvoBook) {
        System.out.println("Петров В. В. взял " + kolvoBook + " книги");
    }

    public void takeBook(String nameBook) {
        System.out.println("Петров В. В. взял книги: " + nameBook);
    }

    public void takeBook(short kolvoObjectClassBook) {
        System.out.println("Петров В. В. взял книги: " + kolvoObjectClassBook);
    }

    public String getNameReaderLibrary() {
        return nameReaderLibrary;
    }

    public void setNameReaderLibrary(String nameReaderLibrary) {
        this.nameReaderLibrary = nameReaderLibrary;
    }

    public int getNumberReaderLibrary() {
        return numberReaderLibrary;
    }

    public void setNumberReaderLibrary(int numberReaderLibrary) {
        this.numberReaderLibrary = numberReaderLibrary;
    }

    public static void kolvoBook(int kolvoBook) {
        kolvoBook++;
    }
}

