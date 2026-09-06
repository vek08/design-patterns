package factory.zoo;

public class AnimalService {
    public void send(String name){
        Animal animal = AnimalFactory.getAnimal(name);
        animal.sound();
    }
}
