import com.sun.security.jgss.GSSUtil;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class SlotMachine {
    public static void main(String[] args){

        //Java Slot Machine

        Scanner scanner = new Scanner(System.in);

        //Declare variables

        double balance = 100;
        double betAmount;
        double payout;
        boolean isRunning = true;
        String choice;

        String[] row;


        //Display welcome message

        do {
            System.out.println("Welcome to the Slot Machine");
            System.out.println("Symbols: 💴 💵 💶 💷 💰");
            System.out.println();

            //Play if balance > 0

            System.out.printf("Your balance is: $%.3f\n", balance);

            // enter bet amount

            System.out.print("Enter a bet amount: ");
            betAmount = scanner.nextDouble();

            //verify if bet is greater than the balance and if bet is 0.

            if (betAmount > balance || betAmount <= 0) {
                while (betAmount > balance || betAmount <= 0) {
                    System.out.println("Invalid bet amount");
                    System.out.printf("Your balance is: $%.3f\n", balance);
                    System.out.print("Enter a bet amount: ");
                    betAmount = scanner.nextDouble();
                }
            } else {
                isRunning = true;
            }

            System.out.printf("You are betting: $%.3f\n", betAmount);
            System.out.println();

            // subtract bet from balance.

            balance = balance - betAmount;
            System.out.printf("Your new balance is: $%.3f\n", balance);

            // spin row

            System.out.println("Spinning...");
            row = spinRow();

            //print row

            printRow(row);

            //get payout

            payout = getPayout(row, betAmount);

            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance += payout;
            } else {
                System.out.println("Sorry you lost this round");
            }

            // ask to play again

            System.out.println("Do you want to play again? (yes/no) : ");
            scanner.nextLine();
            choice = scanner.nextLine().toLowerCase();

            if (choice.equals("yes")) {
                isRunning = true;
                balance = balance;
            } else if (choice.equals("no")) {
                System.out.println("Thank you for playing");
                isRunning = false;
            } else {
                System.out.println("Invalid response");
                continue;
            }
        }while(isRunning && balance > 0);



        //exit

        scanner.close();
    }
    static String[] spinRow(){

        String[] symbols = {"💴","💵","💶","💷","💰"};
        String[] row = new String[3];
        Random random = new Random();



        for (int i = 0; i < 3; i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }
    static void printRow(String[] row){
        System.out.println(" " + String.join(" | ", row));
    }
    static double getPayout(String[] row, double betAmount){

        if(row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "💴" -> betAmount * 3;
                case "💵" -> betAmount * 4;
                case "💶" -> betAmount * 5;
                case "💷" -> betAmount * 10;
                case "💰" -> betAmount * 20;
                default -> 0;

            };
        } else if(row[0].equals(row[1]) || row[0].equals(row[2])) {
            return switch (row[0]) {
                case "💴" -> betAmount * 1.5;
                case "💵" -> betAmount * 2;
                case "💶" -> betAmount * 2.5;
                case "💷" -> betAmount * 5;
                case "💰" -> betAmount * 10;
                default -> 0;
            };
        }
            else if(row[1].equals(row[2])) {
            return switch (row[1]) {
                case "💴" -> betAmount * 1.5;
                case "💵" -> betAmount * 2;
                case "💶" -> betAmount * 2.5;
                case "💷" -> betAmount * 5;
                case "💰" -> betAmount * 10;
                default -> 0;
            };
        }


        return 0;
    }
}
