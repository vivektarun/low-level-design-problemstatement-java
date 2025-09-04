package creational.abstractFactory.UIToolKitQuestion.products.dropdown;

public class LinuxDropDown implements DropDown{
    @Override
    public void render() {
        System.out.println("Linux button rendered");
    }

    @Override
    public void onClick() {
        System.out.println("Linux button clicked");
    }
}
