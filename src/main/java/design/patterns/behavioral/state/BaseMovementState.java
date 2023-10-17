package design.patterns.behavioral.state;

public abstract class BaseMovementState implements MovementState {
    protected PlayerContext playerContext;

    protected BaseMovementState(PlayerContext playerContext) {
        this.playerContext = playerContext;
    }
}
