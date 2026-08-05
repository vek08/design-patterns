package factory.carshowroom;

public class CarFactory {
    public BMW getBMW(){
        return new BMW();
    }

    public Audi getAudi(){
        return new Audi();
    }
}
