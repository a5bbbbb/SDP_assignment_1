package notification;

public class EmailNotification extends AbstractNotificationChannel{

    private String getUserEmailById(Integer userId){
        return "user" + userId + "@mail.com";
    }

    @Override
    public void sendNotification(String content, Integer userId) {
        System.out.println("Sent email notification to email " + getUserEmailById(userId) + " .\n" + content);
    }

}
