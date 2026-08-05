package factory.zoo;

public class Cat implements Animal {
    @Override
    public void sound(){
        System.out.println("Cat->Meow Meow");
    }
}
