package creational.SimpleFactoryPattern;

import creational.SimpleFactoryPattern.Factory.ShapeFactory;
import creational.SimpleFactoryPattern.Product.Shape;
import creational.SimpleFactoryPattern.Type.ShapeType;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        System.out.println("------- Simple Factory design pattern----------");

        //Set the type you want
        ShapeType shapeType = ShapeType.SQUARE;

        //get the shape
        Shape shape = ShapeFactory.createShapeInstance(shapeType);
        shape.draw();
    }
}
