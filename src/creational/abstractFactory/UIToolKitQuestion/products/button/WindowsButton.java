package creational.abstractFactory.UIToolKitQuestion.products.button;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("windows button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("windows button clicked");
    }
}
