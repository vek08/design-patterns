package factory.carshowroom;

public class Main {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        BMW bmw = cf.getBMW();
        bmw.start();
    }
}
