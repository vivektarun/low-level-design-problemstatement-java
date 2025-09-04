package creational.abstractFactory.carQuestion.Product.Interior;

public class LuxuryCarInterior implements CarInterior{
    @Override
    public void addInteriorComponent() {
        System.out.println("Adding luxurious interior components for Luxury Car.");
    }
}
