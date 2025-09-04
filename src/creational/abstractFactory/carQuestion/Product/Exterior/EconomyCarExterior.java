package creational.abstractFactory.carQuestion.Product.Exterior;

public class EconomyCarExterior implements CarExterior{
    @Override
    public void addExteriorComponent() {
        System.out.println("Adding basic exterior components for Economy Car.");
    }
}
