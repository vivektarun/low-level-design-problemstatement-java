package creational.abstractFactory.UIToolKitQuestion;

import creational.abstractFactory.UIToolKitQuestion.factories.LinuxUIFactory;
import creational.abstractFactory.UIToolKitQuestion.factories.MacUIFactory;
import creational.abstractFactory.UIToolKitQuestion.factories.UIFactory;
import creational.abstractFactory.UIToolKitQuestion.factories.WindowsUIFactory;
import creational.abstractFactory.UIToolKitQuestion.provider.UIFactoryProvider;

public class UiToolKitClient {
    public static void main(String[] args) {
        System.out.println("-----Abstract factory for ui-toolkit-----");

        //Get Factory Provider
        UIFactoryProvider uiFactoryProvider = new UIFactoryProvider();

        //Get Windows Factory
        UIFactory asusLaptop = new WindowsUIFactory("asus");
        asusLaptop.produceCompleteUI();

        //Get Linux Factory
        UIFactory ubuntuLaptop = new LinuxUIFactory("ubuntu");
        ubuntuLaptop.produceCompleteUI();

        //Get Mac Factory
        UIFactory macLaptop = new MacUIFactory("macbook-pro");
        ubuntuLaptop.produceCompleteUI();
    }
}
