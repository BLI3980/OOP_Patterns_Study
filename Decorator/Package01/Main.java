package Package01;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redTriangle = new RedShapeDecorator(new Triangle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("\nRegular Circle: ");
        circle.draw();

        System.out.println("\nCircle with red border: ");
        redCircle.draw();

        System.out.println("\nTriangle with red border: ");
        redTriangle.draw();

        System.out.println("\nRectangle with red border: ");
        redRectangle.draw();
    }
}
