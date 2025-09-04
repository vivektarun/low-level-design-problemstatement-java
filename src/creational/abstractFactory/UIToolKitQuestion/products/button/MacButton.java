package creational.abstractFactory.UIToolKitQuestion.products.button;

public class MacButton implements Button{
    @Override
    public void render() {
        System.out.println("mac button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("mac button clicked");
    }
}
