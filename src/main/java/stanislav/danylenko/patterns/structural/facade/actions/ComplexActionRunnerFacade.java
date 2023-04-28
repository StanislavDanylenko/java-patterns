package stanislav.danylenko.patterns.structural.facade.actions;

import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction1;
import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction2;
import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction3;
import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction4;
import stanislav.danylenko.patterns.structural.facade.actions.components.SomeAction5;

public class ComplexActionRunnerFacade {

    private final SomeAction1 someAction1;
    private final SomeAction2 someAction2;
    private final SomeAction3 someAction3;
    private final SomeAction4 someAction4;
    private final SomeAction5 someAction5;

    public ComplexActionRunnerFacade(
            SomeAction1 someAction1,
            SomeAction2 someAction2,
            SomeAction3 someAction3,
            SomeAction4 someAction4,
            SomeAction5 someAction5) {
        this.someAction1 = someAction1;
        this.someAction2 = someAction2;
        this.someAction3 = someAction3;
        this.someAction4 = someAction4;
        this.someAction5 = someAction5;
    }

    public void executeAction() {
        someAction1.executeAction();
        someAction2.executeAction();
        someAction3.executeAction();
        someAction4.executeAction();
        someAction5.executeAction();
    }

    public void stopExecution() {
        someAction1.stopExecution();
        someAction2.stopExecution();
        someAction3.stopExecution();
        someAction4.stopExecution();
        someAction5.stopExecution();
    }

}
