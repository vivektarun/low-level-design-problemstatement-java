package creational.abstractFactory.UIToolKitQuestion.products.checkbox;

public class MacCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("mac button rendered");
    }

    @Override
    public void onclick() {
        System.out.println("mac button clicked");
    }
}
