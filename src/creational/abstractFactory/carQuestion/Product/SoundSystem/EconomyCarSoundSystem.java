package creational.abstractFactory.carQuestion.Product.SoundSystem;

public class EconomyCarSoundSystem implements CarSoundSystem{
    @Override
    public void addSoundSystemComponent() {
        System.out.println("economy car sound system");
    }
}
