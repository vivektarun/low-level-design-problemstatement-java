package solidPrinciple.liskovesSubtitutionPrinciple.example1.voilates;

//BAD: This design violates LSP
interface Bike {
    void turnOnEngine();
    void turnOffEngine();
    void accelerate();
    void applyBrake();
}

//Subclass of Bike - implements all biek class behaviour
class MotorCycle implements Bike {
    String company;
    boolean isEngineOn;
    int speed;

    public MotorCycle(String company, int speed) {
        this.company = company;
        this.speed = speed;
    }

    @Override
    public void applyBrake() {
        this.speed = this.speed - 5;
        System.out.println("MotorCycle Speed " + this.speed);
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println("Motorcycle Speed" + this.speed);
    }

    @Override
    public void turnOffEngine() {
        this.isEngineOn = false;
        System.out.println("Engine is off");
    }

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true;
        System.out.println("Engine is on");
    }
}

// here lsp principle is violated.
class Bicycle implements Bike {
    String brand;
    boolean hasGears;
    int speed;

    public Bicycle(String brand, Boolean hasGears, int speed) {
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override
    public void applyBrake() {
        this.speed = this.speed - 5;
        System.out.println("Bicycle speed: " + this.speed);
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println("Bicycle speed: " + this.speed);
    }

    @Override
    public void turnOffEngine() {
        throw new AssertionError("Bicycle has no engine!");
    }

    @Override
    public void turnOnEngine() {
        throw new AssertionError("Bicycle has no engine");
    }
}

public class VoilatesLSP1 {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle("heroHonda", 10);
        Bicycle bicycle = new Bicycle("hero", false, 10);

        motorCycle.turnOffEngine();

        //Here error will be thrown so we need to design our code in such a way that
        // it should not violate this rule.
        bicycle.turnOffEngine();
    }
}
