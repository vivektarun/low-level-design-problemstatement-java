package creational.abstractFactory.carQuestion;

import creational.abstractFactory.carQuestion.Factory.CarFactory;
import creational.abstractFactory.carQuestion.Provider.CarFactoryProvider;
import creational.abstractFactory.carQuestion.Type.CarType;

public class CarFactoryClient {
    public static void main(String[] args) {
        System.out.println("----- Abstract Factory Design Pattern");

        //Get Factory Provider
        CarFactoryProvider carFactoryProvider = new CarFactoryProvider();

        //Get Economy factory
        CarFactory economyCar = carFactoryProvider.getFactory(CarType.ECONOMY, "honda");
        economyCar.produceCompleteVehicle();

        //Get Luxury Car Factory
        CarFactory luxuryCar = carFactoryProvider.getFactory(CarType.LUXURY, "Mercedes");
        luxuryCar.produceCompleteVehicle();
    }
}
