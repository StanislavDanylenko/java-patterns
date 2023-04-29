package stanislav.danylenko.patterns.behavioral.strategy;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.behavioral.strategy.impl.AwsMessageHandleStrategy;
import stanislav.danylenko.patterns.behavioral.strategy.impl.K8sMessageHandleStrategy;
import stanislav.danylenko.patterns.behavioral.strategy.obj.ActionMessage;
import stanislav.danylenko.patterns.behavioral.strategy.obj.MessageType;

class StrategyTest {

    private final AwsMessageHandleStrategy awsStrategy = new AwsMessageHandleStrategy();
    private final K8sMessageHandleStrategy k8sStrategy = new K8sMessageHandleStrategy();

    private final MessageHandleStrategyContext context = new MessageHandleStrategyContext(awsStrategy, k8sStrategy);

    @Test
    void testK8sStrategy() {
        ActionMessage actionMessage = new ActionMessage("Get Pods", MessageType.K8S);

        String result = context.process(actionMessage);

        assertThat(result).isEqualTo("[K8S] Do something: Get Pods");
    }

    @Test
    void testAwsStrategy() {
        ActionMessage actionMessage = new ActionMessage("Read From SQS", MessageType.AWS);

        String result = context.process(actionMessage);

        assertThat(result).isEqualTo("[AWS] Do something: Read From SQS");
    }

}