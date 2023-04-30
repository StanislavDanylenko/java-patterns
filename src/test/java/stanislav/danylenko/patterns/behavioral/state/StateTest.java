package stanislav.danylenko.patterns.behavioral.state;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import stanislav.danylenko.patterns.behavioral.state.impl.CompleteState;
import stanislav.danylenko.patterns.behavioral.state.impl.PreparationState;
import stanislav.danylenko.patterns.behavioral.state.impl.ProcessingState;

class StateTest {

    @Test
    void testState() {
        StateContext context = new StateContext("Some file url");

        State preparingState = context.getState();
        String prepared = context.handle();
        assertThat(preparingState).isInstanceOf(PreparationState.class);
        assertThat(prepared).isEqualTo("Prepared");

        State processingState = context.getState();
        String processed = context.handle();
        assertThat(processingState).isInstanceOf(ProcessingState.class);
        assertThat(processed).isEqualTo("Processed");

        State completingState = context.getState();
        String completed = context.handle();
        assertThat(completingState).isInstanceOf(CompleteState.class);
        assertThat(completed).isEqualTo("Completed");
    }
}