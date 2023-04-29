package stanislav.danylenko.patterns.behavior.strategy;

import stanislav.danylenko.patterns.behavior.strategy.obj.ActionMessage;

public interface MessageHandleStrategy {

    String process(ActionMessage actionMessage);

}
