package creational.abstractFactory.UIToolKitQuestion.factories;

import creational.abstractFactory.UIToolKitQuestion.products.button.Button;
import creational.abstractFactory.UIToolKitQuestion.products.button.LinuxButton;
import creational.abstractFactory.UIToolKitQuestion.products.checkbox.CheckBox;
import creational.abstractFactory.UIToolKitQuestion.products.checkbox.LinuxCheckBox;
import creational.abstractFactory.UIToolKitQuestion.products.dropdown.DropDown;
import creational.abstractFactory.UIToolKitQuestion.products.dropdown.LinuxDropDown;

public class LinuxUIFactory implements UIFactory{
    private final String model;

    public LinuxUIFactory(String model) {
        this.model = model;
    }

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LinuxCheckBox();
    }

    @Override
    public DropDown createDropBox() {
        return new LinuxDropDown();
    }
}
