package creational.FactoryPattern;

import creational.FactoryPattern.Factory.CircleCreator;
import creational.FactoryPattern.Factory.RectangleCreator;
import creational.FactoryPattern.Factory.ShapeFactory;
import creational.FactoryPattern.Factory.SquareCreator;
import creational.FactoryPattern.Product.Shape;
import creational.FactoryPattern.Type.ShapeType;

public class FactoryClient {
    public static void main(String[] args) {
        System.out.println("----- Factory method design pattern--------");

        //set the type you want
        ShapeType shapeType = ShapeType.SQUARE;

        //get the shape
        Shape shape = getShapeInstance(shapeType);

        //perform operation
        shape.draw();
    }

    private static Shape getShapeInstance(ShapeType shapeType) {
        Shape shape = null;
        if(shapeType == null) return null;

        switch (shapeType) {
            case CIRCLE:
                ShapeFactory circleCreator = new CircleCreator();
                shape = circleCreator.createShape();
                break;
            case RECTANGLE:
                ShapeFactory rectangleCreator = new RectangleCreator();
                shape = rectangleCreator.createShape();
                break;
            case SQUARE:
                ShapeFactory squareCreator = new SquareCreator();
                shape = squareCreator.createShape();
                break;
            default:
                throw new IllegalStateException("ShapeType doesn't exist.");
        }
        return shape;
    }
}
