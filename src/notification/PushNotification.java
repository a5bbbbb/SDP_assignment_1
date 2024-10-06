package notification;

public class PushNotification extends AbstractNotificationChannel{

    public void sendNotification(String content, Integer userId) {
        System.out.println("Sent Push notification to user with id " + userId + " .\n" + content);
    }
}
