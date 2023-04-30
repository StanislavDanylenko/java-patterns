package stanislav.danylenko.patterns.behavioral.interpreter.impl;

import stanislav.danylenko.patterns.behavioral.interpreter.Expression;

public class ContainsExpression implements Expression {

    private final String data;

    public ContainsExpression(String data){
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        return context.contains(data);
    }
}
