package creational.FactoryPattern.Factory;

import creational.FactoryPattern.Product.Circle;
import creational.FactoryPattern.Product.Shape;

public class CircleCreator extends ShapeFactory{

    @Override
    public Shape createShape() {
        return new Circle();
    }
}
