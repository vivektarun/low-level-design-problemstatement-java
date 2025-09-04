package creational.abstractFactory.carQuestion.Product.Safety;

public class EconomyCarSafety implements CarSafety{
    @Override
    public void addSafetyComponent() {
        System.out.println("economy car safety");
    }
}
