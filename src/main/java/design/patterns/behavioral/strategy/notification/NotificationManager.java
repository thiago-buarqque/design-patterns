package design.patterns.behavioral.strategy.notification;

import design.patterns.behavioral.strategy.sound.SoundLevelObserver;
import design.patterns.behavioral.strategy.sound.SoundMode;
import design.patterns.behavioral.strategy.sound.SoundModeSubject;

public class NotificationManager implements SoundLevelObserver {
    private NotificationSoundStrategy strategy;
    private static NotificationManager instance;

    public static NotificationManager getInstance() {
        if (instance == null) {
            instance = new NotificationManager();
        }

        return instance;
    }

    private NotificationManager() {
    }

    @Override
    public void update(SoundModeSubject subject) {
        SoundMode soundMode = subject.getSoundMode();

        if (soundMode.equals(SoundMode.NORMAL)) {
            this.strategy = new NormalNotificationSoundStrategy();
        } else if(soundMode.equals(SoundMode.VIBRATE)) {
            this.strategy = new VibrateNotificationSoundStrategy();
        } else if(soundMode.equals(SoundMode.SILENCE)) {
            this.strategy = new SilencedNotificationSoundStrategy();
        } else {
            // throw error
        }
    }

    public void sendNotification(Notification notification) {
        this.strategy.sendNotification(notification);
    }

    public boolean isCategorySilencedAtTopBar(String category) {
        // code to check it
        return false;
    }

    public boolean isCategorySilencedAtLockScreen(String category) {
        // code to check it
        return false;
    }
}
