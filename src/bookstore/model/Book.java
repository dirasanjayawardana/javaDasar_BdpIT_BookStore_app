package bookstore.model;

public class Book {
    // atribute
    private String title;
    private String desc;
    private String author;

    // constructor
    public Book() {

    }

    public Book(String title, String desc, String author) {
        this.title = title;
        this.desc = desc;
        this.author = author;
    }

    // setter getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //override toString()
    @Override
    public String toString() {
        return "Book [title=" + title + ", desc=" + desc + ", author=" + author + "]";
    }

}
