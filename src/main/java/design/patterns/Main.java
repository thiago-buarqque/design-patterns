package design.patterns;

import design.patterns.behavioral.strategy.notification.Notification;
import design.patterns.behavioral.strategy.notification.NotificationManager;
import design.patterns.behavioral.strategy.Phone;
import design.patterns.behavioral.strategy.sound.SoundMode;
import design.patterns.behavioral.strategy.sound.SoundModeManager;

public class Main {
    public static void main(String[] args) {
        SoundModeManager soundModeManager = SoundModeManager.getInstance();

        soundModeManager.setSoundMode(SoundMode.NORMAL);

        NotificationManager notificationManager = NotificationManager.getInstance();

        Notification notification = new Notification(
                "games", "You village was attacked", "../path.svg",
                true, "Village master");

        notificationManager.sendNotification(notification);

        soundModeManager.setSoundMode(SoundMode.SILENCE);

        Phone.setScreenLocked(true);

        notificationManager.sendNotification(notification);

        Phone.setScreenLocked(false);

        soundModeManager.setSoundMode(SoundMode.VIBRATE);

        notificationManager.sendNotification(notification);
//        ScreenManager screenManager = ScreenManager.getInstance();
//
//        Position3D defaultPosition = new Position3D(0, 0, 0);
//        GameCharacter archer = new Archer(defaultPosition);
//
//        screenManager.addElement(archer);
//        archer.fire();
//        archer.buff(0.1);
//
//        GameCharacter lumberjack = new Lumberjack(new Position3D(100, 100, 100));
//        screenManager.addElement(lumberjack);
//
//        lumberjack.fire();
//
//        System.out.println("Removing lumberjack from screen...");
//        screenManager.removeElement(lumberjack);
//
//        System.out.println("Trying to throw lumberjack's axe...");
//        lumberjack.fire();
    }
}