package creational.abstractFactory.carQuestion.Product.Safety;

public class LuxuryCarSafety implements CarSafety{
    @Override
    public void addSafetyComponent() {
        System.out.println("luxury car safety");
    }
}
