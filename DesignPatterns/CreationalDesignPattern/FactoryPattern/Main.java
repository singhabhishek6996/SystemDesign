public class Main {
    public static void main(String [] args){
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape = shapeFactory.getShape("SQUARE", 5, 5);
        System.out.println(shape.area());
        System.out.println(shape.circumference());

        shape = shapeFactory.getShape("RECTANGLE", 5, 10);
        System.out.println(shape.area());
        System.out.println(shape.circumference());

        shape = shapeFactory.getShape("CIRCLE", 7, 7);
        System.out.println(shape.area());
        System.out.println(shape.circumference());
    }
}
