public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return 3.14*radius*radius;
    }

    @Override
    public double circumference(){
        return 2*3.14*radius;
    }
}
