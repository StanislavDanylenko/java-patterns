package stanislav.danylenko.patterns.behavioral.strategy.impl;

import stanislav.danylenko.patterns.behavioral.strategy.MessageHandleStrategy;
import stanislav.danylenko.patterns.behavioral.strategy.obj.ActionMessage;

public class AwsMessageHandleStrategy implements MessageHandleStrategy {

    @Override
    public String process(ActionMessage actionMessage) {
        return  "[AWS] Do something: "  + actionMessage.action();
    }

}
