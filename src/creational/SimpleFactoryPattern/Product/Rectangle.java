package creational.SimpleFactoryPattern.Product;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside rectangle");
    }
}
