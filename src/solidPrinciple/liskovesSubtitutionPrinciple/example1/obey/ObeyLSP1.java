package solidPrinciple.liskovesSubtitutionPrinciple.example1.obey;

abstract class Bike {
    //All bikes can do these operations
    public abstract void accelerate();
    public abstract void applyBrake();
}

interface Engine {
    void turnOnEngine();
    void turnOffEngine();
}

class MotorCycle extends Bike implements Engine {
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
        System.out.println("MotorCycle Speed" + this.speed);
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println("MotorCycle Speed: " + this.speed);
    }

    @Override
    public void turnOffEngine() {
        this.isEngineOn = true;
        System.out.println("Engine is Off!");
    }

    @Override
    public void turnOnEngine() {
        this.isEngineOn = false;
        System.out.println("Engine is ON!");
    }
}

class Bicycle extends  Bike {
    String brand;
    Boolean hasGears;
    int speed;

    public Bicycle(String brand, Boolean hasGears, int speed) {
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override
    public void applyBrake() {
        this.speed = this.speed - 5;
        System.out.println("Bicycle Speed" + this.speed);
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10;
        System.out.println("bicycle speed" + this.speed);
    }
}

public class ObeyLSP1 {
    public static void main(String[] args) {
        MotorCycle motorCycle = new MotorCycle("heroHonds", 10);
        Bicycle bicycle = new Bicycle("hercules", true, 10);

        motorCycle.turnOnEngine();
        motorCycle.turnOffEngine();
        motorCycle.applyBrake();
        motorCycle.accelerate();

        bicycle.accelerate();
        bicycle.applyBrake();
    }
}
