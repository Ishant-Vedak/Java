public class Circle extends Shapes {

    private double radius;

    public Circle( double radius){
        this.radius = radius;
    }


    @Override
    double area(){
        return Math.pow(radius, 2) * Math.PI;
    }

    String displayInfo(){
        return "The radius of this circle is " + this.radius + "and its area is " + area();
    }
}
