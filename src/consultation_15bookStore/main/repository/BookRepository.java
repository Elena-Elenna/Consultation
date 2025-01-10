package consultation_15bookStore.main.repository;

import consultation_15bookStore.main.model.Book;

import java.util.ArrayList;

public class BookRepository {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

}
