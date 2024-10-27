public class ebook extends book {
    double fileSizeMB;
    public ebook(String title, String author, String isbn, double fileSizeMB){
        super(title, author, isbn);
        /////////////////////
        this.fileSizeMB = fileSizeMB;
    }
    public void displayInfo(){
        System.out.println(gettitle());
        System.out.println(getauthor());
        System.out.println(getisbn());
         System.out.println(this.fileSizeMB);
    }
}
