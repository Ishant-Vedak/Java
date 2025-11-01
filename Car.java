public class Car {

    private String make;
    private final String model; //This means the string is not writable at all
    private int year;
    private double price;
    private String color;
    private boolean isRunning = true;

    Car(String color, String make, String model, int year, double price){
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.isRunning = false;
    }

    String getModel(){
        return this.model;
    }String getMake(){
        return this.make;
    }int getYear(){
        return this.year;
    }String getColor(){
        return this.color;
    }

    void setColor(String color){
        this.color = color;
    }


    Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    Car(String make, String model, int year, String color){
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    @Override
    public String toString(){
        return this.color + " " + this.year + " " + this.make + " " + this.model;
    }
    void isDriving(){
        System.out.println("The " + this.make + " " + this.model + " is driving");
    }
}
