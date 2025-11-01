import java.util.ArrayList;

public class ListOfMembers {
    private ArrayList<Member> members;

    public ListOfMembers(){
        members = new ArrayList<>();
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void displayList(){
        if (members.isEmpty()) {
            System.out.println("No members yet!");
        }
        for (Member member : members){
            if (member.getBooksBorrowed().isEmpty()) {
                System.out.println("Name: " + member.getName() + ", ID: " + member.getId() + ", Books Borrowed: None");
            } else {
                System.out.println("Name: " + member.getName() + ", ID: " + member.getId() + ", Books Borrowed: " + member.getBooksBorrowed() );
            }



        }
    }

    public Member accessIndex(int index) {
        return members.get(index);
    }

    public boolean searchByName(String name) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                    return true;
            }
        }
        return false;
    }

    public boolean borrowBook(String name, String bookTitle) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                member.borrowBook(bookTitle);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String name, String bookTitle) {
        for (Member member : members) {
            if (member.getName().equals(name)) {
                member.returnBook(bookTitle);
                return true;
            }
        }
        return false;
    }
}

