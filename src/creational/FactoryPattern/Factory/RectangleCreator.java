package creational.FactoryPattern.Factory;

import creational.FactoryPattern.Product.Rectangle;
import creational.FactoryPattern.Product.Shape;

public class RectangleCreator extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Rectangle();
    }
}
