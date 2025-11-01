public class Methods {
    public static void main(String[] args){

        int age = 21;



        if(ageCheck(age)){
            System.out.println("You may sign up");
        }else{
            System.out.println("You must be 18+ to sign up");
        }


    }
    static void testing(int age){
        //Matching set of parameters are needed.
        System.out.println("I am testing methods in Java");
        System.out.printf("I am %d years old", age);
    }
    static double square(double number){
        return number * number;
    }
    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
