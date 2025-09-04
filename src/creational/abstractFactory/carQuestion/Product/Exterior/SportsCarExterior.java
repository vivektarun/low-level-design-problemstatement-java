package creational.abstractFactory.carQuestion.Product.Exterior;

public class SportsCarExterior implements CarExterior{
    @Override
    public void addExteriorComponent() {
        System.out.println("sports car exterior");
    }
}
