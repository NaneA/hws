package JavaHomework.ProxyBook;

public class ProxyBook extends Book {
    private boolean flag;

    public ProxyBook(String author, String title) {
        super(author, title);
    }

    public boolean isLoaded() {
        return flag;
    }
    public void Load() throws Exception {
        if(flag){
            throw new Exception("Book is already loaded");
        }
        this.flag = true;
    }
    
    @Override
    public String getTitle() throws Exception {
       if(!flag){
           throw new Exception("Book is not loaded");
       }
      return super.getTitle();
    }
    @Override
    public String getAuthor() throws Exception {
        if(!flag){
            throw new Exception("Book is not loaded");
        }
        return super.getAuthor();
    }

}
