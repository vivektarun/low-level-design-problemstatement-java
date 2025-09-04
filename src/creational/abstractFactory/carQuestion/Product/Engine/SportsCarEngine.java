package creational.abstractFactory.carQuestion.Product.Engine;

public class SportsCarEngine implements CarEngine{
    @Override
    public void addEngineComponent() {
        System.out.println("sports car engine");
    }
}
