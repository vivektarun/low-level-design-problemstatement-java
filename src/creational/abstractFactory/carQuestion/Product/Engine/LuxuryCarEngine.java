package creational.abstractFactory.carQuestion.Product.Engine;

public class LuxuryCarEngine implements CarEngine{
    @Override
    public void addEngineComponent() {
        System.out.println("luxury car engine");
    }
}
