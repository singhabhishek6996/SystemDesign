public class ShapeFactory {

    Shape getShape(String input, int x, int y){
        switch (input){
            case "CIRCLE":
                return new Circle(x);
            case "SQUARE":
                return new Square(x);
            case "RECTANGLE":
                return  new Rectangle(x, y);
            default:
                return null;
        }
    }
}
