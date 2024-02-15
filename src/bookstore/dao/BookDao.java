package bookstore.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bookstore.model.Book;
import bookstore.services.BaseDao;

// Dao = Repository = query yang berhubungna dengan DataBase
public class BookDao implements BaseDao<Book, Integer> {

    // membuat data dummy dalam sebuah List
    // cara lain instance object : namaInterface namaVariabel = new namaClass();
    // contoh : List<Book> books = new ArrayList<>();
    ArrayList<Book> books = new ArrayList<>(Arrays.asList(
        new Book("buku1", "desc Buku 1", "pengarang1"),
        new Book("buku2", "desc Buku 2", "pengarang2")
    ));

    @Override
    public void save(Book data) {
        books.add(data);
    }

    @Override
    public List<Book> findALL() {
        return books;
    }

    @Override
    public Book findById(Integer id) {
        return books.get(id - 1); // mengakses salah satu elemen di arrayList, sama seperti mengakses array[index]
    }

    @Override
    public void update(Integer id, Book data) {
        books.set(id - 1, data);
    }

    @Override
    public void delete(Integer id) {
        books.remove(id - 1);
    }

}
