package creational.abstractFactory.carQuestion.Factory;

import creational.abstractFactory.carQuestion.Product.Engine.CarEngine;
import creational.abstractFactory.carQuestion.Product.Exterior.CarExterior;
import creational.abstractFactory.carQuestion.Product.Interior.CarInterior;
import creational.abstractFactory.carQuestion.Product.Safety.CarSafety;
import creational.abstractFactory.carQuestion.Product.SoundSystem.CarSoundSystem;

public interface CarFactory {
    CarInterior createInterior();
    CarExterior createExterior();
    CarSoundSystem createSoundSystem();
    CarSafety createSafety();
    CarEngine createEngine();

    default void produceCompleteVehicle() {
        System.out.println("Starting complete vehicle production...");

        //create all components
        CarInterior interior = createInterior();
        CarExterior exterior = createExterior();
        CarSoundSystem soundSystem = createSoundSystem();
        CarSafety carSafety = createSafety();
        CarEngine carEngine = createEngine();

        //Assemble the vehicle
        interior.addInteriorComponent();
        exterior.addExteriorComponent();
        soundSystem.addSoundSystemComponent();
        carSafety.addSafetyComponent();
        carEngine.addEngineComponent();

        System.out.println("Vehicle production completed!");
    }
}
