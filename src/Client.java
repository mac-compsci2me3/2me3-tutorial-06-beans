public class Client {
    public static void main(String[] args) {

        Shape square = new Square("Red", 5.0);
        Shape circle = new Circle("Blue", 3.0);

        Drawing drawing = Drawing.getInstance();

        drawing.drawShape(square);
        drawing.drawShape(circle);
    }
}
