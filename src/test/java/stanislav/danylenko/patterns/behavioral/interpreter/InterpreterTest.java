package stanislav.danylenko.patterns.behavioral.interpreter;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.behavioral.interpreter.impl.AndExpression;
import stanislav.danylenko.patterns.behavioral.interpreter.impl.ContainsExpression;
import stanislav.danylenko.patterns.behavioral.interpreter.impl.OrExpression;

class InterpreterTest {

    @Test
    void interpretContainsExpression() {
        String context = "Hello";
        Expression expression = new ContainsExpression(context);

        boolean hasHello = expression.interpret("Hello");
        assertThat(hasHello).isTrue();

        boolean hasHey = expression.interpret("Hey");
        assertThat(hasHey).isFalse();
    }

    @Test
    void interpretOrExpression() {
        Expression stepan = new ContainsExpression("Stepan");
        Expression taras = new ContainsExpression("Taras");
        Expression isMale = new OrExpression(stepan, taras);

        boolean isMaleStepan = isMale.interpret("Stepan");
        assertThat(isMaleStepan).isTrue();

        boolean isMaleZoya = isMale.interpret("Zoya");
        assertThat(isMaleZoya).isFalse();
    }

    @Test
    void interpretAndExpression() {
        Expression stepan = new ContainsExpression("Stepan");
        Expression zoya = new ContainsExpression("Zoya");
        Expression isPair = new AndExpression(stepan, zoya);

        boolean isPairTrue = isPair.interpret("Stepan Zoya");
        assertThat(isPairTrue).isTrue();

        boolean isPairFalse = isPair.interpret("Taras Zoya");
        assertThat(isPairFalse).isFalse();
    }
}