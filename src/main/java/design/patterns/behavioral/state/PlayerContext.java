package design.patterns.behavioral.state;

public class PlayerContext implements MovementState {
    private MovementState movementState = new StandingMovementState(this);

    public void setMovementState(
            MovementState movementState) {
        this.movementState = movementState;
    }

    @Override
    public void jump() {
        this.movementState.jump();
    }

    @Override
    public void crouch() {
        this.movementState.crouch();
    }

    @Override
    public void run() {
        this.movementState.run();
    }
}
