package design.patterns.behavioral.state;

public class WalkingMovementState extends BaseMovementState{

    protected WalkingMovementState(PlayerContext playerContext) {
        super(playerContext);
    }

    @Override
    public void jump() {
        System.out.println("Jumping, leaving walking mode");
        this.playerContext.setMovementState(
                new JumpingMovementState(this.playerContext));
    }

    @Override
    public void crouch() {
        System.out.println("Crouch, leaving walking state");
        this.playerContext.setMovementState(
                new CrouchedMovementState(this.playerContext));
    }

    @Override
    public void run() {
        System.out.println("Run, leaving walking state");
        this.playerContext.setMovementState(
                new RunningMovementState(this.playerContext));
    }
}
