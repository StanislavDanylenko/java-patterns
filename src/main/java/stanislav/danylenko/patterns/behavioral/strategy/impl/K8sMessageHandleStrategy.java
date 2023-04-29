package stanislav.danylenko.patterns.behavioral.strategy.impl;

import stanislav.danylenko.patterns.behavioral.strategy.MessageHandleStrategy;
import stanislav.danylenko.patterns.behavioral.strategy.obj.ActionMessage;

public class K8sMessageHandleStrategy implements MessageHandleStrategy {

    @Override
    public String process(ActionMessage actionMessage) {
        return "[K8S] Do something: " + actionMessage.action();
    }

}
