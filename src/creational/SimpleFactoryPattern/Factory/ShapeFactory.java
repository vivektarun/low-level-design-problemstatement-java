package creational.SimpleFactoryPattern.Factory;

import creational.SimpleFactoryPattern.Product.Circle;
import creational.SimpleFactoryPattern.Product.Rectangle;
import creational.SimpleFactoryPattern.Product.Shape;
import creational.SimpleFactoryPattern.Product.Square;
import creational.SimpleFactoryPattern.Type.ShapeType;

public class ShapeFactory {
    public static Shape createShapeInstance(ShapeType shapeType) {
        if(shapeType == null) return null;

        return switch (shapeType) {
            case CIRCLE -> new Circle();
            case RECTANGLE -> new Rectangle();
            case SQUARE -> new Square();
            default -> throw new IllegalStateException("ShapeType doesn't exits!");
        };
    }
}
