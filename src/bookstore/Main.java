package bookstore;

import java.util.List;
import java.util.Scanner;

import bookstore.dao.BookDao;
import bookstore.model.Book;
import bookstore.services.book.BookService;
import bookstore.services.book.BookServiceImpl;

public class Main {
    static BookDao bookRepo = new BookDao();
    static BookService bookService = new BookServiceImpl(bookRepo);

    private static void menuUtama() {
        System.out.println("""
                ==== Toko Buku ====
                1. Tambah Buku
                2. Lihat Daftar Buku
                """);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String selected = "";
        Boolean retry = true;

        try {
            while (retry) {
                menuUtama();
                System.out.print("Select menu: ");
                selected = scanner.nextLine();

                switch (selected) {
                    case "1":
                        System.out.println("==== Tambah Buku ====");

                        System.out.print("Input judul: ");
                        String title = scanner.nextLine();
                        System.out.print("Input deskripsi: ");
                        String desc = scanner.nextLine();
                        System.out.print("Input pengarang: ");
                        String author = scanner.nextLine();

                        Book b = new Book(title, desc, author);
                        bookService.createBook(b);

                        break;

                    case "2":
                        System.out.println("==== Lihat Daftar Buku ====");

                        List<Book> results = bookService.showBooks();
                        int index = 1;
                        for (Book item : results) {
                            System.out.println((index++) +". " + item);
                        }

                        break;

                    default:
                        System.out.println("Input invalid!");

                        break;
                }

                while (true) {
                    System.out.print("Ingin keluar program?(y/n): ");
                    String answer = scanner.nextLine();
                    if (answer.equalsIgnoreCase("y")) {
                        retry = false;
                        break;
                    } else if (answer.equalsIgnoreCase("n")) {
                        retry = true;
                        break;
                    } else {
                        System.out.println("Input salah");
                        continue;
                    }
                }
            }

            System.out.println("Program selesai...");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
