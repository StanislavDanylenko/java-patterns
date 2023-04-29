package stanislav.danylenko.patterns.behavior.strategy.impl;

import stanislav.danylenko.patterns.behavior.strategy.MessageHandleStrategy;
import stanislav.danylenko.patterns.behavior.strategy.obj.ActionMessage;

public class AwsMessageHandleStrategy implements MessageHandleStrategy {

    @Override
    public String process(ActionMessage actionMessage) {
        return  "[AWS] Do something: "  + actionMessage.action();
    }

}
