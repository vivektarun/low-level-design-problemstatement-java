package creational.FactoryPattern.Factory;

import creational.FactoryPattern.Product.Shape;
import creational.FactoryPattern.Product.Square;

public class SquareCreator extends ShapeFactory{
    @Override
    public Shape createShape() {
        return new Square();
    }
}
