package stanislav.danylenko.patterns.behavioral.state.impl;

import java.io.File;

import stanislav.danylenko.patterns.behavioral.state.State;
import stanislav.danylenko.patterns.behavioral.state.StateContext;

public class CompleteState implements State {
    @Override
    public String handel(StateContext context) {
        File outputFile = context.getOutputFile();
        // upload file to some storage
        return "Completed";
    }
}
