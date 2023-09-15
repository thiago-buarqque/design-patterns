package design.patterns.behavioral.strategy.notification;

import design.patterns.behavioral.strategy.Phone;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class BaseNotificationSoundStrategy implements NotificationSoundStrategy {
    protected NotificationManager notificationManager = NotificationManager.getInstance();

    @Override
    public void sendNotification(Notification notification) {
        if (Phone.isScreenLocked()) {
            sendLockScreenNotification(notification);
        } else {
            sendTopBarNotification(notification);
        }

        registerNotification(notification);
    }

    private void registerNotification(Notification notification) {
        System.out.println("\n---Registering notification---");
        System.out.printf("Notification title: %s", notification.getTitle());
        System.out.printf("\nNotification content: %s\n\n\n", notification.getContent());
    }

    protected abstract void sendLockScreenNotification(Notification notification);
    protected abstract void sendTopBarNotification(Notification notification);
}
