package creational.abstractFactory.carQuestion.Provider;

import creational.abstractFactory.carQuestion.Factory.CarFactory;
import creational.abstractFactory.carQuestion.Factory.EconomyCarFactory;
import creational.abstractFactory.carQuestion.Factory.LuxuryCarFactory;
import creational.abstractFactory.carQuestion.Factory.SportsCarFactory;
import creational.abstractFactory.carQuestion.Type.CarType;

public class CarFactoryProvider {
    public CarFactory getFactory(CarType type, String brand) {
        switch (type) {
            case ECONOMY:
                return new EconomyCarFactory(brand);
            case LUXURY:
                return new LuxuryCarFactory(brand);
            case SPORTS:
                return new SportsCarFactory(brand);
            default:
                throw new IllegalArgumentException("unknown car type:" + type);
        }
    }
}
