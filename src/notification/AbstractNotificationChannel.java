package notification;

public abstract class AbstractNotificationChannel implements NotifiableChannel {
    public void sendBulkNotification(String content, Iterable<Integer> userIdList) {
        for(Integer userId : userIdList){
            sendNotification(content, userId);
        }
    }
}
