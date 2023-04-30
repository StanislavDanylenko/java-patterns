package stanislav.danylenko.patterns.behavioral.state;

@FunctionalInterface
public interface State {
    String handel(StateContext context);
}
