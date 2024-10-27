
class book{
    private String title;
    private String author;
    private String isbn;
    public book(String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    public String gettitle(){
         return this.title;
    }
    public void settitle(String title){
        this.title = title;
    }
    public String getauthor(){
        return this.author;
    }
    public void setauthor(String author){
        this.author = author;
    }
    public String getisbn(){
        return this.isbn;
    }
    public void setisbn(String isbn){
        this.isbn = isbn;
    }
}
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

public class AudioBook extends book {
   int durationMinutes; 
    public AudioBook(String title, String author, String isbn, int durationMinutes){
        super(title, author, isbn);
        ////////////////////////
        this.durationMinutes = durationMinutes;
    }
    public void displayInfo(){
        System.out.println(gettitle());
        System.out.println(getauthor());
        System.out.println(getisbn());
        System.out.println(this.durationMinutes);
    }

    
}






public class LibraryTest  {
    public static void main(String[] args)  {
        ebook op1 = new ebook("Habits", "James Clear", "978-0735211292", 5.0);
        op1.displayInfo();
        System.out.println("---------------------------------------");
        AudioBook op2 = new AudioBook("Becoming", "Michelle Obama", "978-1524763138",  19);
        op2.displayInfo();
        System.out.println("---------------------------------------");
        printedBook op3 = new printedBook("Where the Crawdads Sing", "Delia Owens", "978-0735219090", 384);
        op3.displayInfo();
    
    }
}
