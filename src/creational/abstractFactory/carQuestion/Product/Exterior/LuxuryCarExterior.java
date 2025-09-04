package creational.abstractFactory.carQuestion.Product.Exterior;

public class LuxuryCarExterior implements CarExterior{
    @Override
    public void addExteriorComponent() {
        System.out.println("Adding luxurious exterior components for luxury Car.");
    }
}
