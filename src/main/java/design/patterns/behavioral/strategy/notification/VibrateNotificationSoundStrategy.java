package design.patterns.behavioral.strategy.notification;

import design.patterns.behavioral.strategy.Phone;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class VibrateNotificationSoundStrategy extends BaseNotificationSoundStrategy {
    @Override
    protected void sendLockScreenNotification(Notification notification) {
        System.out.println("Sending notification to lock screen. " +
                                   "Current sound state is 'VIBRATE'");
        if (!notificationManager.isCategorySilencedAtLockScreen(
                notification.getCategory())) {
            Phone.wakeUpScreen();

            String iconPath = notification.getIconPath();
            // Show icon

            Phone.vibrate();
        }
    }

    @Override
    protected void sendTopBarNotification(Notification notification) {
        System.out.println("Sending notification to top bar. " +
                                   "Current sound state is 'VIBRATE'");
        if (!notificationManager.isCategorySilencedAtTopBar(
                notification.getCategory())) {

            if (Phone.isScreenAwaken()) {
                Phone.vibrate();

                if (notification.isHighPriority()) {
                    // show popup
                }
            }
        }
    }
}
