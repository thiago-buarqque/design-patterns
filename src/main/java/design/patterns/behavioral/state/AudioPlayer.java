package design.patterns.behavioral.state;

public class AudioPlayer {
    private State state;

    public AudioPlayer() {
        this.state = new StoppedState(this); // Initial state is stopped
    }

    public void setState(State state) {
        this.state = state;
    }

    public void pressPlay() {
        state.pressPlay();
    }

    public void pressPause() {
        state.pressPause();
    }

    public void pressStop() {
        state.pressStop();
    }
}