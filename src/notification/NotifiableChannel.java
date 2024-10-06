package notification;

public interface NotifiableChannel {
    void sendNotification(String content, Integer userId);
    void sendBulkNotification(String content, Iterable<Integer> userIdList);
}
