package creational.abstractFactory.UIToolKitQuestion.factories;

import creational.abstractFactory.UIToolKitQuestion.products.button.Button;
import creational.abstractFactory.UIToolKitQuestion.products.button.MacButton;
import creational.abstractFactory.UIToolKitQuestion.products.checkbox.CheckBox;
import creational.abstractFactory.UIToolKitQuestion.products.checkbox.MacCheckBox;
import creational.abstractFactory.UIToolKitQuestion.products.dropdown.DropDown;
import creational.abstractFactory.UIToolKitQuestion.products.dropdown.MacDropDown;

public class MacUIFactory implements UIFactory{
    private final String model;
    public MacUIFactory(String model) {
        this.model = model;
    }

    @Override
    public DropDown createDropBox() {
        return new MacDropDown();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacCheckBox();
    }

    @Override
    public Button createButton() {
        return new MacButton();
    }
}
