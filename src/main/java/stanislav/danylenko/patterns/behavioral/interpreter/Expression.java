package stanislav.danylenko.patterns.behavioral.interpreter;

@FunctionalInterface
public interface Expression {
    boolean interpret(String context);
}
