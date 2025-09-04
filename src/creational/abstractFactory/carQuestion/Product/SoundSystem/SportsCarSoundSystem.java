package creational.abstractFactory.carQuestion.Product.SoundSystem;

public class SportsCarSoundSystem implements CarSoundSystem{
    @Override
    public void addSoundSystemComponent() {
        System.out.println("sports car sound system");
    }
}
