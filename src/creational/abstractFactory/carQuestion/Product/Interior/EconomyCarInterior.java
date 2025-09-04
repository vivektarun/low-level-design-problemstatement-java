package creational.abstractFactory.carQuestion.Product.Interior;

public class EconomyCarInterior implements CarInterior{
    @Override
    public void addInteriorComponent() {
        System.out.println("Adding basic interior components for Economy Car.");
    }
}
