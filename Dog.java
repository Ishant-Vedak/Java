public class Dog extends Animal{

    /* int lives = 1;
    String mood;
    boolean isEating = false;
    String food;

    Dog(boolean isAlive, String mood, boolean isEating, String food){
        super(isAlive);
        this.mood = mood;
        this.isEating = false;
        this.food = food;
    }

    void mood(String mood){
        System.out.println("The dog is " + mood);
    }

    void eating(boolean isEating, String food){
        if(isEating){
            System.out.println("The dog is eating " + food);
        } else{
            System.out.println("The dog is not eating");
        }
    } */

    @Override
    void speak(){
        System.out.println("The dog goes woof");
    }
}
