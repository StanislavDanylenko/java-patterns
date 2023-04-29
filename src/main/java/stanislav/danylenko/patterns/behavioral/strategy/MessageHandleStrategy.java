package stanislav.danylenko.patterns.behavioral.strategy;

import stanislav.danylenko.patterns.behavioral.strategy.obj.ActionMessage;

public interface MessageHandleStrategy {

    String process(ActionMessage actionMessage);

}
