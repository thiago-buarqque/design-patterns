package design.patterns.behavioral.strategy;

public class Phone {
    public static boolean isScreenAwaken() {
        // Add an actual code here to read from the hardware or something
        return true;
    }

    public static void wakeUpScreen() {
        System.out.println("Waking up screen");
    }

    public static void vibrate() {
        System.out.println("Vibrating");
    }

    public static void playSound() {
        System.out.println("Playing notification sound");
        // ... receives sound object and do something to play it
    }

    public static boolean isScreenLocked() {
        return screenLocked;
    }

    public static void setScreenLocked(boolean _screenLocked) {
        if (_screenLocked) {
            System.out.println("Locking screen...");
        } else {
            System.out.println("Unlocking screen...");
        }

        screenLocked = _screenLocked;
    }

    private static boolean screenLocked = false;
}
