package bookstore.services.book;

import java.util.List;

import bookstore.dao.BookDao;
import bookstore.model.Book;

public class BookServiceImpl implements BookService {
    BookDao repo;

    public BookServiceImpl(BookDao repo) {
        this.repo = repo;
    }

    public BookServiceImpl() {
    }

    @Override
    public void createBook(Book book) {
        // req book akan disimpan pakai method savenya dao
        this.repo.save(book);
        System.out.println("book is addedd");
    }

    @Override
    public List<Book> showBooks() {
        return this.repo.findALL();
    }
}
