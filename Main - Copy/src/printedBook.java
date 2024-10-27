public class printedBook extends book {
    int numPages;
    public printedBook(String title, String author, String isbn, int numPages){
        super(title, author, isbn);
        ///////////////////////
        this.numPages = numPages;
    }
    public void displayInfo(){
        System.out.println(gettitle());
        System.out.println(getauthor());
        System.out.println(getisbn());
        System.out.println(this.numPages);
    }
}
