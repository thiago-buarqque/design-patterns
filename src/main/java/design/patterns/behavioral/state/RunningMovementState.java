package design.patterns.behavioral.state;

public class RunningMovementState extends BaseMovementState {

    protected RunningMovementState(PlayerContext playerContext) {
        super(playerContext);
    }

    @Override
    public void jump() {
        System.out.println("Jumping, leaving running mode");
        this.playerContext.setMovementState(
                new JumpingMovementState(this.playerContext));
    }

    @Override
    public void crouch() {
        System.out.println("Crouch, leaving running state");
        this.playerContext.setMovementState(
                new CrouchedMovementState(this.playerContext));
    }

    @Override
    public void run() {
        // Do nothing
    }
}
