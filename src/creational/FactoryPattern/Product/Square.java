package creational.FactoryPattern.Product;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("inside square");
    }
}
