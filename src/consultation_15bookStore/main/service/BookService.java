package consultation_15bookStore.main.service;

import consultation_15bookStore.main.model.Book;
import consultation_15bookStore.main.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook(Book book) {
        bookRepository.addBook(book);

    }
}
