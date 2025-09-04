package creational.abstractFactory.carQuestion.Product.SoundSystem;

public class LuxuryCarSoundSystem implements CarSoundSystem{
    @Override
    public void addSoundSystemComponent() {
        System.out.println("luxury car sound system");
    }
}
