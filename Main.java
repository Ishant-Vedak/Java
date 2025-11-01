import org.w3c.dom.ls.LSOutput;

import javax.swing.text.html.parser.TagElement;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        // This is a comment in my first Java program.

        /* This
         is
        * a
        * multi line
        * comment */


        // This is how to accept user input, using the scanner:

        /*Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your coins in Darkrise (in thousands): ");
        double coins = scanner.nextDouble();

        System.out.print("Are you level 150? (true/false): ");
        boolean is150 = scanner.nextBoolean();

        System.out.println("Hello " + name );
        System.out.println("Your age is: " + age + " years old");
        System.out.println("You have " + coins + "k coins in Darkrise");

        if(is150){
            System.out.println("Good job!");
        }
        else{
            System.out.println("Get to Grinding!");
        }


         Sometimes the code might not work properly. Suppose I have an int
         and then a line in the scanner. Sometimes when there is a number, and
         then enter is pressed, theres still a new line character because enter
         was pressed. One way to clear this is using:
         scanner.nextLine();
        scanner.close(); */


        /* if statements

        Scanner scanner = new Scanner(System.in);

        double age;
        String name;
        boolean ChristmasSet;

        System.out.print("what is your name? ");
        name = scanner.nextLine();

        System.out.print("What is your age? ");
        age = scanner.nextDouble();

        System.out.print("Do you have the full Christmas set? (true/false) ");
        ChristmasSet = scanner.nextBoolean();

        //Group 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name");
        }
        else{
            System.out.println("Hello " + name);
        }

        //Group 2
        if(age >= 65){
            System.out.println("You are a senior");
        }else if(age >= 18){
            System.out.println("You are an adult");
        } else if (13 > age){
            System.out.println("You are a child");
        } else{
            System.out.println("You are a teenager");
        }

        //Group 3

        if (ChristmasSet) {
            System.out.println("You have the full Christmas set");
        } else {
            System.out.println("Get back to grinding");
        }

        scanner.close(); */

        /*  // RANDOM NUMBERS:
        Random random = new Random();

        int number1;
        double number2;
        boolean isHeads;

        number1 = random.nextInt(1, 53);
        number2 = random.nextDouble(1, 7);
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(isHeads);

        //or

        if (isHeads){
            System.out.println("Heads");
        }else{
            System.out.println("Tails");
        }
        */

        //Other Math Operators
        /* System.out.println(Math.PI);
        //System.out.println(Math.E);


        double result;

        /*result = Math.pow(2,5);
        * First number is the base, second number is the exponent.
        // result = Math.abs(-5);
        //result = Math.sqrt(3);
        //result = Math.round(3.345234);
        // result = Math.ceil(3.14);
        // result = Math.floor(3.99);
        //result = Math.max(69, 420);
        // result = Math.min(69, 420);
        //System.out.println(result); */


        //Hypotenuse of a triangle.

        /* Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;
        String unit;



        System.out.print("What units are the sides of your triangle in? : ");
        unit = scanner.nextLine();

        System.out.print("What is the length of side 'a'? : ");
        a = scanner.nextDouble();

        System.out.print("What is the length of side 'b'? : ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The lengths of the first two sides of your triangle are "
         + a + unit + " and " + b + unit);
        System.out.println("So, the length of the hypotenuse, c, is " + c + unit);

        scanner.close(); */


        // Using printf()

        /* String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello, %s\n", name);
        System.out.printf("Your name starts with the letter %c\n", firstLetter);
        System.out.printf("Your age is %d years old\n", age);
        System.out.printf("You are %.1f inches tall\n", height);

        The .1 before the f shows that only 1 digit after the decimal should be shown.
        This will round the output.


        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age); */

        //Compound interest calculator.

        /* Scanner scanner = new Scanner(System.in);

        double A;
        double P;
        double r;
        double n;
        double t;
        double Earned;
        String currency;

        System.out.println("Hello, welcome to the compound interest calculator.");

        System.out.print("What currency is your money in? : ");
        currency = scanner.nextLine();

        System.out.print("What is your initial balance (P)? : ");
        P = scanner.nextDouble();

        System.out.print("What is your interest rate (r)? : ");
        r = scanner.nextDouble();

        System.out.print("How frequent does your interest compound (n)? : " );
        n = scanner.nextDouble();

        System.out.print("How much time have your money been borrowed for (t)? : ");
        t = scanner.nextDouble();

        A = P * Math.pow((1 + (r / 100)/n), n * t);

        System.out.printf("Your compound interest %.1f years is: %s%.2f\n", t, currency, A);

        Earned = A - P;

        System.out.printf("So, the total amount of money you earned = %s%.1f", currency, Earned);

        scanner.close(); */


        // Nested if statements

        /* Scanner scanner = new Scanner(System.in);

        boolean isStudent;
        boolean isSenior;
        double price = 9.99;

        System.out.print("Are you a student? (true/false): ");
        isStudent = scanner.nextBoolean();

        System.out.print("Are you a senior? (true/false): ");
        isSenior = scanner.nextBoolean();

        if (isStudent){
            if (isSenior){
                System.out.println("You get a senior discount of 20% and a student discount of 10%" );
                System.out.println("Your total discount is 30%");
                price *= 0.7;
            } else {
                System.out.println("You get a student discount of 10%");
                price *= 0.9;
            }

        } else {
            if(isSenior){
                System.out.println("You get a senior discount of 20%");
                price *= 0.8;
            }
            else {
                price *= 1;
            }
        }

        System.out.printf("The price of the ticket is: $%.2f", price);

        scanner.close(); */

        // Few useful string methods:

        /* String name = "Ishant" ;

        // int length = name.length();
        //char letter = name.charAt(4);
        // shows the character at that point in the string. The first character starts at point 0.
        //int index = name.indexOf("n");
        //int lastIndex = name.lastIndexOf("a");

        // name = name.toUpperCase();
        // name = name.toLowerCase();
        // name = name.trim();
        // name = name.replace("a", "o");

        /*if (name.isEmpty()){
            System.out.println("Your name is empty");
        } else {
            System.out.println("Hello, " + name);
        }


        if (name.contains(" ")){
            System.out.println("Your name contains spaces");
        } else{
            System.out.println("Your name does not contain spaces");
        }

        if(name.equalsIgnoreCase("password")){
            System.out.println("Your name cannot be password");
        } else{
            System.out.println("Hello, " + name);
        } */


        // How .substrings work
        /* Scanner scanner = new Scanner(System.in);

        String email;


        System.out.print("Enter you email: ");
        email = scanner.nextLine();

        String username = email.substring(0, email.indexOf("@"));
        String domain = email.substring(email.indexOf("@") + 1);

        System.out.println("Your username is: " + username);
        System.out.println("Your domain is: " + domain);

        scanner.close(); */

        //Weight Conversion Program

        /* Scanner scanner = new Scanner(System.in);

        double lbs;
        double kgs;
        int choice;

        System.out.println("Hello, please select one of the two options by typing the option number:");
        System.out.println("1: Convert lbs to kgs.");
        System.out.println("2: Convert kgs to lbs.");
        System.out.print("Please choose which converter you want to use (1/2): ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Please enter the weight in lbs: ");
            lbs = scanner.nextDouble();
            System.out.printf("The weight in lbs is %.2flbs\n", lbs);

            kgs = 0.453592 * lbs;

            System.out.printf("The weight in kgs is %.2fkgs", kgs);
        } else if (choice == 2) {
            System.out.print("Please enter the weight in kgs: ");
            kgs = scanner.nextDouble();
            System.out.printf("The weight in kgs is %.2flbs\n", kgs);

            lbs = kgs / 0.453592;

            System.out.printf("The weight in lbs is %.2flbs", lbs);
        } else {
            System.out.println("Not a valid option");
        }
        scanner.close(); */


        //ternary operator
        // variable = (condition) ? ifTrue : ifFalse;    This is the general formula of this operator

        /* int score = 69;

        String PassOrFail = (score >= 60) ? "Pass" : "Fail";

        System.out.println(PassOrFail); */

        //Temperature Conversion Program

        /* Scanner scanner = new Scanner(System.in);

        double Celsius;
        double Fahrenheit;
        int choice;


        System.out.println("1: Celsius to Fahrenheit");
        System.out.println("2: Fahrenheit to Celsius");
        System.out.print("Please choose a converter (1/2) : ");
        choice = scanner.nextInt();

        if (choice == 1){
            System.out.print("Enter the temperature in Celsius: ");
            Celsius = scanner.nextDouble();

            Fahrenheit = (Celsius * 1.8) + 32;

            System.out.printf("The temperature in Fahrenheit is: %.2fF", Fahrenheit);
        } else if (choice == 2 ){
            System.out.print("Enter the temperature in Fahrenheit: ");
            Fahrenheit = scanner.nextDouble();

            Celsius = (Fahrenheit - 32) / 1.8;

            System.out.printf("The temperature in Celsius is: %.2fC", Celsius);
        } else {
            System.out.println("Not a valid option");
        }
        scanner.close(); */


        //Enhanced Switches

        /* Scanner scanner = new Scanner(System.in);

       String day;

        System.out.print("Enter the day of the week: ");
        day = scanner.nextLine();

        day = day.toLowerCase();

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("It is a weekday");
            case "saturday", "sunday" ->
                    System.out.println("It is the weekend");
            default ->
                    System.out.println(day + " is not a day");
        }

        scanner.close(); */

        //Calculator Program

        /* Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        switch(operator){
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("You cannot divide by zero");
                    validOperation = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Not a valid operator");
                validOperation = false;
            }
        }
        if (validOperation) {
            System.out.println("The answer is: " + result);
        }
        scanner.close(); */

        //Logical Operators

        /*&& -> AND
        // Use this in an if statement multiple times if needed, depends on the conditions.
        //|| -> OR
        // Only one of the conditions needs to be true
        //! -> NOT */

        /* Scanner scanner = new Scanner(System.in);

        String username;

        System.out.println("Enter your username:");
        username = scanner.nextLine();

        if (username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4 and 12 characters.");
        }
        else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces and underscores");
        }
        else{
            System.out.println("Welcome " + username);
        }

        scanner.close(); */

        //While Loops
        /* Scanner scanner = new Scanner(System.in);
        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game");
            System.out.print("Press Q to exit: ");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");
        scanner.close(); */

        /* Scanner scanner = new Scanner(System.in);

        int number = 0;

        do{
            System.out.println("Enter a number from 1 and 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);

        scanner.close(); */

        //Random Number Guessing Game
        /*Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        int guess;
        int attempts = 0;
        int randomNumber;
        int max;
        int min;

        System.out.print("Set a minimum value: ");
        min = scanner.nextInt();
        System.out.print("Set a maximum value: ");
        max = scanner.nextInt();
        System.out.printf("Now you will try and guess an integer between %d and %d\n", min, max);
        randomNumber = random.nextInt(min, max + 1);

        System.out.printf("Enter your guess between %d and %d: ", min, max);

        do{
            System.out.printf("Enter your guess between %d and %d: ", min, max);
            guess = scanner.nextInt();
            attempts++;

            if(guess > randomNumber){
                System.out.println("Your guess is too high.");
            } else if (guess < randomNumber) {
                    System.out.println("Your guess is too low.");
            }
            else{
                System.out.println("You have guessed the number correctly.");
                System.out.println("It took you " + attempts + " attempts");
            }
        }while(guess != randomNumber);
        scanner.close(); */

        //for loop = same as while loop but executes code CERTAIN amount of times
        /*
        There are three statements in the for loop:
        First is a counter to count how many times the loop is used, called a loop control variable.
        Second is when the loop should stop.
        Third is how many should the loop control variable increase or decrease after the loop has been used once.
         */
        /*for(int i = 0; i <= 50; i+=5){
            System.out.println(i);
        }*/

        //break = used to break out of a loop
        //continue = skip current iteration of the loop

        //nested loops
        // mini porject - creating a matrix of a symbol with desired rows and columns.
        /* Scanner scanner = new Scanner(System.in);

        int Rows;
        int Columns;
        char Symbol;
        int i;
        int j;

        System.out.print("Set the number of rows: ");
        Rows = scanner.nextInt();
        System.out.print("Set the number of columns: ");
        Columns = scanner.nextInt();
        System.out.print("Enter the character you want displayed: ");
        Symbol = scanner.next().charAt(0);

        for(i = 1; i <= Columns; i++){
            for(j = 1; j <= Rows; j++) {
                System.out.print(Symbol + " ");
            }
            System.out.println();
        }
        scanner.close(); */

        //overloaded methods

        //methods share same name, different parameters, so forms a unique signature = name + parameters.

        /*
        System.out.println(add(1, 2, 3));
        */

        // Variable Scope
        /*
        int x = 1; //Local scope, which means its inside the method where its made.
        If I wrote 'static int x = 3' outside the static void, but inside the main class,
        then it would have the class scope.
        Java uses local scopes over class scopes.
         */

        // Banking Program

        /*Declare Variables
        double balance = 0;
        boolean isRunning = true;
        int choice;


        //Display menu
        while(isRunning) {
            System.out.println("Welcome to the banking program");
            System.out.println();
            System.out.println("Choose an option:");
            System.out.println("1: Show Balance");
            System.out.println("2: Deposit");
            System.out.println("3: Withdraw");
            System.out.println("4: Exit");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            //Get and process user's choice

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> {
                    balance = balance + deposit();
                    System.out.printf("Your new balance is: $%.3f", balance);
                    System.out.println();
                }
                case 3 -> {
                    balance -= withdrawal(balance);
                    System.out.printf("Your new balance is: $%.3f", balance);
                    System.out.println();
                }
                case 4 -> {
                    isRunning = false;
                    System.out.println("You have exited the banking program");
                }
                default -> System.out.println("Not a valid option");
            }
        }

        // showbalance()

        //deposit()

        //withdraw()

        //exit message


        scanner.close(); */

        //Dice Roll Program
        /*
        Going to roll three dice.
        Then going to show the result of each dice
        then going to take the sum of the result
         */
        /*Random random = new Random();

      int numOfDice;
      int total = 0;

        System.out.print("How many dice do you want to roll? : ");
        numOfDice = scanner.nextInt();

       if(numOfDice > 0){

           for (int i = 1; i <= numOfDice; i++){
               int roll = random.nextInt(1,7);
               System.out.println("You rolled: " + roll);

               total += roll;
               System.out.println("Your total amount is: " + total);
           }

       }else{
           System.out.println("Number of dice must be greater than zero");
       }

        scanner.close();*/

        //varargs -> Stands for variable arguments

        /*
        System.out.println(average());
        */

        //Creating a telephone pad

        /* char[][] telephone = {{'1', '2', '3'},
                              {'4', '5','6'},
                              {'7','8', '9'},
                              {'*', '0', '#'}};

        for(char[] keys : telephone ){
            for(char key : keys){
                System.out.print(key + " ");
            }
            System.out.println();
        }*/

        //Rock Paper Scissors Game

        /* Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};
        String playerchoice;
        String computerchoice;
        String playagain = "yes";
        boolean isRunning = true;

        do {

            System.out.print("Enter your move (Rock/Paper/Scissors) : ");
            playerchoice = scanner.nextLine().toLowerCase();

            if (!playerchoice.equals("rock") && !playerchoice.equals("paper") && !playerchoice.equals("scissors")) {
                System.out.println("Invalid Choice");
                continue;
            }

            computerchoice = choices[random.nextInt(3)];
            System.out.println("Computer choice: " + computerchoice);

            if (playerchoice.equals(computerchoice)) {
                System.out.println("It is a tie");
            } else if ((playerchoice.equals("rock") && computerchoice.equals("scissors")) ||
                    (playerchoice.equals("paper") && computerchoice.equals("rock")) ||
                    (playerchoice.equals("scissors") && computerchoice.equals("paper"))) {
                System.out.println("You win");
            } else if ((playerchoice.equals("scissors") && computerchoice.equals("rock")) ||
                    (playerchoice.equals("rock") && computerchoice.equals("paper")) ||
                    (playerchoice.equals("paper") && computerchoice.equals("scissors"))) {
                System.out.println("You lose");
            }

            do {
                System.out.print("Do you want to play again? (Yes/No) : ");
                playagain = scanner.nextLine().toLowerCase();

                switch (playagain) {
                    case "yes" -> isRunning = true;
                    case "no" -> {
                        isRunning = false;
                        System.out.println("Thank you for playing");
                    }
                    default -> System.out.println("Invalid response");
                }
            } while(!playagain.equals("yes") && !playagain.equals("no"));
        } while(isRunning);
        scanner.close(); */

        //Objects = an entity that can hold data and performs actions.

        // Constructor: A special method to initialize objects

        /* Car car1 = new Car("Ford", "Mustang", 2025, 58000.99);
        Car car2 = new Car("Nissan", "GTR", 2025, 60100.5);

        System.out.println("Your car is a " + car1.make);
        System.out.println(car2.model);
        System.out.println(car1.isRunning);

        car1.isDriving();
        car2.isDriving(); */

        //Overloaded Constructors

        /* User user1 = new User("SurgeBro");
        User user2 = new User("IVI", "ivi0095@gmail.com", 12);
        User user3 = new User();

        System.out.println(user1.username);
        System.out.println(user1.age);
        System.out.println(user2.username);
        System.out.println(user2.age);
        System.out.println(user3.username); */

        //Array Of Objects

        //This is the same code using the 'Car' file used in the 'constructor' heading.

        /* Car car1 = new Car("Ford", "Mustang", 2025, 58000.99);
        Car car2 = new Car("Nissan", "GTR", 2025, 60100.5);
        Car car3 = new Car("Bugatti", "Chiron", 2025, 120000);

        Car[] cars = {
                new Car("Ford", "Mustang"),
                new Car("Nissan", "GTR"),
                new Car("Bugatti", "Chiron")};

        for(Car car : cars){
            car.isDriving();
        }*/

        //Static: Keyword that makes a variable or method belong to the class rather than a specific object.
        //Using the 'User' file used in the 'Overloaded Constructors' heading.

        /*User user1 = new User("SurgeBro");
        User user2 = new User("IVI");
        User user3 = new User("Idk");

       User.showUsers(); */


        //Inheritance

        /*
        one class can inherit attributes from another class.
         */

        //   'Super' keyword -> a child class is called a sub class and a parent is called a super class.

         /* Dog dog = new Dog(true, "very happy", false, "treats");

                System.out.println(dog.isAlive);
                dog.eat();
                System.out.println(dog.lives);
                dog.mood(dog.mood);
                dog.eating(false, dog.food);*/

        //Method Overriding

        /* Cat cat = new Cat(true);
        Fish fish = new Fish(true);

        cat.move();
        fish.move();*/

        //  toString Method -> Method inherited from Object class, and used to return a string representation of an object
        // By default, it returns a hashcode as a unique identifier, and can be overridden to get meaningful details

        /* Car car1 = new Car("Ford", "Mustang", 2025, "Red");
        Car car2 = new Car("Bugatti", "Chiron", 2024, "Black");

        System.out.println(car1);
        System.out.println(car2); */

        //Abstraction - hiding implementation details and only showing essential features

        /* Circle circle = new Circle(2);

        System.out.println("The area of the circle is: " + circle.area());

        Triangle triangle = new Triangle(3, 5);

        System.out.println("The area of the triangle is: " + triangle.area()); */

        //Interfaces
        /*
        Basically instead of creating a class, select interface.
        Use 'implement' instead of 'extends'
        Then these interfaces act as parent classes, and there can be children that can inherit methods from the parents.
        The main difference is that the children can inherit multiple parents, but they MUST contain all the parent methods.
        */

        //Polymorphism - Objects can identify as other objects

        /* Shapes[] shapes = {new Circle(2), new Triangle(2,5)};

        for(Shapes shape : shapes){
            double area = shape.area();
            System.out.println("Area: " + area);
        } */

        //Runtime Polymorphism - polymorphism but the object is decided at runtime.

        /*int choice;
        Animal animal;

        while(true) {
            System.out.print("Would you like a dog, cat or fish? (dog = 1, cat = 2, fish = 3) : ");
            choice = scanner.nextInt();

                while (choice == 1 || choice == 2 || choice == 3) {

                    switch (choice) {
                        case 1 -> {
                            animal = new Dog();
                            animal.speak();
                            scanner.close();
                            return;
                        }
                        case 2 -> {
                            animal = new Cat();
                            animal.speak();
                            scanner.close();
                            return;
                        }
                        case 3 -> {
                            animal = new Fish();
                            animal.speak();
                            scanner.close();
                            return;
                        }
                        default -> {
                            System.out.println("Invalid response");
                        }
                    }
                }
        }*/

        //Getters and Setters - Getters make a field readable and setters make a field writable.

        /* Car car = new Car("Red", "Bugatti", "Chiron", 2025, 200000);

        car.setColor("Black");

        System.out.println(car.getColor() + " " + car.getYear() + " " + car.getMake() + " " + car.getModel()); */

        //Aggregation - One object can contain one or more other objects, but each contained object is independent.

        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(4);
        Circle circle3 = new Circle(5);

        Circle[] circles = {circle1, circle2, circle3};

        Shapes shapes = new Shapes();



    }
    static void showBalance(double balance){
        System.out.println();
        System.out.printf("$%.3f\n", balance);
    }
    static double deposit(){

        double amount;

        System.out.print("Enter the amount to be deposited: ");
        amount = scanner.nextDouble();

        if(amount < 0 ){
            System.out.println("Invalid Amount");
            return 0;
        } else{
            return amount;
        }

    }
    static double withdrawal(double balance){
        double amount;

        System.out.print("Enter the amount you want to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Invalid Withdrawal");
            return 0;
        }else if(amount < 0){
            System.out.println("Invalid Withdrawal");
            return 0;
        } else{
            return amount;
        }
    }
    static double average(double... numbers){
        double average = 0;
        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        average = sum / numbers.length;

        return average;


    }

}

