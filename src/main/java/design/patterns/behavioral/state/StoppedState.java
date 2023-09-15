package design.patterns.behavioral.state;

public class StoppedState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Starting to play the audio.");
        context.setState(new PlayingState(context));
    }

    @Override
    public void pressPause() {
        System.out.println("Cannot pause, audio is stopped.");
    }

    @Override
    public void pressStop() {
        System.out.println("Already stopped.");
    }

    private AudioPlayer context;

    public StoppedState(AudioPlayer context) {
        this.context = context;
    }
}
