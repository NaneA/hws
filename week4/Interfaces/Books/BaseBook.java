package week4.Interfaces.Books;

public class BaseBook implements Book{
    protected int numOfPages;

    protected String author;
    protected String genre;


    protected BaseBook(int numOfPages, String author, String genre) {
        this.numOfPages = numOfPages;
        this.author = author;
        this.genre = genre;
    }

    @Override
    public void open(){
        System.out.println("Book is open");
    }

    @Override
    public void closed(){
        System.out.println("Book is closed");
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
