import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListOfMembers members_list = new ListOfMembers();
        Inventory inventory = new Inventory();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();





        Book book1 = new Book(random.nextInt(10000), "Atomic Habits", "Self development", true);
        Book book2 = new Book(random.nextInt(10000), "Ultralearning", "Self development", true);
        Book book3 = new Book(random.nextInt(10000), "Macbeth", "Literature", true);

        inventory.addBook(book1);
        inventory.addBook(book2);
        inventory.addBook(book3);

        boolean isTrue = true;
        System.out.println("Welcome to the library backend!");
        while (isTrue) {

            System.out.println("Select one of the following actions: ");
            System.out.println("- Register new member");
            System.out.println("- View all members");
            System.out.println("- Borrow a book");
            System.out.println("- Return book");
            System.out.println("- Browse books");
            System.out.println("- Exit");
            System.out.println();
            System.out.print("Choose one of the options: ");
            String userChoice = scanner.nextLine();
            System.out.println();

            if (userChoice.strip().toLowerCase().contains("register")){
                boolean confirmedMember = false;
                while(!confirmedMember) {
                    System.out.print("Enter name: ");
                    String newMemberName = scanner.nextLine();
                    ArrayList<String> booksBorrowed = new ArrayList<>();
                    int id = random.nextInt(10000);
                    System.out.println("Name: " + newMemberName + ", ID: " + id + ". You have borrowed " + booksBorrowed.toArray().length + " books");
                    System.out.println("This information can be changed later");
                    System.out.print("Confirm information (yes/no): ");
                    String userConfirmation = scanner.nextLine();
                    if (userConfirmation.equalsIgnoreCase("yes")) {
                        Member member = new Member(id, newMemberName, booksBorrowed);
                        members_list.addMember(member);
                        System.out.println("You have been added as a new member!");
                        confirmedMember = true;
                        System.out.println();
                        System.out.println();

                    }
                }


            }

            if (userChoice.strip().toLowerCase().contains("view")) {
                members_list.displayList();
                System.out.println();
                System.out.println();
            }

            if (userChoice.strip().toLowerCase().contains("borrow")) {
                System.out.print("Search by title: ");
                String bookTitle = scanner.nextLine();
                if (!inventory.searchByTitle(bookTitle)) {
                    System.out.println("Book not found");
                    continue;
                }
                System.out.println("Book is available");
                System.out.println("Enter name of member borrowing: ");
                String memberBorrowing = scanner.nextLine();
                if (!members_list.searchByName(memberBorrowing)) {
                    System.out.println("member does not exist");
                    continue;
                }
                System.out.println(memberBorrowing + " will borrow the book " + bookTitle + ".");
                System.out.println("Confirm borrowing (yes/no): ");
                String userConfirm = scanner.nextLine();
                if (userConfirm.equalsIgnoreCase("no")) {
                    System.out.println("Borrowing cancelled.");
                    continue;
                } else if (userConfirm.equalsIgnoreCase("yes") && members_list.borrowBook(memberBorrowing, bookTitle)) {
                    inventory.isBorrowed(bookTitle);
                    System.out.println(memberBorrowing + " has borrowed " + bookTitle + "!");
                }


            }

            if (userChoice.strip().toLowerCase().contains("return")) {
                System.out.print("Name of member returning a book: ");
                String memberReturning = scanner.nextLine();
                if (!members_list.searchByName(memberReturning)) {
                    System.out.println("member does not exist");
                    continue;
                }
                System.out.print("Book title: ");
                String returnedBook = scanner.nextLine();

                if (inventory.searchByTitle(returnedBook)) {
                    System.out.println("Book not found");
                    continue;
                }

                System.out.println(memberReturning + " will return " + returnedBook + ".");
                System.out.println("Confirm return (yes/no): ");
                String userConfirm = scanner.nextLine();
                if (userConfirm.equalsIgnoreCase("no")) {
                    System.out.println("Return cancelled.");
                    continue;
                }
                else if (userConfirm.equalsIgnoreCase("yes") && members_list.returnBook(memberReturning, returnedBook))
                {
                    inventory.isReturned(returnedBook);
                    System.out.println(memberReturning + " has returned " + returnedBook + "!");
                }




            }

            if (userChoice.strip().toLowerCase().contains("browse")) {
                inventory.displayInventory();
            }

            if (userChoice.strip().toLowerCase().contains("exit")) {
                System.out.println("Thank you for using the library system.");
                isTrue = false;
            }
        }



    }
}