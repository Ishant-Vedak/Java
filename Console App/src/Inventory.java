import java.util.ArrayList;

public class Inventory {

    private ArrayList<Book> books;

    public Inventory() {
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public void displayInventory(){
        for (Book book: books){
            System.out.println("Name: " + book.getTitle() + ", Genre: " + book.getGenre() + ", ID: " + book.getId() + ", Available: " + book.isAvailable());
        }
    }

    public boolean searchByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                if (book.isAvailable()) {
                    return true;
                }
            }
        }
        return false;
    }

    public void isBorrowed(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                    book.isBorrowed();
            }
        }
    }

    public void isReturned(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && !book.isAvailable()) {
                    book.isReturned();
            }
        }
    }
}
