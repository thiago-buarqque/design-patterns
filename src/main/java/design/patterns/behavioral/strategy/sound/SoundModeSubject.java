package design.patterns.behavioral.strategy.sound;

public interface SoundModeSubject {
    public void attach(SoundLevelObserver observer);
    public void detach(SoundLevelObserver observer);
    public void notifyUpdate();
    public void setSoundMode(SoundMode soundMode);
    public SoundMode getSoundMode();
}
