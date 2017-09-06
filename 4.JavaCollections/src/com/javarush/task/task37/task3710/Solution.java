package task37.task3710;

import task37.task3710.decorators.RedShapeDecorator;
import task37.task3710.shapes.Circle;
import task37.task3710.shapes.Rectangle;
import task37.task3710.shapes.Shape;

/**
 * Created by ukr-sustavov on 31.08.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Simple circle");
        circle.draw();

        System.out.println("\nApplied RedShapeDecorator to the circle");
        redCircle.draw();

        System.out.println("\nApplied RedShapeDecorator to the rectangle");
        redRectangle.draw();
    }
}
