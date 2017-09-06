package task37.task3710.decorators;

import task37.task3710.shapes.Shape;

/**
 * Created by ukr-sustavov on 31.08.2017.
 */
public class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
