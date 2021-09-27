package JavaHomework.ProxyBook;

public class Book {
    private String author;
    private String title;

    public String getAuthor() throws Exception {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() throws Exception {
        return title;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
