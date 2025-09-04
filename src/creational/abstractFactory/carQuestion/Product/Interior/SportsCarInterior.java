package creational.abstractFactory.carQuestion.Product.Interior;

public class SportsCarInterior implements CarInterior{
    @Override
    public void addInteriorComponent() {
        System.out.println("sports car interior");
    }
}
