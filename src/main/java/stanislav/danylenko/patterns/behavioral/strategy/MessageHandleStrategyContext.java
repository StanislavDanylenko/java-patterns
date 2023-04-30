package stanislav.danylenko.patterns.behavioral.strategy;

import java.util.EnumMap;
import java.util.Map;

import stanislav.danylenko.patterns.behavioral.strategy.obj.ActionMessage;
import stanislav.danylenko.patterns.behavioral.strategy.obj.MessageType;

public class MessageHandleStrategyContext {

    // can be static
    private final Map<MessageType, MessageHandleStrategy> strategies = new EnumMap<>(MessageType.class);

    public MessageHandleStrategyContext(MessageHandleStrategy awsStrategy, MessageHandleStrategy k8sStrategy) {
        strategies.put(MessageType.AWS, awsStrategy);
        strategies.put(MessageType.K8S, k8sStrategy);
    }

    public String process(ActionMessage actionMessage) { // action received for example from SQS
        MessageHandleStrategy messageHandleStrategy = strategies.get(actionMessage.messageType());
        return messageHandleStrategy.process(actionMessage);
    }
}
