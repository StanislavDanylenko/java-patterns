package stanislav.danylenko.patterns.structural.facade.actions;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction1;
import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction2;
import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction3;
import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction4;
import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction5;

class ComplexActionRunnerFacadeTest {

    private final SomeAction1 someAction1 = mock(SomeAction1.class);
    private final SomeAction2 someAction2 = mock(SomeAction2.class);
    private final SomeAction3 someAction3 = mock(SomeAction3.class);
    private final SomeAction4 someAction4 = mock(SomeAction4.class);
    private final SomeAction5 someAction5 = mock(SomeAction5.class);

    private final ComplexActionRunnerFacade facade = new ComplexActionRunnerFacade(
            someAction1, someAction2, someAction3, someAction4, someAction5);

    @Test
    void executeAction() {
        facade.executeAction();

        verify(someAction1).executeAction();
        verify(someAction2).executeAction();
        verify(someAction3).executeAction();
        verify(someAction4).executeAction();
        verify(someAction5).executeAction();
    }

    @Test
    void stopExecution() {
        facade.stopExecution();

        verify(someAction1).stopExecution();
        verify(someAction2).stopExecution();
        verify(someAction3).stopExecution();
        verify(someAction4).stopExecution();
        verify(someAction5).stopExecution();
    }
}