package creational.FactoryPattern.Product;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside rectangle");
    }
}
