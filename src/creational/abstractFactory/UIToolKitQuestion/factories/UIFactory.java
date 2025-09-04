package creational.abstractFactory.UIToolKitQuestion.factories;

import creational.abstractFactory.UIToolKitQuestion.products.button.Button;
import creational.abstractFactory.UIToolKitQuestion.products.checkbox.CheckBox;
import creational.abstractFactory.UIToolKitQuestion.products.dropdown.DropDown;

public interface UIFactory {
    Button createButton();
    CheckBox createCheckBox();
    DropDown createDropBox();

    default void produceCompleteUI() {
        System.out.println("Starting Complete UI Production.");

        //Create all components
        Button button = createButton();
        CheckBox checkBox = createCheckBox();
        DropDown dropDown = createDropBox();

        //Assemble the UI.
        button.onClick();
        button.render();
        checkBox.onclick();
        checkBox.render();
        dropDown.onClick();
        dropDown.render();

        System.out.println("UI production completed!");
    }
}
