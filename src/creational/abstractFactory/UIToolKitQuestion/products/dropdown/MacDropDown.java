package creational.abstractFactory.UIToolKitQuestion.products.dropdown;

public class MacDropDown implements DropDown{
    @Override
    public void render() {
        System.out.println("mac button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("mac button clicked");
    }
}
