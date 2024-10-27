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
