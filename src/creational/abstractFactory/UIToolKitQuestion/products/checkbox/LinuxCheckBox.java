package creational.abstractFactory.UIToolKitQuestion.products.checkbox;

public class LinuxCheckBox implements CheckBox{
    @Override
    public void render() {
        System.out.println("linux button rendered");
    }

    @Override
    public void onclick() {
        System.out.println("linux button clicked");
    }
}
