public class User {

    String username;
    String email;
    static int numOfUsers;

    User(String username){
        this.username = username;
        numOfUsers++;
    }

    static void showUsers(){
        System.out.println("There are " + numOfUsers + " users present");
    }

}
