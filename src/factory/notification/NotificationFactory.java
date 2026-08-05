package factory.notification;

public class NotificationFactory {
    public static Notification getNotification(String name){
        if(name.equalsIgnoreCase("email")){
            return new Email();
        }
        else if(name.equalsIgnoreCase("sms")){
            return new SMS();
        }

        throw new IllegalArgumentException("Unknown notification name");
    }
}
