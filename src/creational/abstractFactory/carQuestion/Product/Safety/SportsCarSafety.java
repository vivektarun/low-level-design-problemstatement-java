package creational.abstractFactory.carQuestion.Product.Safety;

public class SportsCarSafety implements CarSafety{
    @Override
    public void addSafetyComponent() {
        System.out.println("sports car safety");
    }
}
