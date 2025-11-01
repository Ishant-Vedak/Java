import  java.util.Scanner;
import  java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args){

        //Arrays

        /*String[] fruits = {"apple", "orange", "banana", "coconuts"};

            //fruits[0] = "pineapple";
            //int numOfFruits = fruits.length;
             for(int i = 0; i < fruits.length; i++){
                System.out.println(fruits[i]);
            }
            //Arrays.sort(fruits);
            //Arrays.fill(fruits, "pineapple");

            // Saying that for every 'fruit' in the array of 'fruits', do something
            // so the format is the 'data type', then 'unique identifier', then the name of the array.
            for(String fruit : fruits){
                    System.out.println(fruit);
            }
        */

        //Entering user input into an array

        /* String[] foods;
        //creating a new empty array that has space for three values
        int size;

        System.out.print("What number of food do you want? : ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];

        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter a food:");
            foods[i] = scanner.nextLine();

        }
        System.out.println();

        for(String food : foods){
            System.out.println(food);
        }


        scanner.close(); */

        // Searching an Array

        /* Scanner scanner = new Scanner(System.in);

        int[] numbers = {1, 9, 2, 8, 3,5,4};
        String[] fruits = {"apples", "orange", "banana"};
        String target;
        boolean isFound = false;


        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine();

        for (int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound){
            System.out.println("Element not found in the array");
        }
        scanner.close();*/

        //2d Arrays -> Useful for storing a matrix of data.

        /*
        String[] fruits = {"apple", "banana", "orange"};
        String[] vegetables = {"potato", "onion", "carrot"};
        String[] meats = {"chicken", "fish", "mutton"};

        String[][] groceries = {fruits, vegetables, meats};


        OR

        String[][] groceries = {{"apple", "banana", "orange"},
                                {"potato", "onion", "carrot"}
                                {"chicken", "fish", "mutton"}};

                          They both work the same.


        groceries[0][0] = "pine"; // First bracket is for row, second is for column.
        groceries[1][0] = "Yahho";
        groceries[2][2] = "Celery";

        for(String[] foods : groceries){
            for(String food : foods){
                System.out.print(food + " ");

            }
            System.out.println();
        }*/

        //Array of Objects

    }
}
