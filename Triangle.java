public class Triangle extends Shapes{

    private double height;
    private double base;

    public Triangle(double height, double base){
        this.base = base;
        this.height = height;
    }

    @Override
    double area(){
        return (height * base)/2;
    }
}
