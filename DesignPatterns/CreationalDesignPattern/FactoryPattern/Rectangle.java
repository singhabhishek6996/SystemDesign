public class Rectangle implements  Shape{
    private int length;
    public int breadth;

    public Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double area(){
        return length*breadth;
    }

    @Override
    public double circumference(){
        return 2*(length + breadth);
    }
}
