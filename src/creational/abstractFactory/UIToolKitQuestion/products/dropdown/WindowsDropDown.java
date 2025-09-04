package creational.abstractFactory.UIToolKitQuestion.products.dropdown;

public class WindowsDropDown implements DropDown{
    @Override
    public void render() {
        System.out.println("windows button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("windows button clicked");
    }
}