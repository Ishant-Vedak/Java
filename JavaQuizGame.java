import java.util.Scanner;

public class JavaQuizGame {
    static String choice1, choice2, choice3,choice4;
    static String[][] options;
    public static void main(String[] args){
        //Java quiz game
        /*
        I am making five questions.
        The answers will be displayed in the form of a 2d array.
        The user has to choose an answer
        At the end of the five questions the final score will be displayed.
         */
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        int isCorrect = 0;
        int ChosenOption;

        while(isRunning) {
            System.out.println("Welcome to the Java Quiz Game");
            System.out.println("There will be five questions, and four possible answers.");
            System.out.println("Your goal is to get as many questions right as you can.");
            System.out.println();

            // Question 1
            setChoices("Java", "Javascript", "Python", "HTML");
            displayQuestion(1);
            System.out.println("What program is this running in?");
            System.out.print("Enter your answer: ");
            ChosenOption = scanner.nextInt();

            if (ChosenOption == 1) {
                System.out.println("Correct");
                isCorrect++;
            } else {
                System.out.println("Wrong");
            }

            // Question 2
            setChoices("Apple", "Banana", "Cherry", "Date");
            displayQuestion(2);
            System.out.println("Which of these is the name of a famous tech company");
            System.out.print("Enter your answer: ");
            ChosenOption = scanner.nextInt();
            if (ChosenOption == 1) {
                System.out.println("Correct");
                isCorrect++;
            } else {
                System.out.println("Wrong");
            }

            // Question 3
            setChoices("Red", "Green", "Blue", "Yellow");
            displayQuestion(3);
            System.out.println("What is the color of the output code?");
            System.out.print("Enter your answer: ");
            ChosenOption = scanner.nextInt();
            if (ChosenOption == 3) {
                System.out.println("Correct");
                isCorrect++;
            } else {
                System.out.println("Wrong");
            }

            //Question 4
            setChoices("2005", "2006", "2007", "2008");
            displayQuestion(4);
            System.out.println("What year was Ishant born?");
            System.out.print("Enter your answer: ");
            ChosenOption = scanner.nextInt();
            if (ChosenOption == 4) {
                System.out.println("Correct");
                isCorrect++;
            } else {
                System.out.println("Wrong");
            }

            //Question 5
            setChoices("AP Chem", "APUSH", "AP Bio", "AP Calc BC");
            displayQuestion(5);
            System.out.println("What AP am I NOT going to take?");
            System.out.print("Enter your answer: ");
            ChosenOption = scanner.nextInt();
            if (ChosenOption == 2) {
                System.out.println("Correct");
                isCorrect++;
            } else {
                System.out.println("Wrong");
            }

            System.out.println("You have completed the quiz");
            System.out.println("Your score is: " + isCorrect + "/5");
            System.out.println();

            System.out.println("Do you want to retake the quiz?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            ChosenOption = scanner.nextInt();
            if (ChosenOption == 1) {
                isRunning = true;
                isCorrect = 0;
            } else {
                isRunning = false;
                System.out.println("Thank you for playing the game.");
            }
        }



        scanner.close();
    }
    public static void setChoices(String c1, String c2, String c3, String c4){
        choice1 = c1;
        choice2 = c2;
        choice3 = c3;
        choice4 = c4;

        options = new String[][]{{"1. ", choice1}, {"2. ", choice2}, {"3. ", choice3}, {"4. ", choice4}};

    }
    public static void displayQuestion(int questionNumber) {
        System.out.println("Question " + questionNumber + ":");
        for (String[] option : options) {
            System.out.println(option[0] + option[1]);
        }
        System.out.println();
    }
}
