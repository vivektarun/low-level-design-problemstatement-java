package creational.abstractFactory.UIToolKitQuestion.products.button;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("linux button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("linux button clicked");
    }
}
