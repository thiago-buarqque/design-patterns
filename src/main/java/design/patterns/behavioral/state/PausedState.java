package design.patterns.behavioral.state;

public class PausedState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Resuming the audio.");
        context.setState(new PlayingState(context));
    }

    @Override
    public void pressPause() {
        System.out.println("Already paused.");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping the audio.");
        context.setState(new StoppedState(context));
    }

    private AudioPlayer context;

    public PausedState(AudioPlayer context) {
        this.context = context;
    }
}

