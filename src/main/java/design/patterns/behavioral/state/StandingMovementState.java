package design.patterns.behavioral.state;

public class StandingMovementState extends BaseMovementState {

    protected StandingMovementState(PlayerContext playerContext) {
        super(playerContext);
    }

    @Override
    public void jump() {
        System.out.println("Jumping, leaving standing mode");
        this.playerContext.setMovementState(
                new JumpingMovementState(this.playerContext));
    }

    @Override
    public void crouch() {
        System.out.println("Crouching, leaving standing mode");
        this.playerContext.setMovementState(
                new CrouchedMovementState(this.playerContext));
    }

    @Override
    public void run() {
        System.out.println("Start running, leaving standing mode");
        this.playerContext.setMovementState(
                new RunningMovementState(this.playerContext));
    }
}
