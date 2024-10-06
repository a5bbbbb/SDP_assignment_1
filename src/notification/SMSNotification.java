package notification;

public class SMSNotification extends AbstractNotificationChannel{

    private String getUserNumberById(Integer userId){
        return "+7 707 000 0" + (userId/10) + "" + userId%10;
    }

    public void sendNotification(String content, Integer userId) {
        System.out.println("Sent SMS notification to number " + getUserNumberById(userId) + " .\n" + content);
    }
}
