package creational.abstractFactory.carQuestion.Product.Engine;

public class EconomyCarEngine implements CarEngine{
    @Override
    public void addEngineComponent() {
        System.out.println("economy car engine");
    }
}
