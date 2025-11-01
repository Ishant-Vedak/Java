import java.util.ArrayList;

public class Member {
    private int id;
    private String name;
    private ArrayList<String> booksBorrowed;

    public Member(int id, String name, ArrayList<String> booksBorrowed){
        this.id = id;
        this.name = name;
        this.booksBorrowed = booksBorrowed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getBooksBorrowed() {
        return booksBorrowed;
    }

    public void borrowBook(String bookTitle) {
        booksBorrowed.add(bookTitle);
    }

    public void returnBook(String bookTitle) {
        booksBorrowed.remove(bookTitle);
    }
}
