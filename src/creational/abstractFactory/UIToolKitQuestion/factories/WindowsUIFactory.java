package creational.abstractFactory.UIToolKitQuestion.factories;

import creational.abstractFactory.UIToolKitQuestion.products.button.Button;
import creational.abstractFactory.UIToolKitQuestion.products.button.WindowsButton;
import creational.abstractFactory.UIToolKitQuestion.products.checkbox.CheckBox;
import creational.abstractFactory.UIToolKitQuestion.products.checkbox.WindowsCheckBox;
import creational.abstractFactory.UIToolKitQuestion.products.dropdown.DropDown;
import creational.abstractFactory.UIToolKitQuestion.products.dropdown.WindowsDropDown;

public class WindowsUIFactory implements UIFactory{
    private final String model;

    public WindowsUIFactory(String model) {
        this.model = model;
    }

    @Override
    public DropDown createDropBox() {
        return new WindowsDropDown();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBox();
    }

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
