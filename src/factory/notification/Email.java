package factory.notification;

public class Email implements Notification{
    @Override
    public void send(){
        System.out.println("Sending Email...");
    }
}
