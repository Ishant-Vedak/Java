public class Book {
    private int id;
    private String title;
    private String genre;
    private boolean isAvailable;

    public Book(int id, String title, String genre, boolean isAvailable){
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.isAvailable = isAvailable;
    }

    public  int getId(){
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void isBorrowed(){
        isAvailable = false;
    }

    public void isReturned(){
        isAvailable =true;
    }
}
