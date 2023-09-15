package design.patterns.behavioral.state;

public class PlayingState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Already playing.");
    }

    @Override
    public void pressPause() {
        System.out.println("Pausing the audio.");
        context.setState(new PausedState(this.context));
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping the audio.");
        context.setState(new StoppedState(this.context));
    }

    private AudioPlayer context;

    public PlayingState(AudioPlayer context) {
        this.context = context;
    }
}