package solidPrinciple.dependencyInversionPrinciple.violate;

interface Keyboard {
    void getSpecifications();
}

interface Mouse {
    void getSpecifications();
}
class WiredKeyboard implements Keyboard {
    @Override
    public void getSpecifications() {

    }
}

class BluetoothKeyboard implements Keyboard {
    @Override
    public void getSpecifications() {

    }
}

class WiredMouse implements Mouse {
    @Override
    public void getSpecifications() {

    }
}

class BluetoothMouse implements Mouse {
    @Override
    public void getSpecifications() {

    }
}

class MacBook {
    private final WiredKeyboard keyboard;
    private final WiredMouse mouse;

    public MacBook(WiredKeyboard wiredKeyboard, WiredMouse wiredMouse) {
        keyboard = wiredKeyboard;
        mouse = wiredMouse;
    }
}

public class ViolateDIP {
    public static void main(String[] args) {
        WiredMouse wiredMouse = new WiredMouse();
        WiredKeyboard wiredKeyboard = new WiredKeyboard();

        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard();
        BluetoothMouse bluetoothMouse = new BluetoothMouse();

        MacBook macBookWithWiredParts = new MacBook(wiredKeyboard, wiredMouse);

        //Now if we want to make a mac with bluetooth mouse and bluetooth keyboard we
        //can't make that because we have very tight coupling
        //So this is bad design.

    }
}
