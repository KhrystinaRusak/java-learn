package hometask9;

import hometask9.model.Book;
import hometask9.model.Reader;

public class LibraryRunner {
    private static int totalTimesBooks;
    Library[] library = new Library[4];

    Book book1 = new Book("Бесцветный цзуки", "Харуки Мураками");
    Book book2 = new Book("Великий Гетсби", "Фрэнсис Скотт Фицдзеральд");
    Book book3 = new Book("Охота на овец", "Харуки Мураками");
    Book book4 = new Book("Атлант расправил плечи", "Айн Рэйн");


    Reader[] reader = new Reader[4];
    Reader reader1 = new Reader("Груша Артем", "3");
    Reader reader2 = new Reader("Денисова Анна", "3");
    Reader reader3 = new Reader("Бондарчук Петр", "4");
    Reader reader4 = new Reader("Логан Светлана", "8");

    public static int takeTimesBooks() {
        return totalTimesBooks;
    }
}
