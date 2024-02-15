package bookstore.services.book;

import java.util.List;

import bookstore.model.Book;

public interface BookService {
    // CRUD
    void createBook(Book book);

    List<Book> showBooks();
}
