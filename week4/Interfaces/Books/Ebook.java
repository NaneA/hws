package week4.Interfaces.Books;

public class Ebook extends BaseBook {
    public  int size;

    public Ebook(int numOfPages, String author, String genre, int size) {
        super(numOfPages, author, genre);
        this.size = size;
    }

    public void BrowsePages(){
        System.out.println("browsing");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
