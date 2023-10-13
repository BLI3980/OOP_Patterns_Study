package Package01;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    public void setRedBorder(Shape decoratedShape){
        System.out.printf("RedShapeDecorator message: Border color - Red.\n ");
    }
    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
}
