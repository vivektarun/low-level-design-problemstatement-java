package creational.abstractFactory.carQuestion.Factory;

import creational.abstractFactory.carQuestion.Product.Engine.CarEngine;
import creational.abstractFactory.carQuestion.Product.Engine.EconomyCarEngine;
import creational.abstractFactory.carQuestion.Product.Exterior.CarExterior;
import creational.abstractFactory.carQuestion.Product.Exterior.EconomyCarExterior;
import creational.abstractFactory.carQuestion.Product.Interior.CarInterior;
import creational.abstractFactory.carQuestion.Product.Interior.EconomyCarInterior;
import creational.abstractFactory.carQuestion.Product.Safety.CarSafety;
import creational.abstractFactory.carQuestion.Product.Safety.EconomyCarSafety;
import creational.abstractFactory.carQuestion.Product.SoundSystem.CarSoundSystem;
import creational.abstractFactory.carQuestion.Product.SoundSystem.EconomyCarSoundSystem;

public class EconomyCarFactory implements CarFactory {
    private final String brand;

    public EconomyCarFactory(String brand) {
        this.brand = brand;
    }

    @Override
    public CarInterior createInterior() {
        return new EconomyCarInterior();
    }

    @Override
    public CarExterior createExterior() {
        return new EconomyCarExterior();
    }

    @Override
    public CarSoundSystem createSoundSystem() {
        return new EconomyCarSoundSystem();
    }

    @Override
    public CarEngine createEngine() {
        return new EconomyCarEngine();
    }

    @Override
    public CarSafety createSafety() {
        return new EconomyCarSafety();
    }
}
