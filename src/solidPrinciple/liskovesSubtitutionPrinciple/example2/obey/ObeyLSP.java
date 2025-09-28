package solidPrinciple.liskovesSubtitutionPrinciple.example2.obey;

class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }
}

class Bicycle extends Vehicle {
}

class EngineVehicle extends Vehicle {
    public Boolean hasEngine() {
        return true;
    }
}
class MotorCycle extends EngineVehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }
}

public class ObeyLSP {
    public static void main(String[] args) {

    }
}
