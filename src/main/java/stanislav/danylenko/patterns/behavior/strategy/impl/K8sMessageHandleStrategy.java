package stanislav.danylenko.patterns.behavior.strategy.impl;

import stanislav.danylenko.patterns.behavior.strategy.MessageHandleStrategy;
import stanislav.danylenko.patterns.behavior.strategy.obj.ActionMessage;

public class K8sMessageHandleStrategy implements MessageHandleStrategy {

    @Override
    public String process(ActionMessage actionMessage) {
        return "[K8S] Do something: " + actionMessage.action();
    }

}
