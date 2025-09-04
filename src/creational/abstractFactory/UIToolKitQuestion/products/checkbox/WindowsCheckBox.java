package creational.abstractFactory.UIToolKitQuestion.products.checkbox;

public class WindowsCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("windows button rendered");
    }

    @Override
    public void onclick() {
        System.out.println("windows button clicked");
    }
}
