package design.patterns.behavioral.state;

public class JumpingMovementState extends BaseMovementState {

    protected JumpingMovementState(PlayerContext playerContext) {
        super(playerContext);
    }

    @Override
    public void jump() {
        // Do nothing
    }

    @Override
    public void crouch() {
        // Do nothing
    }

    @Override
    public void run() {
        // Do nothing
    }
}
