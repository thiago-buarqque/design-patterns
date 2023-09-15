package design.patterns.behavioral.strategy.notification;

import design.patterns.behavioral.strategy.Phone;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NormalNotificationSoundStrategy extends BaseNotificationSoundStrategy {
    @Override
    protected void sendLockScreenNotification(Notification notification) {
        System.out.println("Sending notification to lock screen. " +
                                   "Current sound state is 'NORMAL'");
        if (!notificationManager.isCategorySilencedAtLockScreen(
                notification.getCategory())) {

            Phone.wakeUpScreen();

            String iconPath = notification.getIconPath();
            // Show icon

            Phone.vibrate();

            Phone.playSound(); // passes the sound object (I'm lazy to build it)
        }
    }

    @Override
    protected void sendTopBarNotification(Notification notification) {
        System.out.println("Sending notification to top bar. " +
                                  "Current sound state is 'NORMAL'");
        if (!notificationManager.isCategorySilencedAtTopBar(
                notification.getCategory()) && Phone.isScreenAwaken()) {

            Phone.vibrate();

            Phone.playSound(); // passes the sound object (I'm lazy to build it)

            if (notification.isHighPriority()) {
                // show popup
            }
        }
    }
}
