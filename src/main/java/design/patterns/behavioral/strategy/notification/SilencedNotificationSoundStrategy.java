package design.patterns.behavioral.strategy.notification;

import design.patterns.behavioral.strategy.Phone;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class SilencedNotificationSoundStrategy extends BaseNotificationSoundStrategy {
    @Override
    protected void sendLockScreenNotification(Notification notification) {
        System.out.println("Sending notification to lock screen. " +
                                   "Current sound state is 'SILENCED'");
        if (!notificationManager.isCategorySilencedAtLockScreen(
                notification.getCategory())) {

            Phone.wakeUpScreen();

            String iconPath = notification.getIconPath();
            // Show icon
        }
    }

    @Override
    protected void sendTopBarNotification(Notification notification) {
        System.out.println("Sending notification to top bar. " +
                                   "Current sound state is 'SILENCED'");
        if (!notificationManager.isCategorySilencedAtTopBar(
                notification.getCategory()) && Phone.isScreenAwaken() &&
                notification.isHighPriority()) {

                // show popup
        }
    }
}
