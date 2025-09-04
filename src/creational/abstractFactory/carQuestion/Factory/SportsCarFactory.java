package creational.abstractFactory.carQuestion.Factory;

import creational.abstractFactory.carQuestion.Product.Engine.CarEngine;
import creational.abstractFactory.carQuestion.Product.Engine.SportsCarEngine;
import creational.abstractFactory.carQuestion.Product.Exterior.CarExterior;
import creational.abstractFactory.carQuestion.Product.Exterior.SportsCarExterior;
import creational.abstractFactory.carQuestion.Product.Interior.CarInterior;
import creational.abstractFactory.carQuestion.Product.Interior.SportsCarInterior;
import creational.abstractFactory.carQuestion.Product.Safety.CarSafety;
import creational.abstractFactory.carQuestion.Product.Safety.SportsCarSafety;
import creational.abstractFactory.carQuestion.Product.SoundSystem.CarSoundSystem;
import creational.abstractFactory.carQuestion.Product.SoundSystem.SportsCarSoundSystem;

public class SportsCarFactory implements CarFactory{
    private final String brand;

    public SportsCarFactory(String brand) {
        this.brand = brand;
    }

    @Override
    public CarInterior createInterior() {
        return new SportsCarInterior();
    }

    @Override
    public CarExterior createExterior() {
        return new SportsCarExterior();
    }

    @Override
    public CarSoundSystem createSoundSystem() {
        return new SportsCarSoundSystem();
    }

    @Override
    public CarEngine createEngine() {
        return new SportsCarEngine();
    }

    @Override
    public CarSafety createSafety() {
        return new SportsCarSafety();
    }
}
