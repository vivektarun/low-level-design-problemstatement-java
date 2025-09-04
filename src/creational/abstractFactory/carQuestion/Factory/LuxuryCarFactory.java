package creational.abstractFactory.carQuestion.Factory;

import creational.abstractFactory.carQuestion.Product.Engine.CarEngine;
import creational.abstractFactory.carQuestion.Product.Engine.LuxuryCarEngine;
import creational.abstractFactory.carQuestion.Product.Exterior.CarExterior;
import creational.abstractFactory.carQuestion.Product.Exterior.LuxuryCarExterior;
import creational.abstractFactory.carQuestion.Product.Interior.CarInterior;
import creational.abstractFactory.carQuestion.Product.Interior.LuxuryCarInterior;
import creational.abstractFactory.carQuestion.Product.Safety.CarSafety;
import creational.abstractFactory.carQuestion.Product.Safety.LuxuryCarSafety;
import creational.abstractFactory.carQuestion.Product.SoundSystem.CarSoundSystem;
import creational.abstractFactory.carQuestion.Product.SoundSystem.LuxuryCarSoundSystem;

public class LuxuryCarFactory implements CarFactory {
    private final String brand;

    public LuxuryCarFactory(String brand) {
        this.brand = brand;
    }

    @Override
    public CarInterior createInterior() {
        return new LuxuryCarInterior();
    }

    @Override
    public CarExterior createExterior() {
        return new LuxuryCarExterior();
    }

    @Override
    public CarSoundSystem createSoundSystem() {
        return new LuxuryCarSoundSystem();
    }

    @Override
    public CarEngine createEngine() {
        return new LuxuryCarEngine();
    }

    @Override
    public CarSafety createSafety() {
        return new LuxuryCarSafety();
    }
}
