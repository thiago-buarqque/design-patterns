package design.patterns.behavioral.state;

public class CrouchedMovementState extends BaseMovementState {

    protected CrouchedMovementState(PlayerContext playerContext) {
        super(playerContext);
    }

    @Override
    public void jump() {
        System.out.println("(Jump) Getting up, leaving crouch mode");
        this.playerContext.setMovementState(
                new StandingMovementState(this.playerContext));
    }

    @Override
    public void crouch() {
       // Do nothing
    }

    @Override
    public void run() {
        System.out.println("(Run) Walking crouched, keeping crouch mode");
    }
}
