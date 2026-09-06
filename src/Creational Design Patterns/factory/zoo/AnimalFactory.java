package factory.zoo;

public class AnimalFactory {
    public static Animal getAnimal(String name){
        if(name.equalsIgnoreCase("Dog")){
            return new Dog();
        }
        else if(name.equalsIgnoreCase("Cat")){
            return new Cat();
        }
        throw new IllegalArgumentException("Unknown Animal");
    }
}
