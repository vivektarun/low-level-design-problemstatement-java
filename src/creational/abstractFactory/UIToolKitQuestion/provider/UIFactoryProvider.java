package creational.abstractFactory.UIToolKitQuestion.provider;

import creational.abstractFactory.UIToolKitQuestion.enums.OsType;
import creational.abstractFactory.UIToolKitQuestion.factories.LinuxUIFactory;
import creational.abstractFactory.UIToolKitQuestion.factories.MacUIFactory;
import creational.abstractFactory.UIToolKitQuestion.factories.UIFactory;
import creational.abstractFactory.UIToolKitQuestion.factories.WindowsUIFactory;

public class UIFactoryProvider {
    public UIFactory uiFactory(OsType osType, String model) {
        switch (osType) {
            case LINUX:
                return new LinuxUIFactory(model);
            case MAC:
                return new MacUIFactory(model);
            case WINDOWS:
                return new WindowsUIFactory(model);
            default:
                throw new IllegalArgumentException("Unknown UI type: " + osType);
        }
    }
}
