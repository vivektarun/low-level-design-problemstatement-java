package solidPrinciple.liskovesSubtitutionPrinciple.example2.violates;

class Vehicle {
    public Integer getNumberOfWheels() {
        return 2;
    }

    public Boolean hasEngine() {
        return true;
    }
}

class MotorCycle extends Vehicle {
    public String getSpecification() {
        return "MotorCycle has " + this.getNumberOfWheels() + "Wheels and has engine: " + this.hasEngine();
    }
}

class Car extends Vehicle {
    @Override
    public Integer getNumberOfWheels() {
        return 4;
    }

    public String getSpecifications() {
        return "Car has " + this.getNumberOfWheels() + " wheels and had engine: " + this.hasEngine();
    }
}

//Here this is violating lsp principle.
class Bicycle extends Vehicle {
    @Override
    public Boolean hasEngine() {
        return null;
    }
}

public class  ViolatesLSP {
    public static void main(String[] args) {
        System.out.println("hello world");
    }
}
