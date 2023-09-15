package design.patterns.behavioral.strategy.sound;

import design.patterns.behavioral.strategy.notification.NotificationManager;

import java.util.ArrayList;
import java.util.List;

public class SoundModeManager implements SoundModeSubject {
    private final List<SoundLevelObserver> observers = new ArrayList<>();
    private static SoundModeManager instance;
    private SoundMode soundMode;

    public static SoundModeManager getInstance() {
        if (instance == null) {
            instance = new SoundModeManager();
        }

        return instance;
    }

    private SoundModeManager() {
        this.soundMode = SoundMode.NORMAL;

        this.attach(NotificationManager.getInstance());
        this.notifyUpdate();
    }

    @Override
    public void attach(SoundLevelObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void detach(SoundLevelObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyUpdate() {
        for (SoundLevelObserver observer : this.observers) {
            observer.update(this);
        }
    }

    @Override
    public void setSoundMode(SoundMode soundMode) {
        this.soundMode = soundMode;
        this.notifyUpdate();
    }

    @Override
    public SoundMode getSoundMode() {
        return this.soundMode;
    }
}
