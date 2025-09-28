package solidPrinciple.dependencyInversionPrinciple.obey;

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
    private final Keyboard keyboard;
    private final Mouse mouse;

    public MacBook(Keyboard keyboard, Mouse mouse) {
        this.keyboard = keyboard;
        this.mouse = mouse;
    }
}

public class ObeyDIP {
    public static void main(String[] args) {
        WiredKeyboard wiredKeyboard = new WiredKeyboard();
        WiredMouse wiredMouse = new WiredMouse();
        BluetoothKeyboard bluetoothKeyboard = new BluetoothKeyboard();
        BluetoothMouse bluetoothMouse = new BluetoothMouse();

        //using interface initialization we can achieve both macbooks
        //wired one and wireless one.
        MacBook macBookWithWiredComponents = new MacBook(wiredKeyboard, wiredMouse);
        MacBook macBookWithWirelessComponents = new MacBook(bluetoothKeyboard, bluetoothMouse);
    }
}
