package factory.notification;

public class NotificationService {
    public void send(String name){
        Notification notification = NotificationFactory.getNotification(name);
        notification.send();
    }
}
