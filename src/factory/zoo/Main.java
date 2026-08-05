package factory.zoo;

public class Main {
    public static void main(String[] args) {
        AnimalService animalService = new AnimalService();
        animalService.send("cat");
    }
}
